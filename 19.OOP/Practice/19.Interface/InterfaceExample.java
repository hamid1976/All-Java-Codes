/* javax.swing.*;
class test2{
	public static void main(String []args){	
	JOptionPane.showMessageDialog(null,"hell world");
	}
}	
import javax.swing.*;
class test2{
	public static void main(String args []){	
	JOptionPane.showMessageDialog(null,"ji ada");
	}
}
import javax.swing.*;
class test2{
	public static void main(String args[]){
	JOptionPane.showMessageDialog(null,"uzair");
	}
}

import javax.swing.*;
class test2{
	public static void main(String []args){	
	JOptionPane.showMessageDialog(null,"nazeer ali is good boy");
}}*/

/*import java.util.Scanner;
public class test2 {
	public static void main (String []args){
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter Rupees"); 
		int rupees = ob.nextInt ();
        int salary = 50000;
		if(i=0; i<= salary; i++){
		System.out.println 		("Your Remaning Balance is  :" +(salary-rupees));}
		else{
		System.out.println 		("this amount is not availabale"}
}}*/
/*abstract class A{
    abstract void method_1();
     //   System.out.println("method1 called");
    
    void method_2(){
        System.out.println("method 2 called in class A");
}}
   class B extends A{
       void method_1(){
           System.out.println("method 1 called in class B ");
       }
   } 

public class test2
{
	public static void main(String[] args) {
		 //A ob1 =new A();
		 B obj2 =new B();
		 obj2.method_1();
		 obj2.method_2();
	}
}*/
// interface MyInterface{
   // public static final int num = 30;
   // public abstract void demo();
// }
// public class InterfaceExample implements MyInterface {
   // public void demo() {
      // System.out.println("This is the implementation of the demo method");
   // }
   
   // public static void main(String args[]) {
      // MyInterface interfaceObject = new MyInterface();
	  // obj.demo();
      // System.out.println(interfaceObject.num);
   // }
// }
package com.servletpack.examples;
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