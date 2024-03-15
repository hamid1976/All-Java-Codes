import java.lang.reflect.*;  
 class ClassgetDeclaredMethodExmple1 {  
   public static void main(String[] args) {  
ClassgetDeclaredMethodExmple1 obj = new ClassgetDeclaredMethodExmple1();  
      Class class1 = obj.getClass();  
try {            
         // parameter type is null  
         Method mthd = class1.getDeclaredMethod("showmethod");  
         System.out.println("method  1 = " + mthd.toString());   

         // method Integer  
         Class[] arg = new Class[1];  
         arg[0] = Integer.class;  
         Method mthd1 = class1.getDeclaredMethod("showIntegermethod", arg);  
         System.out.println("method 2 = " + mthd1.toString());

        Class[] arg2 = new Class[1];  
         arg2[0] = double.class;  
         Method mthd3 = class1.getDeclaredMethod("showDoublemethod", arg2);  
           System.out.println("method 3 = " + mthd3.toString()); 

      } catch(NoSuchMethodException e) {  
         System.out.println(e.toString());  //print the exceptio object e  
      }  
   }  
    Integer showmethod() {  
      return 1;  
   }  
    void showIntegermethod(Integer i) {  
      this.i = i;  
   }  
    void showDoublemethod(Double i) {  
      this.f = f;  
   }  
   int i = 10;  
   double f=3.11;  
}  