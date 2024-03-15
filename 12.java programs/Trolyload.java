import javax.swing.*;

class Trolyload{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Troly load ?");
		
		int Troly=Integer.parseInt(s1);
		int TotelIncome=Troly*800;
		int Driver=Troly*150;
		int Trolypay=(TotelIncome*10)/100;
		int Trolyconsume=Troly*210;
		int profit=TotelIncome-(Driver+Trolypay+Trolyconsume);
		
		JOptionPane.showMessageDialog(null,"Totel Income: "+TotelIncome+"\nDriver: "+Driver+"\nTroly pay: "+Trolypay+"\nTroly consume: "+Trolyconsume+"\nprofit: "+profit);
		
	}
}

