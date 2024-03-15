class A {
    void show(){
        System.out.println("I a testing ");
    }
}
class B extends A {
    void show(){
        System.out.println("I b testing ");
    }
}
class C extends A {
    void show(){
        System.out.println("I c testing ");
    }
}

class DemoDynamicInheri{
    public static void main(String arg []){
        B b = new B();
        C c = new C();
        A a  = new A();
        a.show();
        a=b;
        a.show();
        a=c;
        a.show();

    }
}