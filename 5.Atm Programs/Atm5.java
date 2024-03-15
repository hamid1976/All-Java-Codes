import javax.swing.*;
class Atm_5{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter paisa");
	   int remrupees=Integer.parseInt(a);
	   
	   int fivethousand=remrupees/5000;
	    remrupees=remrupees%5000;
	   
	   int thousand=remrupees/1000;
	    remrupees=remrupees%1000;
	   
	   int fivehundread=remrupees/500;
        remrupees=remrupees%500;
	   
	   int hundread=remrupees/100;
	    remrupees=remrupees%100;
	   
	   int fifty=remrupees/50;
	    remrupees=remrupees%50;
	   
	   int twenty=remrupees/20;
	    remrupees=remrupees%20;
	   
	   int ten=remrupees/10;
	    remrupees=remrupees%10;
	   
	   int five=remrupees/5;
	    remrupees=remrupees%5;
	   
	   
	   int two=remrupees/2;
	    remrupees=remrupees%2;
	   
	   int one=remrupees/1;
	    remrupees=remrupees%1;
	   
	   JOptionPane.showMessageDialog(null,"five thousand ="+(fivethousand)+"\n thousand="+(thousand)+
	   "\n five hundread="+(fivehundread)+"\n hundread="+(hundread)+"\n fifty="+(fifty)+"\n twenty=" +(twenty)+"\n ten="+
       (ten)+"\n five="+(five)+"\n two="+(two)+"\n one="+(one)); 
	}
}
	   
	 