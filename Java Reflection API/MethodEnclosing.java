import java.lang.*;

class MethodEnclosing {

   Object c;

   MethodEnclosing() {
      class ClassDemoA{};
      c = new ClassDemoA();
   }

   public Object ClassObject() {
      class ClassB{};
      return new ClassB( );
   }

   public static void main(String[] args) {
     
      Class cls;
      cls = (new MethodEnclosing()).ClassObject().getClass();

      System.out.print("Method = ");
      System.out.println(cls.getEnclosingMethod());
   }
} 