import javax.swing.*;

class Tl{
	
	public static void mian(String arg[]){
		
		String s1=  JOptionPane.showInputDialog("Enter Troly load");
		
		int Tl=Integer.parseInt(s1);
		int incom=Tl*800;
		int s2=Tl*150;
		int Tex=Tl*80;
		int Diver=Tl*100;
		int profit=incom-(s2+Tex+Diver);
		
		JOptionPane.showMessageDialog(null,"incom will be: "+incom+"\nDisel will be: "+s2+"\nTex will be: "+Tex+"\nDiver will be: "+Diver+"\nprofit will be: "+profit);
		
	}
}