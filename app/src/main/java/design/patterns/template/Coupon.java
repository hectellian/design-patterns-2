package design.patterns.template;

public class Coupon extends Reward {
    @Override
    public String receive() {
        System.out.println("Coupon received");
        return "Coupon received";
    }

    @Override
    public String claim() {
        System.out.println("Coupon claimed");
        return "Coupon claimed";
    }

    @Override
    public String use() {
        System.out.println("Coupon used on next purchase");
        return "Coupon used on next purchase";
    }
}