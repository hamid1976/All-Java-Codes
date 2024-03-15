import javax.swing.*;

class Minutestoyears{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Minutes ?");
		}
		int minutes=Integer.parseInt(s1);
		int s2=minutes/525600;
		
		JOptionPane.showMessageDialog(null,"Years will be"+s2);
		
	}
