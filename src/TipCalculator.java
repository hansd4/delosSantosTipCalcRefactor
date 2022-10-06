/* Hans de los Santos
Tip Calculator: Refactored Project
Tip Calculator Class
Periods 5-6 APCSA with Mr. Miller */

public class TipCalculator {
    // instance variables
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;


    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople =  numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return totalBillBeforeTip * ((double) tipPercentage/100);
    }

    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        return totalBill() / numPeople;
    }
}
