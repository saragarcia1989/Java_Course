package chapter6;

public class PhoneBill {

    private int ID;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;

    public PhoneBill() {
        ID = 0;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }

    public PhoneBill(int ID) {
        setID(ID);
    }

    public PhoneBill(int ID, double baseCost, double allottedMinutes, double minutesUsed) {
        setID(ID);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(double allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage(double overagePrice) {
        if (minutesUsed <= allottedMinutes) {
            return 0;
        }
        return (minutesUsed - allottedMinutes) * overagePrice;
    }

    public double calculateTax(double overage, double tax) {
        return (baseCost + overage) * tax;
    }

    public double calculateTotal(double overage, double taxAmount) {
        return (baseCost + overage + taxAmount);
    }

    void printBill(double baseCost, double overage, double tax, double total) {

        System.out.println("Phone Bill Statement " + ID + ": " +
                "\n Plan: €" + String.format("%.2f", baseCost)
                + "\n Overage : €" + String.format("%.2f", overage)
                + "\n Tax : €" + String.format("%.2f", tax)
                + "\n Total : €" + String.format("%.2f", total));
    }
}