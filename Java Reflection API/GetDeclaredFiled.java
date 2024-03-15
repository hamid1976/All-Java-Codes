import java.lang.reflect.*;

public class GetDeclaredField {

   public static void main(String[] args) {

     try {            
         GetDeclaredField ob = new GetDeclaredField();
         Class cls = ob.getClass();

         // field long l
         Field f  = cls.getDeclaredField("l");
         System.out.println("Field = " + f.toString());
      } catch(Exception e) {
         System.out.println(e.toString());
      }
   }

   public GetDeclaredField() {
      // no argument constructor
   }

   public GetDeclaredField(long l) {
      this.l = l;
   }

   long l = 77688;
}
