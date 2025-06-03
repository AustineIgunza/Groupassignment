public class OpenclosedPrinciple {
//the following code followed the open/closed principle perfectly
    // Base strategy interface
    interface DiscountStrategy {
        double applyDiscount(double total);
    }

    // No discount
    static class NoDiscount implements DiscountStrategy {
        public double applyDiscount(double total) {
            return total;
        }
    }

    // 10% discount
    static class PercentageDiscount implements DiscountStrategy {
        public double applyDiscount(double total) {
            return total * 0.9;
        }
    }

    // Checkout uses strategy
    static class Checkout {
        private DiscountStrategy discountStrategy;

        public Checkout(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
        }

        public double calculateTotal(double total) {
            return discountStrategy.applyDiscount(total);
        }
    }


    public static void main(String[] args) {
        Checkout checkout1 = new Checkout(new NoDiscount());
        System.out.println("No Discount: " + checkout1.calculateTotal(100));  // Output: 100.0

        Checkout checkout2 = new Checkout(new PercentageDiscount());
        System.out.println("10% Discount: " + checkout2.calculateTotal(100)); // Output: 90.0
    }
}
