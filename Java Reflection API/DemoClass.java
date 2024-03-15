import java.lang.reflect.*;

enum DemoClass {
   java,
   python,
}

  class DemoClass {

   public static void main(String[] args) {
      Class cls = DemoClass.class;

      // returns the elements of this enum class
      for(Object obj: cls.getEnumConstants()) {
         System.out.println(cls);
      }
   }
} 