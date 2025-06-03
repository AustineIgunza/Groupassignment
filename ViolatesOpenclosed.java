public class ViolatesOpenclosed {
//IT VIOLATES THE OPEN/CLOSED PRINCIPLE BECUASE THE CALCULATE METHOD MUST BE MODIFIED EVERYTIME A NEW DISCOUNT TYPE IS INTRODUCED
    static class Checkout {
        public double calculateTotal(double total, String discountType) {
            if (discountType.equals("none")) {
                return total;
            } else if (discountType.equals("percentage")) {
                return total * 0.9;
            } else if (discountType.equals("bogo")) {
                return total / 2;
            } else {
                return total;
            }
        }
    }

    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        System.out.println("No Discount: " + checkout.calculateTotal(100, "none"));         // 100.0
        System.out.println("10% Discount: " + checkout.calculateTotal(100, "percentage"));  // 90.0
        System.out.println("BOGO Discount: " + checkout.calculateTotal(100, "bogo"));       // 50.0
    }
}

