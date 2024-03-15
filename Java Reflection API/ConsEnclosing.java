import java.lang.*;

class ConsEnclosing {

   Object c;

   ConsEnclosing( ) {
      class ClassA{ };
      c = new ClassA( );
   }

   Object ClassAObject( ) {
      class ClassA{ };
      return new ClassA( );
   }

   public static void main(String[] args) {
     
      Class cls;
      cls = (new ConsEnclosing()).c.getClass();

      System.out.print("getEnclosingConstructor() = ");
      System.out.println(cls.getEnclosingConstructor());
   }
} 