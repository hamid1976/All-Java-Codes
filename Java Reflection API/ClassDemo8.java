import java.lang.reflect.*;

public class GetDeclaredFild {

   public static void main(String[] args) {

     try {            
         GetDeclaredFild ob = new GetDeclaredFild();
         Class cls = ob.getClass();

         // field long l
         Field f  = cls.getDeclaredField("l");
         System.out.println("Field = " + f.toString());
      } catch(Exception e) {
         System.out.println(e.toString());
      }
   }

   public GetDeclaredFild() {
      // no argument constructor
   }

   public GetDeclaredFild(long l) {
      this.l = l;
   }

   long l = 77688;
}
