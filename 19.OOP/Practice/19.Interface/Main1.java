interface MyInterface {
  
	static void doSomething() {
        System.out.println("Default implementation of doSomething in MyInterface");
    }
	
}
class MyClass implements MyInterface {
    public void someOtherMethod() {
        System.out.println("Some other method in MyClass");
    }
	// public void doSomething() {
        // System.out.println("Default implementation of doSomething in MyInterface");
    // }
}

public class Main1 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

      
        myObject.doSomething(); 

    
        myObject.someOtherMethod();
    }
}
