import java.lang.*;

public class ClassDemo2 {

   public static void main(String[] args) {

      String[] arr = new String[] {"Sindhiana"};

      // returns the Class representing the component type
      Class arrClass = arr.getClass();
      Class componentType = arrClass.getComponentType();
      if (componentType != null) {
         System.out.println("ComponentType = " + componentType.getName());
      } else {
         System.out.println("ComponentType is null");
      }
   }
} 


//ComponentType = java.lang.String