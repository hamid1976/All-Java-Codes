public class TryWithMultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Code that might throw different types of exceptions
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]); // This will cause an ArrayIndexOutOfBoundsException
            
            int result = 10 / 0; // This will cause an ArithmeticException
            
            String text = null;
            System.out.println(text.length()); // This will cause a NullPointerException
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + ex);
        } catch (ArithmeticException ex) {
            System.out.println("Caught ArithmeticException: " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Caught NullPointerException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Caught generic Exception: " + ex.getMessage());
        }

        System.out.println("Program continues...");
    }
}
