import java.lang.*;

public class ClassDemo1{

   public static void main(String[] args) {

      try {
         // returns the Class object associated with this class
         Class cls = Class.forName("Sindhiana");

         // returns the ClassLoader object associated with this Class.
         ClassLoader cLoader = cls.getClassLoader();

         if (cLoader == null) {
            System.out.println("The default system class was used.");
         } else {
            // returns the class loader
            Class loaderClass = cLoader.getClass();

            System.out.println("Class associated with ClassLoader = " +
            loaderClass.getName());
         }
      } catch (ClassNotFoundException e) {
         System.out.println(e.toString());
      }
   }
} 