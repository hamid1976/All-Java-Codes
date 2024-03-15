import java.util.Arrays;

class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }
	
	

    void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    T get(int index) {
        return (T)data[index];
    }

    int size() {
        return size;
    }

    void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

      
		CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
         for(int i=0; i<14; i++){
			 list3.add(2*i);
		 }
        System.out.println(list3);
    }
}
