package Chapter6;

public class PhoneBillCalculator2 {

    static double overagePrice = 0.25;
    static double taxPrice = 0.15;

    public static void main(String[] args) {

        /*******************
         * PHONEBILL 1
         **********************/
        PhoneBill phoneBill001 = new PhoneBill(001, 82.45, 60, 69);
        double baseCost = phoneBill001.getBaseCost();
        double overage = phoneBill001.calculateOverage(overagePrice);
        double tax = phoneBill001.calculateTax(overage, taxPrice);
        double total = phoneBill001.calculateTotal(overage, tax);

        phoneBill001.printBill(baseCost, overage, tax, total);


        /*******************
         * PHONEBILL 2
         **********************/

        PhoneBill phoneBill222 = new PhoneBill();
        phoneBill222.setID(222);
        phoneBill222.setBaseCost(47);
        phoneBill222.setAllottedMinutes(60);
        phoneBill222.setMinutesUsed(69);

        double overage222 = phoneBill222.calculateOverage(overagePrice);
        double taxAmount222 = phoneBill222.calculateTax(overage222, taxPrice);

        double total222 = phoneBill222.calculateTotal(overage222, taxAmount222);

        phoneBill222.printBill(phoneBill222.getBaseCost(), overage222, taxAmount222, total222);

    }
}
