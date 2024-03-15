
class Sindhiana{}
class Main1 {
  public static void main(String[] args) {
    try {
           // create an object of Student class
      Sindhiana s1 = new Sindhiana();

      //Sau s = new Sau ();
           // get Class object using getClass()
      Class obj = s1.getClass();
 
           // get the superclass of Student
      Class superClass = obj.getSuperclass();
      
           //get the ForNameclass  
      //Class fornameobj = Class.forName("student");

        //System.out.println("Superclass of Student Class: "+superClass.getName());
        //System.out.println(fornameobj.getName());
        System.out.println(""+obj.getClass());
        //System.out.println(obj.getName());

    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
