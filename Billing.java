public class Billing {
    public double computeBill(double price) {
        return 1.08*price;
    }
    //------------------------------------------------
    public double computeBill(double price, int count) {
        return ((double)count*computeBill(price));
    }
    //------------------------------------------------
    public double computeBill(double price, int count, double coupon) {
        return computeBill(price, count) - 1.08*coupon;
    }
    //------------------------------------------------
    public static void main(String[] args) {
        Billing bill = new Billing();
        double price = 100;
        int count = 5;
        int coupon = 50;

        // 1 input
        System.out.println("computeBill with price:");
        System.out.println(bill.computeBill(price));
        System.out.println();
        // 2 input
        System.out.println("computeBill with price & count:");
        System.out.println(bill.computeBill(price, count));
        System.out.println();
        // 3 input
        System.out.println("computeBill with price & count & coupon:");
        System.out.println(bill.computeBill(price, count, coupon));
    }
	//------------------------------------------------
}
