import java.lang.reflect.*;

class Fieldsget {

   public static void main(String[] args) {

      try {
         Class ob = Class.forName("java.awt.Label");
         System.out.println("Fields =");

         // returns the array of Field objects representing the public fields
         Field f[] = ob.getFields();
         for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
         }
      } catch (Exception e) {
         System.out.println("Exception: " + e);
      }
   }
} 