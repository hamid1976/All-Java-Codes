import java.lang.reflect.*;

 class ClassDemo4 {

   public static void main(String[] args) {

      try {
         Class cls = Class.forName("java.awt.Panel");
         System.out.println("Panel Constructors =");

         /* returns the array of Constructor objects representing the public 
            constructors of this class */
         Constructor c[] = cls.getConstructors();
         for(int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
         }
      } catch (Exception e) {
         System.out.println("Exception: " + e);
      }
   }
} 
//Let us compile and run the above program, this will produce the following result −

//Panel Constructors =
//public java.awt.Panel()
//public java.awt.Panel(java.awt.LayoutManager)