interface test4{
   public int num = 30;
   public void demo();
}
public class InterfaceExample implements test4 {
   public void demo() {
      System.out.println("This is the implementation of the demo method");
   }
   public static void main(String args[]) {
      InterfaceExample obj = new InterfaceExample();
      obj.demo();
      System.out.println(test4.num);
   }
}