import java.lang.*;

public class ClassDemo5 {

   public static void main(String[] args) {
 
      try {
         // returns the Class object associated with this class
         Class cls = Class.forName("ClassDemo5");

         /* returns the array of Class objects representing all the declared 
            members of this class */
         Class[] classes = cls.getDeclaredClasses();
         for (int i = 0; i < classes.length; i++) {
            System.out.println("Class = " + classes[i].getName());
         }
      } catch (ClassNotFoundException e) {
         System.out.println(e.toString());
      }
   }

   public class InnerClass1 {
      public InnerClass1() {
         System.out.println("Inner Class1");
      }
   }

   public class InnerClass2 {
      public InnerClass2() {
         System.out.println("Inner Class2");
      }
   }

   private class InnerPrivateClass {
      public InnerPrivateClass() {
         System.out.println("Inner Private Class");
      }
   }
} 
//Let us compile and run the above program, this will produce the following result −

//Class = ClassDemo$InnerPrivateClass
//Class = ClassDemo$InnerClass2
//Class = ClassDemo$InnerClass1