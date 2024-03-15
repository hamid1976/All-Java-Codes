import java.lang.reflect.*;  
  
class ClassgetField {  

      //String str;

     public int num; 
    public static void main(String [] args) throws NoSuchFieldException { 

        Class<ClassgetField> obj = ClassgetField.class;  
        Field f = obj.getField("num");  
        //Field f = obj.getField("Sindhiana");
        System.out.println(f);
        Class<?> c = f.getType();  //gets the type 
        System.out.println(c);  
    }  
}  