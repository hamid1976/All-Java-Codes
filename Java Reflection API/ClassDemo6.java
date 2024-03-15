import java.lang.reflect.*;

public class ClassDemo6{

   public static void main(String[] args) {
    
      try {
         ClassDemo6 cls = new ClassDemo6();
         Class c = cls.getClass();

         // constructor with arguments as Double,Long and Integer
         Class[] cArg = new Class[4];
         cArg[0] = Double.class;
         cArg[1] = Long.class;
         cArg[2] = Integer.class;
         cArg[3] = String.class;

         Constructor ct = c.getDeclaredConstructor(cArg);
         System.out.println("Constructor = " + ct.toString());
      } catch(NoSuchMethodException e) {
         System.out.println(e.toString());
      } catch(SecurityException e) {
         System.out.println(e.toString());
      }
   }

   private ClassDemo6() {
      System.out.println("no argument constructor");
   }

    ClassDemo6(Double d, Long l, Integer a, String str) {
      //this.d = d;
      //this.l = l;
      //this.a=a;
   }

   Double d = new Double(3.9d);
   Long l = new Long(7687);
   Integer a=new Integer (70);
   String str=new String("Irfan");
   //int a=new int (10);
}