public class MoreNestedTryCatchExample{
    public static void main(String[] args) {
        int[] numbers = {10, 5, 0, 20};

        try {
            // Outer try block
            for (int i = 0; i < numbers.length; i++) {
                try {
                    // Middle try block
                    int result = 100 / numbers[i]; // This can throw ArithmeticException

                    try {
                        // Inner try block
                        System.out.println("Result: " + result);
                        int value = numbers[i + 1]; // This can throw ArrayIndexOutOfBoundsException
                        System.out.println("Next value: " + value);
                    } catch (ArrayIndexOutOfBoundsException innerArrayException) {
                        System.out.println("Inner catch block (ArrayIndexOutOfBoundsException)");
                    }
                } catch (ArithmeticException middleArithmeticException) {
                    System.out.println("Middle catch block (ArithmeticException)");
                }
            }
        } catch (Exception outerException) {
            System.out.println("Outer catch block (Exception)");
        }

        System.out.println("Program finished.");
    }
}
