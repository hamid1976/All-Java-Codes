public class MultipleTryCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }

        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException ex) {
            System.out.println("Caught ArithmeticException: " + ex.getMessage());
        }

        try {
            String text = null;
            System.out.println(text.length()); // This will cause a NullPointerException
        } catch (NullPointerException ex) {
            System.out.println("Caught NullPointerException: " + ex.getMessage());
        }

        System.out.println("Program continues...");
    }
}
