import javax.swing.*;
class Atm2{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter rupees");
	   int rupees=Integer.parseInt(a);
	   
	   int fivethousand=rupees/5000;
	    rupees=rupees%5000;
	   
	   int thousand=rupees/1000;
	    rupees=rupees%1000;
	   
	   int fivehundread=rupees/500;
        rupees=rupees%500;
	   
	   int hundread=rupees/100;
	    rupees=rupees%100;
	   
	   int fifty=rupees/50;
	    rupees=rupees%50;
	   
	   int twenty=rupees/20;
	    rupees=rupees%20;
	   
	   int ten=rupees/10;
	    rupees=rupees%10;
	   
	   int five=rupees/5;
	    rupees=rupees%5;
	   
	   
	   int two=rupees/2;
	    rupees=rupees%2;
	   
	   int one=rupees/1;
	    rupees=rupees%1;
	   
	   JOptionPane.showMessageDialog(null,"five thousand ="+(fivethousand)+"\n thousand="+(thousand)+
	   "\n five hundread="+(fivehundread)+"\n hundread="+(hundread)+"\n fifty="+(fifty)+"\n twenty=" +(twenty)+"\n ten="+
       (ten)+"\n five="+(five)+"\n two="+(two)+"\n one="+(one)); 
	}
}
	   
	 