import java.lang.reflect.*;

public class ClassgetDeclaring {

   public static void main(String[] args) {

      // class object associated with class Long
     // Class cls = Long.class;
      Class cls=Integer.class;

      Method[] m = cls.getMethods();
      for(int i = 0; i < m.length; i++) {
         
         // returns te declaring class
         Class dec = m[i].getDeclaringClass();
         
         // displays all methods
         System.out.println("Method = " + m[i].toString());
         System.out.println(" Declaring class: " + dec.toString());
      }
   }
} 