import java.lang.reflect.*;  
  
class ClassMethodsDemo {  
  
   public static void main(String[] args) {  
  
      try {  
         Class cls1 = Class.forName("java.awt.Label");  
         System.out.println("Methods =");  
        
         Method mthd[] = cls1.getMethods();  
         for(int i = 0; i < mthd.length; i++) {  
            System.out.println(mthd[i]);  
         }  
      } catch (Exception e) {  
         System.out.println("Exception: " + e); //print exception object  
      }  
   }  
}