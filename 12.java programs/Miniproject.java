import java.util.*;

class Miniproject{
	
	public static void main(String arg[]){
		
	
	   Scanner as=new Scanner(System.in);
	
	   System.out.print("\n1.calculator \n2.unit convertoy \n3.Mark sheet \n4.Troly Load \n5.Employees Salary Calculate \n6.ATM \n7.Age Comparator \n8.Positive Negative \n9.Odd Even \n10.About Software Engineer \n11.Exit\n\n");
	   
	   System.out.print("Enter your Selection  ");
	   int mini=as.nextInt();
	   
	   if(mini==1){
		   System.out.print("\n1.Calculator (mene) \n2.Calculator(operator)\n");
		   
		   System.out.print("\nEnter your Selection ");
		   int cal=as.nextInt();
		   
		   if(cal==1){
			   
			   
			   System.out.print("\n1.Addition \n2.Subtracation \n3.Multiplication \n4.Division \n5.Remainder\n");
			   
			   System.out.print("\nEnter Selection: ");
			   int cl=as.nextInt();
			   
			     System.out.print("\nEnter 1st Value ");
				   int z=as.nextInt();
				   
				     System.out.print("\nEnter 2nd Value ");
				   int x=as.nextInt();
			   
			   if(cl==1){
				System.out.print("\nAddition : "+(z+x));
			   }
			   if(cl==2){
				   System.out.print("\nSubtracation : "+(z-x));
			   }
			   if(cl==3){
				   System.out.print("\nMultiplication : "+(z*x));
			   }
			   if(cl==4){
				   System.out.print("\nDivision : "+(z/x));
			   }
			   if(cl==5){
				   System.out.print("\nRemainder : "+(z%x));
			   }
			   
			   
			   
			   
		   }
		   
	   if(cal==2){
		   System.out.print("\nEnter 1st value ");
		   int df=as.nextInt();
		   
		   System.out.print("\nEnter 2nd value ");
		   int er=as.nextInt();
		   
		   System.out.print("\nEnter Operator ");
		   String op=as.next();
		   
		   if(op.equals("+")){
			   System.out.print("\nAddition : "+(df+er));
		   }
		   if(op.equals("-")){
			   System.out.print("\nSubtraction : "+(df-er));
		   }
		   if(op.equals("*")){
			   System.out.print("\nMultiplication : "+(df*er));
		   }
		   if(op.equals("/")){
			   System.out.print("\nDivision : "+(df/er));
		   }
		   if(op.equals("%")){
			   System.out.print("\nRemaine"+(df%er));
		   }
		   
		   
		   
	   }
	   
		   
	   
	   }
	   if(mini==2){
		   System.out.print("\n1.Feet To Inch\n2.Inch To Feet\n3.Kilo To Grams\n4.Gram To Kilo \n\n");
		 
		   
		   System.out.print("Enter Selection: ");
		     int ut=as.nextInt();
			 
		   
		   if(ut==1){
			   
			   System.out.print("\nEnter Feet ");
			   int feet=as.nextInt();
			   
			  int inch=feet*12;
			  
			  System.out.print("\nInch will be: "+inch);
		   }
		   if(ut==2){
			   System.out.print("\nEnter Inch ");
			   int inch=as.nextInt();
			   
			   int feet=inch/12;
			   
			   System.out.print("\nFeet will be: "+feet);
			   
		   }
		   if(ut==3){
			     System.out.print("\nEnter Kilo ");
			   int kilo=as.nextInt();
			   
			  int gram=kilo*1000;
			  
			  System.out.print("\nGram will be: "+gram);
		   }
		   if(ut==4){
			     System.out.print("\nEnter Gram ");
			   int gram=as.nextInt();
			   
			  int kilo=gram/1000;
			  
			  System.out.print("\nKilo will be: "+kilo);
		   }
		   
		   
	   }
	   if(mini==3){
		   System.out.print("\nEnter Java Marks ");
		   int java=as.nextInt();
		   
		   System.out.print("Enter Oracle Marks ");
		   int oracle=as.nextInt();
		   
		   System.out.print("Enter VB Marks ");
		   int vb=as.nextInt();
		   
		   System.out.print("Enter Php Marks ");
		   int php=as.nextInt();
		   
		   System.out.print("Enter C marks ");
		   int c=as.nextInt();
		   
		   int obtained=500-(java+oracle+vb+php+c);
		   int percentage=100*obtained/500;
		   
		   System.out.print("\nObtained Marks: "+obtained+"\nTotal Marks   : "+500+"\npercentage    : "+percentage);
		   
	   } 
	   if(mini==4){
		   
		   System.out.print("\nEnter Troly load ");
		   int bill=as.nextInt();
		   
		   
		   int Totalincome=bill*800;
		   int Driver=bill*150;
		   int Tax=Totalincome*10/100;
		   int Disel=bill*210;
		   int Profit=Totalincome-(Driver+Tax+Disel);
		   
		   System.out.print("\nTotal Income: "+Totalincome+"\nDriver      : "+Driver+"\nTax 10%     : "+Tax+"\nDisel       : "+Disel+"\nProfit      : "+Profit);
		   
	   }
	   if(mini==5){
		   System.out.print("\nEnter Employees Basic Salary ");
		   int em=as.nextInt();
		   
		   int house=em*45/100;
		   int medical=em*15/100;
		   int bonns=em*5/100;
		   int grosspay=em+house+medical+bonns;
		   int incometax=em*3/100;
		   double zukawat=em*2.5/100;
		   int convance=em*8/100;
		   
		   System.out.print("\nHouse Rent 45%       : "+house+"\nMedical Allowance 15%: "+medical+"\nBonns 5%             : "+bonns+"\nGross Pay            : "+grosspay+"\nIncome Tax 3%        : "+incometax+"\nZukawak 2.5%         : "+zukawat+"\nConvance Allowace 8% : "+convance);
		   
		   
	   }
	   if(mini==6){
	  
	   System.out.print("\nEnter the Number  ");
	    int a=as.nextInt();
		int fivethousand=a/5000;
		  a =  a%5000;
		int thousand=a/1000;
		 a=a%1000;
		int  fivehundred=a/500;
		a=a%500;
		int  hundred=a/100;
		a=a%100;
		int  fifty=a/50;
		a=a%50;
		int  twoty=a/20;
		a=a%20;
		int  ten=a/10;
		a=a%10;
		int  five=a/5;
		a=a%5;
		int  two=a/2;
		a=a%2;
		int  one=a/1;
		a=a%1;
		

	
	    if(fivethousand>0)
			
	      System.out.print("\nFivethousand: "+fivethousand);
			  
		
	  if(thousand>0)
		  
		  System.out.print("\nThousand    : "+(thousand));
	  
	  if(fivehundred>0)
		  
		  System.out.print("\nFive Hundred: "+(fivehundred));
	  
	   if(hundred>0)
		 
		  System.out.print("\nHundred     : "+(hundred));
	  
	   if(fifty>0)
		   
		  System.out.print("\nFifty       : "+(fifty));
	  
	   if(twoty>0)
		  
		  System.out.print("\nTwenty      : "+(twoty));
	  
	   if(ten>0)
		 
		  System.out.print("\nTen         : "+(ten));
	  
	   if(five>0)
	
		  System.out.print("\nFive        : "+(five));
	  
	   if(two>0)
		  
		  System.out.print("\nTwo         : "+(two));
	  
	   if(one>0)
		   
		  System.out.print("\nOne         : "+(one));
	   }
	   
	   if(mini==7){
		   System.out.print("\nEnter 1st age ");
		   int age=as.nextInt();
		   
		   System.out.print("Enter 2nd age ");
		   int age2=as.nextInt();
		   
		   if(age>age2)
			   System.out.print("\n1st age is greater");
		   if(age2>age)
			   System.out.print("\n2nt age is greater");
	   }
	   if(mini==8){
		   System.out.print("\nEnter Nomber ");
		   int en=as.nextInt();
		   
		   if(en>0)
			   System.out.print("\nPositive");
		   else
			   System.out.print("\nNagative");
		   
		   
		    
	   }
	   if(mini==9){
		   System.out.print("\nEnter the Number ");
		   int eo=as.nextInt();
		   
		   if(eo%2==0)
			   System.out.print("\nEven");
		   else
			   System.out.print("\nOdd");
	   }
	   if(mini==10){
		   System.out.print("\nName       : Faizan hussain \nCompany    : java \nemail      : abc@xyz.com \nContact No : 03144124925 \nAddres     : sindh universty");
	   }
	   if(mini==11){
		  System.out.print("  \n\n\n      Good Bye \n\n\n");
	   }
	
	
	}
}