package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // podaj dane
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość wpłaty: ");
        double payment = scanner.nextDouble();
        System.out.println("Podaj czas inwestycji w miesiącach: ");
        double months = scanner.nextDouble();
        System.out.println("Podaj wielkość miesięcznego oprocentowania: ");
        double procent = scanner.nextDouble();

        // stworz nowy kalkulator fianasowy
        FinancialCalculator financialCalculator = new FinancialCalculator();
        
        double result = financialCalculator.getSavings(payment, months, procent);

        for (Double cash: financialCalculator.getMoneyWithAdding()) {
            int i = 1;
            System.out.println("W miesiącu nr " + i  + " stan konta: " + cash);
        }
        
        System.out.printf("%1.2f", result);

        System.out.println("\n\n--- --- --- \n");

        System.out.println("Zysk bez dodawania wkładu: ");
        double noAddResult = financialCalculator.getSavingsWithoutAddingPayment(payment, months, procent);
        for (Double cash: financialCalculator.getMoneyWithoutAdding()) {
            int i = 1;
            System.out.println("W miesiącu nr " + i  + " stan konta: " + cash);
        }
        System.out.printf("%1.2f", noAddResult);

    }

}
