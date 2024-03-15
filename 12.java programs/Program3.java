import java.util.*;

class Program3{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		Calculator ob=new Calculator();
		
		System.out.print("  ==add and mul==  \n\n");
		int a= ob.add(10,5);
		int b= ob.mul(10,5);
		
		System.out.println("Addition is: "+a);
		System.out.println("Multiplication is: "+b);
		
		System.out.println("==============");
		
		
		System.out.print("== srr and cube==\n");
		
		for(int num=1; num<=10; num++){
			
			double r1=ob.sqr(num);
			double r2=ob.cube(num);
			
			System.out.println(num+"\t"+r1+"\t"+r2);
		}
		System.out.print("===Factorial ===\n");
		
		for(int num2=1; num2<=6; num2++){
			
			int f=ob.factorial(num2);
			
			System.out.println(f);
			System.out.println(f);
		}
		
		
		
		
		System.out.println("======Grade========");
		System.out.print("Enter Grade number ");
		int g=as.nextInt();
		
		String per1=ob.grade(g);
		System.out.print(per1);
		
		System.out.println("\n======Percentage========");
		
		System.out.print("Enter obtain Mark and Total Marks ");
		int obtain=as.nextInt();
		int total=as.nextInt();
		double percentage=ob.per(obtain,total);
		System.out.print("Percentage is: "+percentage);
		
		System.out.println("\n========Calculator Operater ==========");
		
		System.out.print("\nEnter Two Value ");
		int q1=as.nextInt();
		int q2=as.nextInt();
		
		
		
		int r1=ob.operater('+',q1,q2); 
		int r2=ob.operater('-',q1,q2); 
		int r3=ob.operater('*',q1,q2); 
		int r4=ob.operater('/',q1,q2); 
		int r5=ob.operater('%',q1,q2); 
		System.out.println("\nAddition is: "+r1);
		System.out.println("Subtraction is: "+r2);
		System.out.println("Multiplication is: "+r3);
		System.out.println("Divisor is: "+r4);
		System.out.println("Remainder is: "+r5);
		
		System.out.println("\n========Maximum Age ==========");
		
		System.out.print("\nEnter three Value ");
		int v1=as.nextInt();
		int v2=as.nextInt();
		int v3=as.nextInt();
		
		int a3=ob.mix(v1,v2,v3);
		System.out.print(a3);
		
		System.out.println("\n========Minimum Age ==========");
		
		System.out.print("\nEnter three Value ");
		int v4=as.nextInt();
		int v5=as.nextInt();
		int v6=as.nextInt();
		
		int a1=ob.min(v4,v5,v6);
		System.out.print(a1);
		
		System.out.println("\n========Positive ==========");
		
		boolean c=ob.positive();
		System.out.print(c);
		
		System.out.println("\n========Even Number ==========");
		
		boolean c1=ob.even();
		System.out.print(c1);
		
		
		System.out.println("\n========prime Number ==========");
		
		boolean b1=ob.prime();
		System.out.print(b1);
		
		System.out.println("\n========Season Number ==========");
		
		String d=ob.Season();
		System.out.print(d);
		
		System.out.println("\n========Hesco bill Number ==========");
		
		System.out.println("\nEnter Hesco bill ");
		int Bill=as.nextInt();
		
		int e=ob.bill(Bill);
		System.out.print(e);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


class Calculator{
	 Scanner as=new Scanner(System.in);
	 
	int add(int a, int b){
		
		int c=a+b;
		
		return c;
		
		
	}
	
	int mul(int a, int b){
		
		int c=a*b;
		
		return c;
		
	}
	
	double sqr(double a){
		
		double result=a*a;
		
		return result;
		
	}
	
	double cube(double num){
		
	  double result=num*num*num;
		
		return result;
		
		
	}
	
	String grade(int per){
		
		if(per>=50)
			return "pass";
		else
			return "Fail";
		
		
	}
	
	double per(int obtain, int total){
		
		double p=100.0*obtain/total;
		
		return p;
	}
	
	int operater(char op,int a, int b){
		
		if(op=='+'){return a+b;}
		if(op=='-'){return a-b;}
		if(op=='*' || op=='x' || op=='X'){return a*b;}
		if(op=='/' || op=='\\'){return a/b;}
		if(op=='%'){return a%b;}
		
		return op;
	}
	
	
	
    int factorial(int num){
		
		int f=1;
		
		for(int i=1; i<=num; i++){
			
			f*=i;
			
		}
		return f;
		
	}
	
	
	
	
	boolean even(){
		
		System.out.print("Enter any No ");
		int num=as.nextInt();
		
		for(int k=2; k<=num; k+=2){
			
		
		
		
		if(num%k==0)
			return true;
		else 
			return false;
		
		 
	
				}
				
				 return true;
				
				
				}
				
				
		int mix(int age1, int age2, int age3){
		
	
		
		if(age1>age2){
	
			if(age1>age3){
			return  age1;
			}
			
		}
		
		if(age2>age1){
			if(age2>age3){
				return age2;
				
			}
		}
		
		if(age3>age1){
			if(age3>age2){
				return age3;
			}
		}
		return age3;
		
		
		
	}
	
		int min(int age1, int age2, int age3){
		
	
		
		if(age1<age2){
	
			if(age1<age3){
			return  age1;
			}
			
		}
		
		if(age2<age1){
			if(age2<age3){
				return age2;
				
			}
		}
		
		if(age3<age1){
			if(age3<age2){
				return age3;
			}
		}
		return age3;
		
		
		
	}
	
	  boolean positive(){
		  
		  System.out.print("Enter Number ");
		  int a=as.nextInt();
		  
		  if(a>0)
			  return true;
		  else
			  return false;
	  }
	  
	  boolean prime(){
		
		
	//	(== 7.Prime NO Series Start ==)
				
					System.out.print("\nEnter Any No ");
            		int num=as.nextInt();
		
		
		
            	
        			int counter=0;
			
        		    	for(int k=2; k<=num-1; k++){
				
     		    		if(num%k==0){
		    			counter=counter+1;
        				}
						
            			}
				
            				if(counter==0){
							return true;
							}
						else{
							return false;
						}
							
					
				
			//	(== 7.Prime NO Series End  ==)
		
		
	}
	
	String Season(){
		Scanner as=new Scanner(System.in);
		
		   System.out.print("Enter Season No ");
    		int z=as.nextInt();
		
    		String season;
		
    		switch(z){
    			case 11:
    			case 12:
	    		case 1:
		    	season = "Season is Winter";break;
    			case 2:
    			case 3:
    			case 4:
    			season = "Season is Spring";break;
    			case 5:
    			case 6:
    			case 7:
    			season = "Season is Summer";break;
    			case 8:
    			case 9:
    			case 10:
    			season = "Season is Autumn";break;
				
    			default:
    			return  "Invalid Month";
    		}
    		
			return season;
	}	
	
	
	int bill(int unit){
	
		
			// (== Hesco Bill  Calculator Start ==)
			
		// System.out.print("Enter Units bill ");
		// int unit=as.nextInt();
		
		if(unit>=1 && unit<=100){
			int a=unit*2;
			
		
		  return a;
		}
		
		
		
		
		if(unit>100 && unit<=200){
			int a=100*2;
			int b=(unit-100)*4;
			System.out.print("\n100*2="+a);
			System.out.print("\n");
			System.out.print((unit-100)+"*4="+b+"\n");
			
			return (a+b);
		}
		if(unit>200 &&  unit<=300){
			int a=100*2;
			int b=100*4;
			int c=(unit-200)*6;
			System.out.print("100*2="+a);
			System.out.print("\n100*4="+b);
			System.out.print("\n");
			System.out.print((unit-200)+"*6="+c+"\n");
			
			return (a+b+c);
			
		}
		if(unit>300 && unit<=400){
			int a=100*2;
			int b=100*4;
			int c=100*6;
			int d=(unit-300)*8;
			System.out.print("100*2="+a);
			System.out.print("\n100*4="+b);
			System.out.print("\n100*6="+c);
			System.out.print("\n");
			System.out.print((unit-300)+"*8="+d+"\n");
		
			return (a+b+c+d);
		}
		if(unit>400){
			int a=100*2;
			int b=100*4;
			int c=100*6;
			int d=100*8;
			int e=(unit-400)*10;
			System.out.print("100*2="+a);
			System.out.print("\n100*4="+b);
			System.out.print("\n100*6="+c);
			System.out.print("\n100*8="+d);
			System.out.print("\n");
			System.out.print((unit-400)+"*10="+e);
			
			return (a+b+c+d+e);
		}
			
			// (== Hesco Bill  Calculator End ==)
			return unit;
	}	
    	
	

	
	
	
	
}















