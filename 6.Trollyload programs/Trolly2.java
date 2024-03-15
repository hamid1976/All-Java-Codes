import javax.swing.*;
class Trolly2{
    public static void main(String arg[]){
		String a=JOptionPane.showInputDialog("Enter Trolly load");
	   int Trollyload=Integer.parseInt(a);
	   int Total=Trollyload*800;
	   int Driver=Trollyload*150;
	   int Tax=Trollyload*80;
	   int Diesel=Trollyload*210;
	   int Profit=Total-(Driver+Tax+Diesel);
	   
	   
	   JOptionPane.showMessageDialog(null,"Total="+(Total)+"\n Driver ="+(Driver)+
	   "\n Tax="+(Tax)+"\n Diesel=" +(Diesel)+"\n  Profit="+(Profit));
	}
}
