class A {

    private int i = 1;
    public static int n = 2;
    private static final int x = 3;
    private final int y;

    public A(int i) {
        y = 4 / n;
        this.i = i + y + x;
    }

    public void print() {
        System.out.println(" i = " + i);
    }

    public A() {
        y = 5 * n;
        this.i += y + 5;
    }
}

 class B extends A {
    static int i = 1;

    public B(int i) {
        super(i);
        ++B.i;
        B.i++;
    }

    public B() {
        this(--i);
    }
}


public class Mai3{
    public static void main(String[] args) {

        A a = new A(1);
        a.print();
		
        B b = new B(2);
        b.print();
		
        a.print();
		
		
        A a1 = new B(2*2);
        a1.print();
		
        b.print();
        a.print();
		
		
        A a2 = new A();
        a1.print();
        a2.print();
        B b1 = new B();
        a.print();
        b1.print();
    }
}