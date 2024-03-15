//import java.lang.Class.*;
//import java.lang.reflect.*;
//define Person interface
//interface Person {
  // public void display();

//}
 
//declare class Student that implements Person
//class Student implements Person {
   //define interface method display
  //public void display() {
//class Simple{}  
  //}
//}
 //class Sindhiana{

 //}
import java.lang.*;  
class Main extends SubClass {
   
   public static void main(String[] args) {
         
         Main class1 = new Main();
         SubClass subclass = new SubClass(); 

         // class Main
         Class obj = class1.getClass(); 
         System.out.println(obj);

         // sub class SubClass
         Class obj2 = subclass.getClass();
         System.out.println(obj2);

         Class xy = obj.asSubclass(obj2);
         System.out.println(xy);

      //catch(ClassCastException e) {
        // System.out.println(e.toString());
      //}
   }
}
//class SubClass {
   //sub class
//} 
 // public static void main(String[] args) throws Exception{
    // try {
    //        // create an object of Sindhiana class
    //   Sindhiana s1 = new Sindhiana();

    //   //Sau s = new Sau ();
    //        // get Class object using getClass()
    //   Class obj = s1.getClass();
 
    //        // get the superclass of Student
    //   Class superClass = obj.getSuperclass();
      
    //        //get the ForNameclass  
    //   Class fornameobj = obj.forName("Sindhiana");

    //     System.out.println("Superclass of Student Class: "+superClass.getName());
    //     System.out.println(fornameobj.getName());
    //     System.out.println(""+obj.getClass());
    //     System.out.println(""+obj.getName());

    // }
    // catch(Exception e) {
    //   e.printStackTrace();
    // }


  //}
//}
