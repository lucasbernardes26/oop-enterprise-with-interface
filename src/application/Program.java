package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Enter with contract data: =====\n");

        System.out.print("Number of contract:\n>> ");
        int number = sc.nextInt();

        System.out.print("Total value:\n>> ");
        double totalValue = sc.nextDouble();

        System.out.print("Date (dd/mm//yyyy):\n>> ");
        LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Installments quantity:\n>> ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        ContractService cs = new ContractService();
        cs.processContract(contract, installments);


        System.out.println("\n===== INSTALLMENTS =====\n");
        for (Installment i: contract.getInstallments()){
            System.out.println("Installment #" + (contract.getInstallments().indexOf(i)+1));
            System.out.print("Due date: " +  i.getDueDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - ");
            System.out.println("Amount: $ " + String.format("%.2f", i.getAmount()));
        }

        sc.close();
    }
}
