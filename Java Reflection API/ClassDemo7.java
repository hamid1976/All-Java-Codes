import java.lang.reflect.*;

public class ClassDemo7 {

   public static void main(String[] args) {
    
      try {
         ClassDemo cls = new ClassDemo();
         Class c = cls.getClass();

         // constructor with arguments as Double and Long
         Class[] cArg = new Class[2];
         cArg[0] = Double.class;
         cArg[1] = Long.class;
         Constructor ct = c.getDeclaredConstructor(cArg);
         System.out.println("Constructor = " + ct.toString());
      } catch(NoSuchMethodException e) {
         System.out.println(e.toString());
      } catch(SecurityException e) {
         System.out.println(e.toString());
      }
   }

   private ClassDemo() {
      System.out.println("no argument constructor");
   }

   public ClassDemo(Double d, Long l) {
      this.d = d;
      this.l = l;
   }

   Double d = new Double(3.9d);
   Long l = new Long(7687);
} 
Let us compile and run the above program, this will produce the following result −

no argument constructor
Constructor = public ClassDemo(java.lang.Double,java.lang.Long)