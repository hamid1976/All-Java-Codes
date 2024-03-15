import javax.swing.*;
class 
{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter trollyload");
	int trollyload=Integer.parseInt(a);
	int total=trollyload*800;
	int driver=trollyload*150;
	int tax=trollyload*80;
	int diesel=trollyload*210;
	int profit=total-(driver+tax+diesel);
	
	JOptionPane.showMessageDialog(null,"total="+(total)+"\n driver="+(driver)+
	"\n tax 10% ="+(tax)+"\n diesel="+(diesel)+"\n profit="+(profit));
	}
}	