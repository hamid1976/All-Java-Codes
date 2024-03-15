import javax.swing.*;
class Atm1{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter pakistani rupees");
	   int pakistanirupees=Integer.parseInt(a);
	   
	   int fivethousand=pakistanirupees/5000;
	   int rempakistanirupees=pakistanirupees%5000;
	   
	   int thousand=rempakistanirupees/1000;
	   int rempakistanirupee=pakistanirupees%1000;
	   
	   int fivehundread=rempakistanirupee/500;
       int rempakistanirupe=pakistanirupees%500;
	   
	   int hundread=rempakistanirupe/100;
	   int rempakistanirup=pakistanirupees%100;
	   
	   int fifty=rempakistanirup/50;
	   int rempakistaniru=pakistanirupees%50;
	   
	   int twenty=rempakistaniru/20;
	   int rempakistanir=pakistanirupees%20;
	   
	   int ten=rempakistanir/10;
	   int rempakistani=pakistanirupees%10;
	   
	   int five=rempakistani/5;
	   int rempakistan=pakistanirupees%5;
	   
	   
	   int two=rempakistan/2;
	   int rempakista=pakistanirupees%2;
	   
	   int one=rempakista/1;
	   int rempakist=pakistanirupees%1;
	   
	   JOptionPane.showMessageDialog(null,"five thousand ="+(fivethousand)+"\n thousand="+(thousand)+
	   "\n five hundread="+(fivehundread)+"\n hundread="+(hundread)+"\n fifty="+(fifty)+"\n twenty=" +(twenty)+"\n ten="+
       (ten)+"\n five="+(five)+"\n two="+(two)+"\n one="+(one)); 
	}
}