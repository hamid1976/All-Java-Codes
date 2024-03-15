import java.util.*;
class DoWhileMiniHamid{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		int unitsel,calcSel,calcMenuSel,a,b,c,d,e,h,num,n1,n2,n3,n;
		
		char ch='T';
		do{
			System.out.print("\n\n1.Calculator\n2.UnitConverter\n3.Atm\n4.TrollyLoad\n5.EmployeebasicPay\n6.Hesco bill\n7.For Loop Series\n8.While Loop Series\n9.AgeCompare\n10.About\n11.Exit\nEnter Selection:");
			int mainSelection=ob.nextInt();
			if(mainSelection==1){
				char co='T';
				do{
					System.out.print("\n\n\n1.Calculator(Menu)\n2.Calculator(op)\n3.back\n\n\nEnter Selection:");
					calcSel=ob.nextInt();
					if(calcSel==1){
						char col='T';
						do{
								System.out.print("\n\n-----------------Calculator(Menu)---------------");
								System.out.print("\n\n1.Addition\n2.Suhtraction\n3.Multiplication\n4.Division\n5.Remainder\n6.back\n\n\nEnter Selection:");
								 calcMenuSel=ob.nextInt();
								if(calcMenuSel==1){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Addition="+(a+h));
								}else if(calcMenuSel==2){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Suhtraction="+(a-h));
								}else if(calcMenuSel==3){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Multiplication="+(a*h));
								}else if(calcMenuSel==4){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Division="+(a/h));
								}else if(calcMenuSel==5){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Remainder="+(a%h)+"");
								}else if(calcMenuSel==6){
									col='F';
								}else{
									System.out.println("\nInvalid Selection\n");
								}
						}while(col=='T');//endcalMenusel
						
					}//end calcSel
					
					if(calcSel==2){
							char cn='T';
							do{
								System.out.print("\n\n-----------------Calculator(Operator)---------------");
								System.out.print("\n\n\n1.Addition  +\n2.Subtraction   -\n3.Multiplication  *\n4.Division   /\n5.Remainder\n6.back\n\n\nEnter Operator:");
								char calcOp=ob.next().charAt(0);
								 if(calcOp=='+'){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Addition="+(a+h));
								 }else if(calcOp=='-'){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Suhtraction="+(a-h));
								}else if(calcOp=='*'){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Multiplication="+(a*h));
								}else if(calcOp=='/'){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Division="+(a/h));
								}else if(calcOp=='%'){
									System.out.print("Enter 1st Value:");
									 a=ob.nextInt();
									System.out.print("Enter 2nd Value:");
									 h=ob.nextInt();
									System.out.print("Remainder="+(a%h));
								}else if(calcOp=='6'){
									cn='F';
								}else{
									System.out.println("\nInvalid Selection\n");
								}
							}while(cn=='T');
							
						}//end Calculator Operator
					    if(calcSel==3){
							co='F';
						}if(calcSel< 1 || calcSel>3){
							System.out.println("\nInvalid Selection\n");
						}
				}while(co=='T'); //end do while of mainSelection1
			}//end mainSelection==1
			
			
			if(mainSelection==2){
				char uc='T';
				do{
					 System.out.print("\n\n-----------------Unit Converter---------------");
					 System.out.println("\n\n1.FeetToInch\n2.InchToFeet\n3.KiloToGram\n4.GramToKilo\n5.back\n\nEnter Selection:");
					 unitsel=ob.nextInt();
					  if(unitsel==1){
						  
						 System.out.print("Enter feet:");
						 int feet=ob.nextInt();
						 int inch=feet*12;
						 System.out.println("feet="+feet);
						 System.out.println("inch="+inch);
						
					 }else if(unitsel == 2){
						  System.out.print("Enter inch:");			
						  int inch=ob.nextInt();
						  int feet=inch/12;
						   System.out.println("feet="+feet);
						  System.out.println("inch="+inch);
						  
					}else if(unitsel == 3){
						   System.out.print("Enter kilo:");
						   int kilo=ob.nextInt();
						   int gram=kilo*1000;
							System.out.println("kilo="+kilo);
						 System.out.println("gram="+gram);
						   
					}else if(unitsel == 4){
						   System.out.print("Enter gram:");
						   int gram=ob.nextInt();
						   int kilo=gram/1000;
							System.out.println("kilo="+kilo);
						  System.out.println("gram="+gram);
					}else if(unitsel==5){
						uc='F';
					}else{
						System.out.println("\nInvalid Selection\n");
					}
					
				}while(uc=='T');
			}//end mainSelection==2
			
			if(mainSelection==3){
				char atm='T';
				do{
					     System.out.print("\n\n-----------------ATM---------------");
						 System.out.println("\n\nEnter Rupees:");	
						 int remrupees=ob.nextInt();
							
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
						
						 System.out.println("\nFivethousand="+fivethousand);
						 System.out.println("Thousand="+thousand);
						 System.out.println("Fivehundread="+fivehundread);
						 System.out.println("Hundread="+hundread);
						 System.out.println("Fifty="+fifty);
						 System.out.println("Twenty="+twenty);
						 System.out.println("Ten="+ten);
						 System.out.println("Five="+five);
						 System.out.println("Two="+two+"\n\n");
						 
						 atm='f';
				}while(atm=='T');
			}//end  mainSelection==3
			
			if(mainSelection==4){
				char trolly='T';
				do{ 
				       System.out.print("\n\n-----------------TrollyLoad---------------");
					   System.out.print("\n\nEnter Trollyload:");
					   int Trollyload=ob.nextInt();
						
					   int Total=Trollyload*800;
					   
					   int driver=Trollyload*150;
					   int tax=Trollyload*80;
					   int diesel=Trollyload*210;
					   
					   int sum=driver+tax+diesel;
					   
					   System.out.println("\nTotal Income="+Total);
					   System.out.println("Driver="+driver);
					   System.out.println("Tax="+tax);
					   System.out.println("Diesel="+diesel);
					   
					   System.out.println("Profit="+(Total-sum)+"\n\n");
					   
					   trolly='F';
				}while(trolly=='T');
			}//end mainSelection TrollyLoad 4
			
			if(mainSelection==5){
				char pay='T';
				do{
					System.out.print("\n\n-----------------Employee BasicPay---------------");
					System.out.print("\n\nEnter Employee basicpay:");
					 int Employhasicpay=ob.nextInt();
					 
					 int Medicalallowance=15*Employhasicpay/100;
					 int Houserent=45*Employhasicpay/100;
					 int honus=5*Employhasicpay/100;
					 int Grosspay=(Employhasicpay+Medicalallowance+Houserent+honus);
					 int Incometax=5*Employhasicpay/100;
					 int Zakat=2*Employhasicpay/100;
					 int Convenceallowance=8*Employhasicpay/100;
					 int Networth=Grosspay-(Incometax+Zakat+Convenceallowance);
					 
					System.out.println("\nMedicalallowance="+Medicalallowance);
					System.out.println("Houserent="+Houserent);
					System.out.println("honus="+honus);
					System.out.println("Grosspay="+Grosspay);
					System.out.println("Incometax="+Incometax);
					System.out.println("Zakat="+Zakat);
					System.out.println("Convenceallowance="+Convenceallowance);
					System.out.println("Networth="+Networth+"\n\n");
					
					pay='F';
				}while(pay=='T');
			}//end mainSelection==5 Employhasicpay
			
			if(mainSelection==6){
				char bill='T';
				do{
					System.out.print("\n\n-----------------Hesco Bill---------------");
					System.out.print("\n\nEnter Units:");
					int unit =ob.nextInt();
					
					 if(unit>=1 && unit<=100){
					  System.out.println(unit+"*2 = "+(unit*2));    
					  System.out.print("charges will be "+(unit*2)+"\n\n");
					
					 }
					 if (unit>=101 && unit<=200){
					    h=unit-100;
					    c=h*4;
						System.out.println("100*2 = 200");
						System.out.println(h+"*4 = "+(h*4));
						System.out.println("charges will he "+(c+200)+"\n\n");
					}
					 if (unit>=201 && unit<=300){
						 c=unit-200;
						 d=c*6;
						System.out.println("100*2 = 200");
						System.out.println("100*4 = 400");
						System.out.println(c+"*6 = "+(c*6));
						System.out.print("charges will he "+(d+600)+"\n\n");
					}
					if (unit>=301 && unit<=400){
						 c=unit-300;
						 d=c*8;
						System.out.println("100*2 = 200");
						System.out.println("100*4 = 400");
						System.out.println("100*6 = 600");
						System.out.println(c+" *8 = "+(c*8));
						System.out.print("charges will he "+(d+1200)+"\n\n");
					 }
					 if (unit>=401 ){
						  c=unit-400;
						  d=c*10;
						  System.out.println("100*2 = 200");
						  System.out.println("100*4 = 400");
						  System.out.println("100*6 = 600");
						  System.out.println("100*8 = 800");
						  System.out.println(c+"*10 ="+(c*10));
						  System.out.print("charges will he "+(d+2000)+"\n\n");
					 }
					bill='F';
				}while(bill=='T');
			}//end mainSelection==6 hesco hill
			
			
			if(mainSelection==7){
				char For='T';
				do{
					System.out.print("\n\n-----------------For Loop Series---------------");
					System.out.print("\n\n1.Counter Table Series\n2.Fibnocii Series\n3.Prime No\n4.Prime No Series\n5.Unknown Series\n6.Reverse Name\n7.Enter Last Letter\n8.Decrement Star Pattern\n9.Decrement Name Pattern\n10.Decrement Number Pattern\n11.back\nEnter Selection:");
					int forSel=ob.nextInt();
					if(forSel==1){
						System.out.print("\n\n-----------------Counter Table Series---------------");
						System.out.print("Enter Table:");
							int table=ob.nextInt();
							System.out.print("Enter Counter:");
							int counter=ob.nextInt();
									
							for(int i=1; i<=table; i++){
								System.out.println("Table No="+i);
								for(int j=1; j<=counter; j++){
										 System.out.println(i+"x"+j+"="+(i*j));		 
								}
								System.out.println();
							}
					}else if(forSel==2){
						  System.out.print("\n\n-----------------Fibnocii Series---------------");
						  System.out.println("\n\nEnter any No:");
						  int counter=ob.nextInt();
						   n1=0;
						   n2=1;
						   
						 
						  System.out.print(n2);
						  for(int i=1; i<=counter; i++){
						  
						  n3=n1+n2;        
						  n1=n2;    
						  n2=n3; 
						  System.out.print(" "+n3);		  
								  
						  }
						  
					}else if(forSel==3){
						System.out.print("\n\n-----------------Prime NO---------------");
						System.out.println("\n\nEnter any No?");
						 num=ob.nextInt();
					
						b=0;
						for(int i=2; i<=num/2; i++){
							if(num%i==0){          
								b=1;
							}
						}
						if(b==1)
								System.out.println("Not a Prime No"+"\n\n");
						else
								System.out.print( "Prime No"+"\n\n");
					}else if(forSel==4){
						//System.out.println("Enter any No?");
						//int num=ob.nextInt();
						System.out.print("\n\n-----------------Prime No Series---------------");
						for( num=2; num<50; num++){
						int t;
							for( t=2; t<num; t++){
							   if(num%t==0)
								  break;
							}//end inner loop
							if(num==t)
							System.out.println(num);
						}//end outer loop
						
					}else if(forSel==5){
						System.out.print("\n\n-----------------Unknown Series---------------");
						System.out.println("\n\nEnter any No?");
						int count=ob.nextInt();
						
					   n1=0;
					   n=0;
		
					System.out.print(n1+" ");
					  
					  for(int i=1; i<=count; i++){
						   n1=n1+3+n;
						   n=n+2;
						   
						    System.out.print(" "+n1+"\n\n");	
					  }
					}else if(forSel==6){
						System.out.print("\n\n-----------------Reverese Name---------------");
						System.out.print("\n\nEnter Name:");
						String name=ob.next();
						int leng=name.length();
						for(int i=0; i<1; i++){
							for(int j=leng-1; j<leng; j--){
								if(j==-1){
									break;
								}
								char na=name.charAt(j);
								System.out.print(na+"\n\n");
							}
							//System.out.println();
						}
					}else if(forSel==7){
						System.out.print("\n\n-----------------Enter Last Letter---------------");
															//D
						System.out.print("\n\nEnter Last Letter:");
						char letter=ob.next().charAt(0);
										//D 68-64=4
						for(int j=0; j<letter-64; j++){
							for(char last=65; last<=letter-j; last++){
									System.out.print(last);
							}
							System.out.println();
						}
					}else if(forSel==8){
						System.out.print("\n\n-----------------Star Decrement Pattern---------------");
						System.out.print("\n\nEnter any No:");
						int No=ob.nextInt();
						
						for(int i=1; i<=No; i++){
							 for(int j=No; j>=i; j--){
								System.out.print("*");
							 }
							 System.out.println();
						}
					}else if(forSel==9){
						System.out.print("\n\n-----------------Name Decrement Pattern---------------");
						System.out.print("\n\nEnter Name:");
						String name1=ob.next();
						int leng=name1.length();
						for(int i=0; i<leng; i++){
							for(int j=i; j<=leng-1; j++){
								char dc=name1.charAt(j);
								System.out.print(dc);
							}
							System.out.println();
						}
					}else if(forSel==10){
						System.out.print("\n\n-----------------Number Decrement Pattern---------------");
						System.out.print("\n\nEnter any No:");
						int Anyno=ob.nextInt();
						   
						 for(int i=Anyno; i>=1; i--){ // outer loop for rows
						 num=1; 
							for(int j=1; j<=i; j++){ // inner loop for Colunms 
								// printing num with a space  
								System.out.print(num+ " "); 
								//incrementing value of num 
								num++ ;
							} 
							System.out.println();// ending line after each row  
						} 
					}else if(forSel==11){
						For='F';
					}else if(forSel<1 || forSel>11){
						System.out.println("\nInvalid Selection\n");
					}
				}while(For=='T');
			}//end mainSelection==7 FOR LOOP SERIES
			
			if(mainSelection==8){
				char WLoop='T';
					System.out.print("\n\n-----------------While Loop Series---------------");
				do{
					System.out.print("\n\n1.Counter Table \n2.Fibnocii Series\n3.Prime No\n4.Factorial\n5.Unknown Series\n6.Reverse Name\n7.Enter Last Letter\n8.Decrement Star Pattern\n9.Decrement Name Pattern\n10.Decrement Number Pattern\n11.back\nEnter Selection:");
					int whileSel=ob.nextInt();
					if(whileSel==1){
						System.out.print("\n\n-----------------Counter Table Series---------------");
						System.out.print("\n\nEnter Table:");
						int t=ob.nextInt();
						System.out.print("Enter Counter:");
						 c=ob.nextInt();
						int i=1;
						while(i<=c){
						//int c=i*i;
							 d=i*t;
							System.out.println(t+ "*" +i+"="+d);
							i++;
						}
						
					}else if(whileSel==2){
						System.out.print("\n\n-----------------Fibnocii Series---------------");
						System.out.print("\n\nEnter anyNo:");
						int count=ob.nextInt();
						a=1;
						b=1;
						int sum=0;
						System.out.print(a+"\n"+b);
						int i=1;
						while(i<=count){
							sum=a+b;
							a=b;
							b=sum;
							System.out.print("\n"+sum);
							i++;
						}
					}else if(whileSel==3){
						System.out.print("\n\n-----------------Prime NO---------------");
						System.out.print("\n\nEnter Prime no:");
						num=ob.nextInt();
						
						b=0;
						int i=2;
						while(i<num){
							if(num%i==0){
								b=1;
								break;
							}
							i++;
						}
						if(b==0)
							System.out.println("Prime No");
						if(b==1)
							System.out.println("Not a Prime No");
						
					}else if(whileSel==4){
						System.out.print("\n\n-----------------Factorial Series---------------");
						System.out.println("\n\nEnter any no:");
					    num=ob.nextInt();
					    int i=0;
						int f=1;
						while(i<num){
							f+=f*i;
							i++;
						System.out.println(f);	
						}
					}else if(whileSel==5){
						System.out.print("\n\n-----------------Unknown Series---------------");
						System.out.println("\n\nEnter any no:");
						num=ob.nextInt();
						int i=0;
						while(i<num){
							System.out.println(i*i+1);
							i++;
						}
					}else if(whileSel==6){
						System.out.print("\n\n-----------------Reverese Name---------------");
						System.out.print("\n\nEnter Your name:");
						String name=ob.next();
						int len=name.length();
						
						int i=len-1;
						while(i<=len){
							if(i==-1){
								break;
							}
							char reverse=name.charAt(i);
							System.out.print(reverse);
							i--;
						}
							
					}else if(whileSel==7){
						System.out.print("\n\n-----------------Enter Last Letter---------------");
						System.out.print("\n\nEnter Any Letter:");
						char letter1=ob.next().charAt(0);
						
						 h=64;
						while(h<=letter1){
							int j=letter1;
								char i=65;
							while(j>h){
								System.out.print(i);
								j--;
								i++;
							}
							System.out.println();
							h++;
						}
					}else if(whileSel==8){
						System.out.print("\n\n-----------------Star Decrement Pattern---------------");
						System.out.print("\n\nEnter any No:");
						int anyNo=ob.nextInt();
						int i=0;
						while(i<=anyNo){
						i++;
						int j=anyNo;
						while(j>=i){
						j--;
						System.out.print("*");
						}
						System.out.println();
						}
					}else if(whileSel==9){
						System.out.print("\n\n-----------------Name Decrement Pattern---------------");
						System.out.print("\n\nEnter Your name:");
						String name=ob.next();
						int len=name.length();
						
						int i=len-1;
						while(i>=0){
						int k=0;
						
						while(k<=i){
						System.out.print(name.charAt(k));
						k++;
						}
						System.out.println();
						i--;
						}
					}else if(whileSel==10){
						System.out.print("\n\n-----------------Number Decrement Pattern---------------");
						
						System.out.print("\n\nEnter any No:");
						int anyNo=ob.nextInt();
						int i=1;
						
						while(i<=anyNo){
							
						int j=anyNo;
						int k=1;
						while(j>=i){
							j--;
							System.out.print(k);
							k++;
						}
							i++;
						System.out.println();
						}
					}else if(whileSel==11){
							WLoop='F';
					}else if(whileSel<0 || whileSel>11){
						System.out.print("\nInvalid Selection"+"\n");
					}
				}while(WLoop=='T');
				
			}//end while loop Series
			
			if(mainSelection==9){
				char age='T';
				do{
					System.out.print("\n\n-----------------Age Comparison---------------");
					System.out.print("\n1.Three Age Comparison\n2.Five Age Comparison\n3.back\n\nEnter Selection:");
					int ageSel=ob.nextInt();
					
						if(ageSel==1){
						System.out.print("Enter 1st Age?");
						a=ob.nextInt();
						System.out.print("Enter 2nd Age?");
						b=ob.nextInt();
						System.out.print("Enter 3rd Age?");
						c=ob.nextInt();
						
						if(a>b) {
						  if(a>c) {
								System.out.println("\n1st Age is greater"+"\n\n");
							}    
						}
						 if(b>a) {
							 if(b>c){
								System.out.println("\n2nd Age is greater"+"\n\n");			
							 } 
						}
						   if(c>a){
							   if(c>b){
									System.out.println("\n3rd Age is greater"+"\n\n"); 
							   }   
						  }
						}else if(ageSel==2){
							System.out.print("Enter 1st Age?");
						    a=ob.nextInt();
							System.out.print("Enter 2nd Age?");
						    b=ob.nextInt();
							System.out.print("Enter 3rd Age?");
							c=ob.nextInt();
							System.out.print("Enter 4th Age?");
							d=ob.nextInt();
							System.out.print("Enter 5th Age?");
							e=ob.nextInt();
							
							if(a>b && a>c && a>d&&a>e)
							   System.out.println("\n1st Age is greater"+"\n");
							if(b>a &&b>c &&b>d &&b>e)
								System.out.println("\n2nd Age is greater"+"\n");
							if(c>a &&c>b &&c>d &&c>e)
								System.out.println("\n3rd Age is greater"+"\n");
							if(d>a &&d>b &&d>c &&d>e)
								System.out.println("\n4th Age is greater"+"\n");
							if(e>a &&e>b &&e>c &&e>d)
								System.out.println("\n5th Age is greater");
						}else if(ageSel==3){
							age='F';
						}else if(ageSel<1 || ageSel>3){
							System.out.println("Invalid Selection");
						}
					
				
				}while(age=='T');
			}//end Age Compare
			if(mainSelection==10){
				System.out.println("\n\n-------------About Developer-----------"+"\n");
				System.out.println("Name:Hamidullah");
				System.out.println("FatherName:Noorullah");
				System.out.println("Surname:Shaikh");
				System.out.println("Department:Information & Technology");
				System.out.println("Roll No:2k20/IT/44");
			}
			if(mainSelection==11){
				System.exit(0);
			}
		}while(ch=='T');//end selection 11
	}
}