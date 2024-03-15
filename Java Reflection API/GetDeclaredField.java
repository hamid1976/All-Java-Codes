import java.lang.reflect.*;

class GetDeclaredField {

   public static void main(String[] args) {

     try {            
         GetDeclaredField ob = new GetDeclaredField();
         Class cls = ob.getClass();

         // field long l, int a, double b
         Field f  = cls.getDeclaredField("l");
         Field f1 = cls.getDeclaredField("a");
         Field f2 = cls.getDeclaredField("b");
         //Field f3 = cls.getDeclaredField("Irfan");

         System.out.println("Field = " + f.toString());
         System.out.println("Field = " + f1.toString());
         System.out.println("Field = " + f2.toString());
         //System.out.println("Field = " + f3.toString());

      } catch(Exception e) {
         System.out.println(e.toString());
      }
   }

   long l = 77688;
   int a=202;
   double b= 2.11;
   GetDeclaredField() {
      // no argument constructor
   }

   GetDeclaredField(long l, int a, double b) {
      this.l = l;
      this.a=a;
      this.b=b;
   }

}
