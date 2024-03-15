 /*Access specifiers are the keywords like "public", "protected",
 "default" and "private" which has its special meaning in 
 java. It defines the access scope of the variable, methods,
 and classes and here the access scope means the area or space
 where a variable or classes or methods are accessible. Types of 
 access specifiers*/
 
 
//package test;
public class TestProtected {
  
  protected static int x = 10;
  protected int y ;
}
//package test;
public class WithinProtected {
      
    public static void main(String[] args) {
      // variables x and y can be accessed within the package
      
      System.out.println("value of x from TestProtected clas = " + TestProtected.x);
      
      TestProtected obj = new TestProtected();
      obj.y= 40;
      //Non static variable's value is displayed
      System.out.println("value of x from TestProtected clas = " + obj.y); 
    }
}
 
 /*package test_2;
import test.TestProtected;
public class OutsidePkgProtected {
  
  public static void main(String[] args) {
    
    // protected variables x and y cannot be accessed outside the package
    // as they are not visible outside the package
    
    // static variable's value is not displayed
    System.out.println("value of x from TestProtected clas = " + TestProtected.x); 
    TestProtected obj = new TestProtected();
    obj.y=20;
    // Non static variable's value is not displayed
    System.out.println("value of x from TestProtected clas = " + obj.y); 
  }
}*/