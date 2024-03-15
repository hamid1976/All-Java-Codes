import javax.swing.*;


class Testloopfor27{
	
	public static void main(String arg[]){
		
		JTextArea area=new JTextArea();
		
		for(int i=1; i<=50; i++)
			
		area.append(i+"\n");
		
		JOptionPane.showMessageDialog(null,area);
		
	}
}