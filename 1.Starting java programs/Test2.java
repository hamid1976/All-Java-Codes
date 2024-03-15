import javax.swing.*;
class Test{
	public sttatic void main(String arg[]){
	    String name=JOptionPane.showInputDialog("Enter your name?");
	    String fname=JOptionPane.showInputDialog("Enter your Father's name?");
        String surname=JOptionPane.showInputDialog("Enter your surname?");
		String address=JOptionPane.showInputDialog("Enter your address?");
		String rollnumber=JOptionPane.showInputDialog("Enter your rollnumber?");
		JOptionPane.showMessageDialog(null,"your name:"+name+"\nyour Father's name:"
		+fname+"\your surname:"+surname+"\nyour address:"+address+"\nyour rollnumber:"+rollnumber);
	          }
}