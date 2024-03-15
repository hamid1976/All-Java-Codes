 import java.util.*;
class Mini{
	public static void main(String[] args) {
		Scanner op=new Scanner(System.in);
		CalculatorMenu cm=new CalculatorMenu();
		LoopSeries ls=new LoopSeries();
        char ch='Y';
        while(ch=='Y'){
			System.out.print("\n\n\n1.Calculator \n2.LoopSeries \n 3.Exit \n Enter Selection : ");
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
								}
              	if(calmm==2){
                    System.out.println("------Calculator Operator-----");
                    cm.operator();
              	    }
              	if(calmm==3) {
              		break;
              	}
            }//Calculator Close
            while(mm==2){
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
            }//Loop Series Close
            while(mm==3)
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