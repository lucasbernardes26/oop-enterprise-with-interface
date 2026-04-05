package model.services;

public class PaypalService implements OnlinePaymentService {

    //Taxa de pagamento
    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

    //Taxa de juros
    @Override
    public Double interest(Double amount, Integer months) {
        return (amount*0.01) * months;
    }
}
