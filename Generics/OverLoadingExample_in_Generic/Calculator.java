class Calc {
    // Declaration of the 'a' variable
    double a;

    // Method to add two values of type T
    <T> void add(T b) {
        // Convert 'b' to a double value before adding and print the result
        System.out.println("Addition of 2 Data Types: " + (a + Double.valueOf(b.toString())));
    }
    
    // Method to add three values of type T
    <T> void add(T b, T c) {
        // Convert 'b' and 'c' to double values before adding and print the result
        System.out.println("Addition of 3 Data Types: " + (a + Double.valueOf(b.toString()) + Double.valueOf(c.toString())));
    }

    // Method to add four values of type T
    <T> void add(T b, T c, T d) {
        // Convert 'b', 'c', and 'd' to double values before adding and print the result
        System.out.println("Addition of 4 Data Types: " + (a + Double.valueOf(b.toString()) + Double.valueOf(c.toString()) + Double.valueOf(d.toString())));
    }
}

class Calculator {
    public static void main(String arg[]) {
        Calc ob = new Calc();
        ob.a = 10; // Setting the value of 'a'
        ob.add(20);
        ob.add(30, 40);
        ob.add(50, 60, 70);
    }
}
