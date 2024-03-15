public class NestedTryCatchExample{
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try block: Start");

            try {
                // Inner try block
                System.out.println("Inner try block: Start");
                int result = numbers[5]; // Accessing an out-of-bounds index
                System.out.println("Inner try block: End");
            } catch (ArrayIndexOutOfBoundsException innerException) {
                System.out.println("Inner catch block: ArrayIndexOutOfBoundsException");
            }

            System.out.println("Outer try block: End");
        } catch (Exception outerException) {
            System.out.println("Outer catch block: Exception");
        }
    }
}
