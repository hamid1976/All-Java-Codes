import javax.swing.*;
class FactorialExample2{  
     public static void main(String args[]){  
     String b= JOptionPane.showInputDialog("Enter any No? ");
     int anyNo=Integer.parseInt(b);
	 
     String str ="\n";
     anyNo=anyNo-1;
     int a=1;
     String str3="";
     for(int i=0;i<=anyNo;i++){ 
		 a=a*(i+1);

		 str3 += str+a;
	  } 
      JOptionPane.showMessageDialog(null,str3);	    

 }  
}