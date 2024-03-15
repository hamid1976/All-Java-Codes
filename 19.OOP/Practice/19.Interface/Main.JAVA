interface MyInterface {
  
    default void doSomething() {
        System.out.println("Default implementation of doSomething in MyInterface");
    }
	
}
class MyClass implements MyInterface {
    public void someOtherMethod() {
        System.out.println("Some other method in MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

      
        myObject.doSomething(); 

    
        myObject.someOtherMethod();
    }
}
