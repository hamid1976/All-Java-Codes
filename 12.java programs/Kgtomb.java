import javax.swing.*;

class Kgtomb{
	
	public static void main(String arg[]){
		
		String s1= JOpionPane.showInput("Enter Kilobyte");
		
		int Kilobyte=Integer.parse(s1);
		int s2=Kilobyte*1024;
		
		JOptionPane.showMessageDialog(null,megabyte will be:"+s2);
		
	}
}




