public class swit1{

   public static void main(String args[]) {
      // char grade = args[0].charAt(0);
      int  age = 40;

      switch(age) {
         case 20:
            System.out.println("Ali is boy and"); 
           break;
         case 35 :
          System.out.println("Ali is man and");
            break;
         case 40 :
            System.out.println("Ali is old man and");
      }
      System.out.println("ali is " + age+" years old");
   }
}