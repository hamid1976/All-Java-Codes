import javax.swing.*;
class Atm1{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter pakrupees");
	   int pakrupees=Integer.parseInt(a);
	   
	   int fivethousand=pakrupees/5000;
	   int rempakrupees=pakrupees%5000;
	   
	   int thousand=rempakrupees/1000;
	   int rempakrupee=pakrupees%1000;
	   int fivehundread=rempakrupee/500;
       int rempakrupe=pakrupees%500;
	   
	   int hundread=rempakrupe/100;
	   int rempakrup=pakrupees%100;
	   
	   int fifty=rempakrup/50;
	   int rempakru=pakrupees%50;
	   
	   int twenty=rempakru/20;
	   int rempakr=pakrupees%20;
	   
	   int ten=rempakr/10;
	   int rempa=pakrupees%10;
	   
	   int five=rempa/5;
	   int remp=pakrupees%5;
	   
	   
	   int two=remp/2;
	   int rem=pakrupees%2;
	   
	   int one=rem/1;
	   int re=pakrupees%1;
	   
	   JOptionPane.showMessageDialog(null,"five thousand ="+(fivethousand)+"\n thousand="+(thousand)+
	   "\n five hundread="+(fivehundread)+"\n hundread="+(hundread)+"\n fifty="+(fifty)+"\n twenty=" +(twenty)+"\n ten="+
       (ten)+"\n five="+(five)+"\n two="+(two)+"\n one="+(one)); 
	}
}
	   
	 