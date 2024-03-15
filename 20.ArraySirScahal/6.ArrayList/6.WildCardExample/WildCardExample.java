import java.util.Arrays;


//here T should sither be Number or its subclasses
class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    WildCardExample() {
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
        return "WildCardExample{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

      
		WildCardExample<Number> list3 = new WildCardExample<>();
         for(int i=0; i<14; i++){
			 list3.add(2*i);
		 }
        System.out.println(list3);
    }
}
