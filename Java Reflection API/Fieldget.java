import java.lang.reflect.*;

class Fieldget {

   public static void main(String[] args) {
 
      Fieldget ob = new Fieldget();
      Class c = ob.getClass();

      System.out.println("Field =");

      try {
         // string field
         Field f = c.getField("string");
         System.out.println("Public field found: " + f.toString());
      } catch(NoSuchFieldException e) {
         System.out.println(e.toString());
      }
   }

   Fieldget() {
      // no argument constructor
   }

   Fieldget(String string) {       
      this.string = string;
   }
    
   public String string = "java";
} 