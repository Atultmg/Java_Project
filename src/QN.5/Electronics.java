class Electronics implements Discountable {

    String name;
    double price;

    public Electronics(String name, double price) {
        this.name  = name;
        this.price = price;
    }

    @Override
    public void applyDiscount(double pct) {
        double discountAmount = price * (pct / 100);
        double newPrice       = price - discountAmount;

        System.out.println(name);
        System.out.println("  Original price : $" + price);
        System.out.println("  Discount ("+pct+"%) : -$" + discountAmount);
        System.out.println("  New price      : $" + newPrice);
        System.out.println();

        price = newPrice;
    }
}
