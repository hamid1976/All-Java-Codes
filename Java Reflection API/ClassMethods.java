import java.lang.reflect.*;

 class ClassMethods {

   public static void main(String[] args) {

      ClassMethods cls = new ClassMethods();
      Class c = cls.getClass();

      // returns the array of Method objects 
      Method[] m = c.getDeclaredMethods();
      for(int i = 0; i < m.length; i++) {
         System.out.println("method = " + m[i].toString());
      }
   }

    ClassMethods() {
      // no argument constructor
   }   

    void showString(String string1) {
      this.str= str;
   }

    void showInteger(Integer i) {
      this.i = i;
   }

    Integer i = 10;
    String str = "java"; 
} 