import java.lang.reflect.*;  
  
class ClassgetFields {  
  
   public static void main(String[] args) {  
  
      try {  
         Class clsobj = Class.forName("java.awt.Label");  
         System.out.println("All Fields =");  
  
         Field fld[] = clsobj.getFields();  
         for (int i = 0; i < fld.length; i++) {  
            System.out.println(fld[i]);  
         }  
      } catch (Exception e) {  
         System.out.println("Exception: " + e); //print the exception object  
      }  
   }  
}   