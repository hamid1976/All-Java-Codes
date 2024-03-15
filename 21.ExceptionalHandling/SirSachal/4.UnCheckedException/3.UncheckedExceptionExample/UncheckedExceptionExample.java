public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // This line will throw an ArrayIndexOutOfBoundsException
            int result = numbers[5];
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e);
        }

        System.out.println("Program continues after the exception handling.");
    }
}
