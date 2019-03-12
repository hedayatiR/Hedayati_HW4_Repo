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
}
