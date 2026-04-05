package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    public void processContract(Contract contract, Integer months){
        OnlinePaymentService ps = new PaypalService();
        
        for (int i = 1; i <= months ; i++) {
            LocalDate newDueDate = contract.getDate().plusMonths(i);

            double partialValue = contract.getTotalValue()/months;

            double partialValueWithInterest = partialValue + ps.interest(partialValue, i);

            double partialValueWithTotalFee = partialValueWithInterest + ps.paymentFee(partialValueWithInterest);

            Installment installment = new Installment(newDueDate, partialValueWithTotalFee);
            contract.addInstallment(installment);

        }
    }
}
