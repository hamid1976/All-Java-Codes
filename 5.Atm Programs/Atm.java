import javax.swing.*;
class Atm{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter rupees");
	   int rupees=Integer.parseInt(a);
	   int fivethousand=rupees/5000;
	   int remrupees=rupees%5000;
	   int thousand=remrupees/1000;
	   int remrupee=remrupees%1000;
	   
       int fivehundread=remrupees/500;
       int remrupe=remrupees%500;
	   
	   
	   int hundread=remrupees/100;
       
	   
	   int fifty=remrupees/50;
	  
	   
	   int twenty=remrupees%20;
	   
	   
	   int ten=remrupees%10;
	   
	   
	   int five=remrupees%5;
	   
	   
	   int two=remrupees%2;
	   
	   
	   int one=remrupees%1;
	   
	   
	   JOptionPane.showMessageDialog(null,"five thousand ="+(fivethousand)+"\n thousand="+(thousand)+
	   "\n five hundread="+(fivehundread)+"\n hundread="+(hundread)+"\n fifty="+(fifty)+"\n twenty=" +(twenty)+"\n ten="+
       (ten)+"\n five="+(five)+"\n two="+(two)+"\n one="+(one)); 
	}
}
