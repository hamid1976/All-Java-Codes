public class ExceptionExample{
    public static void main(String[] args) {
        try {
            // Some code that might throw an exception
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
        
        System.out.println("Program continues after the exception."); // This line won't be reached due to the uncaught exception.
    }
}
