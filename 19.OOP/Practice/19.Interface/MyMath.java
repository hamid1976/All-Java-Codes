interface Add {
    default int addMethod(int a, int b) {
        return a + b;
    }
}
interface Multiply extends Add {
    default int multMethod(int a, int b) {
        return a * b;
    }
}
 
class MyMath implements Add, Multiply {
 
}
class Hello extends MyMath{
 
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int total = myMath.addMethod(2, 5);
        int mult = myMath.multMethod(3, 4);
 
        System.out.println("Addition of number is " + total);
        System.out.println("Multiplication of number is " + mult);
    }
 
}