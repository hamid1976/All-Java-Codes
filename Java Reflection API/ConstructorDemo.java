import java.lang.reflect.Constructor;  
    class  ConstructorDemo{  

      ConstructorDemo() {  
    }  
  
     ConstructorDemo(int a) {  
    }  
  
     ConstructorDemo(String str) {  
    }  
  
    public static void main(String [] arg) throws NoSuchMethodException {  
        Class<ConstructorDemo> ob = ConstructorDemo.class;  
        Constructor<ConstructorDemo> constrct = ob.getDeclaredConstructor();  
        System.out.println("Constructor with no parameter:"+constrct);  
  
        constrct = ob.getDeclaredConstructor(int.class);  
        System.out.println("Constructor with int as parameter type:"+constrct);  
  
        constrct = ob.getDeclaredConstructor(String.class);  
        System.out.println("Constructor with String as  parameter  type:"+constrct);  
    }  
  
}  