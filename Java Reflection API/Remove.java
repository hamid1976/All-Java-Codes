import java.util.Arrays;
public class Remove
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        int[] arr = {3, 5, 7, 8, 5, 12, 2};
        remove(arr, 2);
        System.out.println(Arrays.toString(arr)); // [3, 7, 8, 5, 12, 2, 0]
    }

    public static void remove(int[] arr, int toRemove) {
        int idx = -1;
        // determine first occurrence of toRemove
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == toRemove) {
                idx = i;
                break;
            }
        }
        // if not found, return
        if(idx == -1) return;
        // shift other elements down
        for(int i = idx; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        // set last element to 0
        arr[arr.length-1] = 0;
    }
}
