import java.util.Arrays;

class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    int remove() {
        int removed = data[--size];
        return removed;
    }

    int get(int index) {
        return data[index];
    }

    int size() {
        return size;
    }

    void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);
		
		for(int i=0; i<14; i++){
			list.add(2*i);
		}

        System.out.println(list);
    }
}
