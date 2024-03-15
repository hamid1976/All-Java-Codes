import java.lang.reflect.*;  
public class ClassField {

   long l = 77688;
   int a = 3;
   double b = 2.33; 
   public static void main(String[] args) {

      try {            
         ClassField c = new ClassField();
         Class cls = c.getClass();
       
         // returns the array of Field objects
         Field[] fields = cls.getDeclaredFields();
         for(int i = 0; i < fields.length; i++) {
            System.out.println("Field = " + fields[i].toString());
         }
      } catch(Exception e) {
         System.out.println(e.toString());
      }
   }

   public ClassField() {
      // no argument constructor
   }

   public ClassField(long l, int a, double b) {
      this.l = l;
      this.a = a;
      this.b = b;
   }

}