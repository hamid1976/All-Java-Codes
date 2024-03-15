import java.util.*;
class MiniPro{
	public static void main(String[] args) {
		Scanner op=new Scanner(System.in);
		CalculatorMenu cm=new CalculatorMenu();
		UnitConverter uc=new UnitConverter();
		Session ss=new Session();
		Alphabate alp=new Alphabate();
		Atm at=new Atm();
		Employee emp=new Employee();
		Hesco hes=new Hesco();
		Transport tp=new Transport();
		Age a=new Age();
		LoopSeries ls=new LoopSeries();
		About ab=new About();
		char ch='Y';
        while(ch=='Y'){
			System.out.print("1.Calculator \n 2.Unit Converter \n 3.Session \n 4.Alphabate PlayLand \n 5.ATM \n 6.Employee Basic Pay \n 7.Hesco Bill \n 8.Transport \n 9.Age Comparision \n 10.Loop Series \n 11.About Developer \n 12.Exit \n Enter Selection : " );
        	int mm=op.nextInt();
            while(mm==1){
              	System.out.print("\n\n\t\t\t\t\tCALCULATOR\n1.Calculator(Menu)\n2.Calculaor(Operator)\n3.Back\nEnter Selction : ");
              	int calmm=op.nextInt();
              	while(calmm==1){
                            System.out.println("------Calculator (Menu)------");
			                    System.out.print("1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Remainder \n 6.Back \n Enter Selection : ");
			                    int cmsel=op.nextInt();
			        		    switch(cmsel){
			        		    	case 1:cm.Add();
			        		    	        break;
			        		      	case 2:cm.Sub();
			        		       		    break;
			        		       	case 3:cm.Mul();
			        		       		    break;
			        		       	case 4:cm.Div();
			        		       		    break;
			        		       	case 5:cm.Rem();
			        		       		    break;
									}
									if(cmsel==6)
										break;
									if(cmsel>6)
										System.out.println("------INVALID SELECTION------");
								}
              	if(calmm==2){
                    System.out.println("------Calculator Operator-----");
                    cm.operator();
              	    }
              	if(calmm==3) {
              		break;
              	}
              	if(calmm>3)
              		System.out.println("------INVALID SELECTION------");
            }//Calculator Close
            while(mm==2){
            	System.out.print("1.Centimeter To Foot \n2.Kilometer To Yard  \n3.Kilometer To Mile  \n4.Meter To Yard  \n5.Back \n ");
	            System.out.print("Select Calculator : ");
	            int con=op.nextInt();
            	switch(con){
            		case 1:uc.cf();
            		break;
            		case 2:uc.ky();
            		break;
            		case 3:uc.km();
            		break;
            		case 4:uc.my();
            		break;
            		
            	}
            	if (con==5)
            		break;
            	if(con>5)
            		System.out.println("------INVALID SELECTION------");
            }//Unit Convertor Close
            while(mm==3){
            	ss.month();
            	break;
			}
			while(mm==4){
            	alp.play();
            	break;
			}
			while(mm==5){
				at.amount();
				break;
    		}
    		while(mm==6){
                emp.basic();
                break;
    		}
    		while(mm==7){
                hes.bill();
    			break;
    		}
    		while(mm==8){
                tp.trolly();
    			break;
    		}
    		while(mm==9){
                a.ag();
    			break;
    		}
    		while(mm==10){
                System.out.println("-------Loop Series--------");
            	System.out.print("1.Even Number \n 2. Odd Number \n 3.Square And Cube Series \n 4.Table \n 5.Prime Number \n 6.Even Odd Series \n 7.Star \n 8.Back \n Enter Selection : ");
            	int lssel=op.nextInt();
            	switch(lssel){
            		case 1:ls.evennumber();
            		break;
            		case 2:ls.oddnumber();
            		break;
            		case 3:ls.sqrcube();
            		break;
            		case 4:ls.table();
            		break;
            		case 5:ls.primenumber();
            		break;
            		case 6:ls.evenodd();
            		break;
            		case 7:ls.star();
            		break;
            	}
            	if (lssel==8)
            		break;
            	if (lssel>8)
            		System.out.println("------INVALID SELECTION------");
            }
            while(mm==11){
                ab.developer(); 
                break;
            }
    		while(mm==12)
            	System.exit(0);
		}
	  
	}
}
class CalculatorMenu{
	void Add(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Two Value : ");
		int a=op.nextInt();
		int b=op.nextInt();
		System.out.println("Addition IS : "+(a+b));
	}
	void Sub(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Two Value : ");
		int a=op.nextInt();
		int b=op.nextInt();
		System.out.println("Substraction IS : "+(a-b));
	}
	void Mul(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Two Value : ");
		int a=op.nextInt();
		int b=op.nextInt();
		System.out.println("Multiplication IS : "+(a*b));
	}
	void Div(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Two Value : ");
		int a=op.nextInt();
		int b=op.nextInt();
		System.out.println("Division IS : "+(a/b));
	}
	void Rem(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Two Value : ");
		int a=op.nextInt();
		int b=op.nextInt();
		System.out.println("Remainder IS : "+(a%b));
	}
	void operator(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Two Value : ");
		int a=op.nextInt();
		int b=op.nextInt();
		System.out.print("Enter Operator : ");
		String o=op.next();
		char s=o.charAt(0);
		switch(s){
			case '+':System.out.println("Addition IS : "+(a+b));
			        break;
			case '-':System.out.println("Substraction IS : "+(a-b));
			        break;
			case 'x':
			case 'X':
			case '*':System.out.println("Multiplication IS : "+(a*b));
			        break;
			case '\\':
			case '/':System.out.println("Division IS : "+(a/b));
			        break;
			case '%':System.out.println("Remainder IS : "+(a%b));
			        break;
			default:System.out.println("-------INVALID Operator-------");                        
		}
	}
}
class UnitConverter{
	void cf(){
		Scanner op=new Scanner(System.in);
		System.out.print("\nCentimeter To Foot\n");
	    System.out.print("Enter Centimeter : ");
	    int cm=op.nextInt();
	    double foot=cm*0.0328;
	    System.out.println("Foot IS :"+foot);
	}
	void ky(){
		Scanner op=new Scanner(System.in);
		System.out.print("\nKilometer To Yard\n ");
	    System.out.print("Enter Kilometer : ");
	    int km=op.nextInt();
	    double yard=km*1093.613;
	    System.out.println("Yard IS :"+yard);
	}
	void km(){
		Scanner op=new Scanner(System.in);
		System.out.print("\nKilometer To Mile\n");
	    System.out.print("Enter Kilometer : ");
	    int km=op.nextInt();
	    double mile=km*0.621;
	    System.out.println("Kilometer IS :"+mile);
	}
	void my(){
		Scanner op=new Scanner(System.in);
		System.out.print("\nMeter To Yard\n");
	    System.out.print("Enter Kilometer : ");
	    int m=op.nextInt();
	    double yard=m*1.093;
	    System.out.println("Meter IS :"+yard);
	}
}
class Session{
	void month(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Session : ");
		int s=op.nextInt();
		switch(s){
			case 11:
			case 12:
			case 1:System.out.println("Winter Session");break;
			case 2:
			case 3:
			case 4:System.out.println("Spring Session");break;
			case 5:
			case 6:
			case 7:System.out.println("Summar Session");break;
			case 8:
			case 9:
			case 10:System.out.println("Autom Session");break;
			default:System.out.println("Invalid Session");
	       	}
	}
}
class Alphabate{
	void play(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Alphabate : ");
		String a=op.next();
		char c=a.charAt(0);
		String alpha=c=='A' || c=='a'?"A for Apple":c=='B' || c=='b'?"B for Ball":
		             c=='C' || c=='c'?"C for Cat":c=='D' || c=='d'?"D for Dog":
		             c=='E' || c=='e'?"E for Elephante":c=='F' || c=='f'?"F for Fish":
		             c=='G' || c=='g'?"G for Goat":c=='H' || c=='h'?"H for Horse":
		             c=='I' || c=='i'?"I for Ice-cream":c=='J' || c=='j'?"J for Jug":
		             c=='K' || c=='k'?"K for Kite":c=='L' || c=='l'?"L for Loin":
		             c=='M' || c=='m'?"M for Mango":c=='N' || c=='n'?"N for Next":
		             c=='O' || c=='o'?"O for Orange":c=='P' || c=='p'?"P for Porrat":
		             c=='Q' || c=='q'?"Q for Queen":c=='R' || c=='r'?"R for Rice":
		             c=='S' || c=='s'?"S for Socks":c=='T' || c=='t'?"T for Tree":
		             c=='U' || c=='u'?"U for Umbralla":c=='V' || c=='v'?"V for Village":
		             c=='W' || c=='w'?"W for Went":c=='X' || c=='x'?"X for X-Ray":
		             c=='Y' || c=='y'?"Y for Yoyo":c=='Z' || c=='z'?"Z for Zebra":"Enter Right Character";
		System.out.println(alpha);
	}

}
class Atm{
	void amount(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Value : ");
		int value=op.nextInt();
		int fivethousand=value/5000;
		int remainthousand=value%5000;
		int thousand=remainthousand/1000;
		int remianfivehundred=remainthousand%1000;
		int fivehundred=remianfivehundred/500;
		int remianhundred=remianfivehundred%500;
		int hundred=remianhundred/100;
		int remainfifty=remianhundred%100;
		int fifty=remainfifty/50;
		int remiantwenty=remainfifty%50;
		int twenty=remiantwenty/20;
		int remianten=remiantwenty%20;
		int ten=remianten/10;
		int remainfive=remianten%10;
		int five=remainfive/5;
		int remain2=remainfive%5;
		int two=remain2/2;
		int one=remain2%2;
				
		System.out.print("Five Thousand : "+fivethousand+
			             "\nThousand : "+thousand+
			             "\nFive Hundred : "+fivehundred+
			             "\nHundred : "+hundred+
			             "\nFifty : "+fifty+
			             "\nTwinty : "+twenty+
			             "\nTen : "+ten+
			             "\nFive : "+five+
			             "\nTwo : "+two+
			             "\nOne : "+one+"\n");
	}

}
class Employee{
	void basic(){
		Scanner op=new Scanner(System.in);
		System.out.print("\nEmployee Salary Calculator \n");
		System.out.print("Enter Employee Basic Pay : ");
		int basic=op.nextInt();
		int houserent=basic*45/100;
		int medi=basic*15/100;
		int bonus=basic*5/100;
		int pay=basic+houserent+medi+bonus;
		double zakwat=basic*2.5/100;
		int incometax=basic*3/100;
		int convance=basic*5/100;
		double netpay=pay-zakwat-convance-incometax;
		System.out.println("House Rent 45% Add : "+houserent+
     			            "\nMedical Allowance 15% Add : "+medi+
						    "\nBonus 5% Add : "+bonus+
						    "\nGrose Pay : "+pay+
						    "\nZakwat 2.5% Sub : "+zakwat+
						    "\nIncome Tax 3% Sub : "+incometax+
						    "\nConvance Allowance 5% Sub : "+convance+
						    "\nNet Income : "+netpay);
	}

}
class Hesco{
	void bill(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Units for Check Bill : ");
		int bill=op.nextInt();
		int a1=bill%100*4;
		int a2=bill%200*6;
		int a3=bill%300*8;
		int a4=bill%400*10;
		if(bill>=1 && bill<=100){
			System.out.print(bill+" * 2 = "+(bill*2));
			System.out.println("\nYour Bill Is : "+bill*2);
		}
		if (bill>=101 && bill<=200) {
			System.out.print("100 * 2 = 200 \n");
			System.out.print(bill%100+" * 4 = "+a1);
			System.out.println("\nYour Bill Is : "+(a1+200));
		}
		if (bill>=201 && bill<=300) {
		System.out.print("100 * 2 = 200 \n ");
		System.out.print(" 100 * 4= 400 \n");
		System.out.print(bill%200+" * 6 = "+a2);
		System.out.println("\nYour Bill Is : "+(a2+600));
		}
		if (bill>=301 && bill<=400) {
			System.out.print("100 * 2 = 200 \n");
			System.out.print(" 100 * 4= 400 \n ");
			System.out.print("100 * 6 = 600 \n");
			System.out.print(bill%300+" * 8 = "+a3);
			System.out.println("\nYour Bill Is : "+(a3+1200));
		}
		if (bill>=401) {
			System.out.print("100 * 2 = 200\n");
			System.out.print("  100 * 4= 400 \n");
			System.out.print(" 100 * 6 = 600 \n");
			System.out.print(" 100 * 8 = 800 \n");
			System.out.print(bill%400+" * 10 = "+a4);
			System.out.println("\nYour Bill Is : "+(2000+a4));
		}
	}

}
class Transport{
	void trolly(){
		Scanner op=new Scanner(System.in);
		System.out.print("\nTransport Company \n");
		System.out.print("Enter Troly Loads : ");
        int load=op.nextInt();
        int oneload=800;
        int totalload=load*oneload;
        int driver=150;
        int tax=80;
        int disel=210;
        int ldriver=driver*load;
        int ltax=tax*load;
        int ldisel=disel*load;
        int profit=totalload-ldisel-ltax-ldriver;
		System.out.println("Driver : "+ldriver+"\nTax : "+ltax+
		  	               "\nDisel : "+ldisel+"\nProfit : "+profit);
	}

}
class Age{
	void ag(){
		Scanner op=new Scanner(System.in);
		System.out.print("\n Age Comporator \n");
		System.out.print("Enter Your Age One : ");
		int age1=op.nextInt();
		System.out.print("Enter Your Age Two : ");
		int age2=op.nextInt();
		if (age1==age2) {
			System.out.println("Age One And Two is Equal");
		}
		if (age1>age2) {
			System.out.println("Age one is Greater");
		}
		if (age2>age1) {
			System.out.println("Age Two is Greater");
		}
	}

}
class LoopSeries{
	void evennumber(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num=op.nextInt();
		for (int i=1; i<=num; i++) {
			i++;
			System.out.println(i);
		}
    }
	void oddnumber(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num=op.nextInt();
		for (int i=1; i<=num; i+=2) {
			System.out.println(i);
		}
	}
	void sqrcube(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num=op.nextInt();
		System.out.print("Num\tSqr\tCube\n");
		for (int i=1; i<=num; i++) {
			System.out.println(i+"\t"+i*i+"\t"+i*i*i+"\n");
		}	
	}
	void table(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Table No : ");
		int t=op.nextInt();
		System.out.print("Enter Counter No : ");
		int c=op.nextInt();
		for (int i=1; i<=c; i++) {
			System.out.print(t+" X "+i+" = "+t*i+"\n");
		}
	}
	void primenumber(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Number : ");
			int a=op.nextInt();
			int b=0;
			for (int i=1; i<=a; i++) {
				for (int j=2; j<=i-1; j++) {
					if (i%j==0) {
					b+=1;
					}
				}
			if (b==0) {
				System.out.println(i);
			}
			else {
				b=0;
				}
			}
	}
	void evenodd(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num=op.nextInt();
		System.out.print("Odd\tEven\n");
		for (int i=1; i<=num; i++) {
			System.out.println(i+"\t"+(++i));
		}
	}
	void star(){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num=op.nextInt();
		for (int i=1; i<=num; i++) {
		    for (int j=1; j<=i; j++) {
				System.out.print("*");
		    }
			System.out.println("");
		}
	}
}
class About{
	void developer(){
		System.out.println("NAME-----MUBASHIR HUSSAIN");
        System.out.println("FATHER-NAME----ASHFAQUE");
        System.out.println("STUDENT-OF-SINDH UNIVERSITY");
        System.out.println("LANGUAGE-----JAVA");
        System.out.println("COMPANY-----BELL LABS");
        System.out.println("DEGREE----IT(INFORMATION TECHNOLOGY)");
	}
}