import javax.swing.*;


class Testloopfor28{
	
	public static void main(String arg[]){
		
		
		
		JTextArea area=new JTextArea();
		
		JScrollPane scroll=new JScrollPane(area);
		
		for(int i=1; i<=10; i++)
			
		area.append(i+"\n");
		
		
		
	
		
		JOptionPane.showMessageDialog(null,scroll);
		
	}
}