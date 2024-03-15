import java.lang.reflect.*;

enum Programming {
   java,
   C,
}

public class EnumDemo {

   public static void main(String[] args) {
      Class cls = Programming.class;

      // returns the elements of this enum class
      for(Object obj: cls.getEnumConstants()) {

         System.out.println(obj);
      }
   }
} 