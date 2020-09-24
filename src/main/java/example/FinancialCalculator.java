package example;

import java.util.ArrayList;
import java.util.List;

public class FinancialCalculator {

    private List<Double> moneyWithAdding;
    private List<Double> moneyWithoutAdding;

    public FinancialCalculator() {
        this.moneyWithAdding = new ArrayList<>();
        this.moneyWithoutAdding = new ArrayList<>();
    }

    public double getSavings(double payment, double months, double procent) {
        double interestRate = 1 + (procent/100);

        double returnMoney = 0;

         List<Double> money = new ArrayList<>();

        for (int i = 0; i < months; i++) {
            returnMoney = (returnMoney + payment) * interestRate;
            this.moneyWithAdding.add(returnMoney);
        }

        return returnMoney;
    }


    public double getSavingsWithoutAddingPayment(double payment, double months, double procent) {
        double interestRate = 1 + (procent/100);
        double returnMoney = payment;

        List<Double> money = new ArrayList<>();

        for (int i = 0; i < months; i++) {
            returnMoney *= interestRate;
            this.moneyWithoutAdding.add(returnMoney);
        }

        return returnMoney;
    }

    public List<Double> getMoneyWithAdding() {
        return moneyWithAdding;
    }

    public List<Double> getMoneyWithoutAdding() {
        return moneyWithoutAdding;
    }
}
