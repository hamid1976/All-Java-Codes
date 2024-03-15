import java.lang.reflect.*;

 class ClassDemo3 {

   public static void main(String[] args) {

      try {
         // returns the Constructor object of the public constructor
         Class cls[] = new Class[] { String.class };
         //Class cl[] = new Class[] { int.class };

         Constructor c = String.class.getConstructor(cls);
         Constructor ob=int.class.getConstructor(cls);

         System.out.println(ob); 
         System.out.println(c);
      } catch(Exception e) {
         System.out.println(""+e);
      } 
   }
}

//Let us compile and run the above program, this will produce the following result −

//public java.lang.String(java.lang.String)