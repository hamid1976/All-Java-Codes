class Box<T> {
    
    T feet;
    T inch;
    
    Box(T feet, T inch) {
        this.feet = feet;
        this.inch = inch;
    }
    
    // Modified show method to return a concatenated string
    String show() {
        return feet.toString() + inch.toString();
    }
}

class Main {
    public static void main(String[] args) {
        
        Box<Integer> ob = new Box<>(15, 20);
        System.out.println(ob.show()); // Printing the returned value
        // ob.show(); // No need to call ob.show() again

        Box<String> ob1 = new Box<>("10", "15");
        System.out.println(ob1.show()); // Printing the returned value
        // ob1.show(); // No need to call ob1.show() again
    }
}
