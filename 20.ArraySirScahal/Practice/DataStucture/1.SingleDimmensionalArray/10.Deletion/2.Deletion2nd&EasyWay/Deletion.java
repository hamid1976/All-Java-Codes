
import java.util.*;

public class Deletion {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = ob.nextInt();

        System.out.println("Enter " + size + " Items");
        int data[] = new int[size];

        for (int i = 0; i < data.length; i++) {
            data[i] = ob.nextInt();
        }

        System.out.println("\nTraversing\n");

        for (int i = 0; i < data.length; i++) {
            System.out.println("[" + i + "]=" + data[i]);
        }

        System.out.print("Which Item You Want to Remove\nEnter Location: ");
        int loc = ob.nextInt();

        if (loc < 0 || loc >= data.length) {
            System.out.println("Invalid Location");
        } else {
            int array[] = new int[size];
            int j = 0;

            for (int i = 0; i < data.length; i++) {
                if (i != loc) {
                    array[j] = data[i];
					System.out.println(i);
                    j++;
                }
            }

            System.out.println("\nTraversing after Deletion\n");

            for (int i = 0; i < array.length; i++) {
                System.out.println("[" + i + "]=" + array[i]);
            }

            System.out.println("Item Successfully Deleted");
        }
    }
}
