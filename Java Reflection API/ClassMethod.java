import java.lang.reflect.*;

class ClassMethod {

   public static void main(String[] args) {
    
      ClassMethod ob = new ClassMethod();
      Class c = ob.getClass();

      try {          
         // parameter type is null
         Method m = c.getDeclaredMethod("show");
         System.out.println("method = " + m.toString()); 

         // method Integer
         Class[] data = new Class[1];
         data[0] = Integer.class;
         Method m1 = c.getDeclaredMethod("showInteger", data);
         System.out.println("method = " + m1.toString());

         Class [] data1 = new Class[1];
         data1[0] = Double.class;
         Method m2=c.getDeclaredMethod("showDouble", data1);
         System.out.println("method ="+m2.toString());

      } catch(NoSuchMethodException e) {
         System.out.println(e.toString());
      }
   }

   Integer show() {
      return 1;
   }
    
   void showInteger(Integer i) {
      this.i = i;
   }
   //int i = 78655;
   void showDoublemethod(Double f) {  
      this.f = f;  
   }  
   int i = 10;  
   double f=3.11;  
}  