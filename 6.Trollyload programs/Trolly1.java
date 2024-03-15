import javax.swing.*;
class Trolly1{
    public static void main(String arg[]){
		String a=JOptionPane.showInputDialog("Enter trolly load");
	   int trollyload=Integer.parseInt(a);
	   int total=trollyload*800;
	   int driver=trollyload*150;
	   int tax=trollyload*80;
	   int diesel=trollyload*210;
	   int profits=total-(driver+tax+diesel);
	   
	   
	   JOptionPane.showMessageDialog(null,"total="+(total)+"\n driver ="+(driver)+
	   "\n tax="+(tax)+"\n diesel=" +(diesel)+"\n  profits="+(profits));
	}
}
