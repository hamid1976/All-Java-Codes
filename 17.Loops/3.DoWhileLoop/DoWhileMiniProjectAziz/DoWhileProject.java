import java.util.*;
class DoWhileProject
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		char ch='T';
		do{
			System.out.println("1, Calculator");
			System.out.println("2, Atm");
			System.out.println("3, TrollyLoad");
			System.out.println("4, Employee Basic Pay");
			System.out.println("5, Hesco Bill");
			System.out.println("6, For loop Series");
			System.out.println("7, While Loop Series");
			System.out.println("8, Do while loop Series");
			System.out.println("9, Unit Converter ");
			System.out.println("10, Exit");
			System.out.print("Enter your Selection:");
			int sel=obj.nextInt();
			
			if(sel==1){
				char con='T';
				do{
					System.out.println("1, Manual calculator");
				    System.out.println("2, Operator Calculator");
				    System.out.println("3, Exit:");
				    System.out.print("Enter your Selection:");
				    int oper=obj.nextInt();
					
					if(oper==1){
						char ope='T';
						do{
							System.out.println("1, Addition");
						    System.out.println("2, Subtraction");
						    System.out.println("3, Multiplication");
						    System.out.println("4, Division");
						    System.out.println("5, Remainder");
						    System.out.println("6, Exit");
						    System.out.print("Enter your Selecton:");
						    int op=obj.nextInt();
							
							if(op==1){
							    System.out.print("Enter two values:");
							    int a=obj.nextInt();
							    int b=obj.nextInt();
							    System.out.println("Addition is ="+(a+b));	
							}else
							    if(op==2){
									System.out.print("Enter two values:");
							        int a=obj.nextInt();
							        int b=obj.nextInt();
							        System.out.println("Subtraction is ="+(a-b));	
								}else
							        if(op==3){
										System.out.print("Enter two values:");
							            int a=obj.nextInt();
							            int b=obj.nextInt();
							            System.out.println("Multiplicatin is ="+(a*b));	
									}else
										if(op==4){
											System.out.print("Enter two values:");
							                int a=obj.nextInt();
							                int b=obj.nextInt();
							                System.out.println("Division is ="+(a/b));	
										}else
											if(op==5){
												System.out.print("Enter two values:");
							                    int a=obj.nextInt();
							                    int b=obj.nextInt();
							                    System.out.println("Remainder is ="+(a%b));	
											}else
												if(op==6){
													ope='F';
												}else
													System.out.println("Invalid Selction");

							
						}while(ope=='T');
					}
					if(oper==2){
						char ope='T';
						do{
							System.out.print("Enter any operator Or Enter B to go back:");
						    char ch1=obj.next().charAt(0);
							
							if(ch1=='+'){
								System.out.print("Enter two values:");
							    int a=obj.nextInt();
							    int b=obj.nextInt();
							    System.out.println("Addition is :"+(a+b));
							}else
								if(ch1=='-'){
									System.out.print("Enter two values:");
							        int a=obj.nextInt();
							        int b=obj.nextInt();
							        System.out.println("Subtraction is :"+(a-b));
								}else
									if(ch1=='*' || ch=='x'){
										System.out.print("Enter two values:");
							            int a=obj.nextInt();
							            int b=obj.nextInt();
							            System.out.println("Multiplication is :"+(a*b));
									}else
										if(ch1=='/'){
											System.out.print("Enter two values:");
							                int a=obj.nextInt();
							                int b=obj.nextInt();
							                System.out.println("Division is :"+(a/b));
										}else
											if(ch1=='%'){
												System.out.print("Enter two values:");
							                    int a=obj.nextInt();
							                    int b=obj.nextInt();
							                    System.out.println("Remainder is :"+(a%b));
											}else
												if(ch1=='b' || ch=='B'){
													ope='f';
												}else
													System.out.println("Invalid Selection!");
							
						}while(ope=='T');
					}
					if(oper==3){
						con='f';
					}
					if(oper>3 || oper<1){
						System.out.println("Invalid Slection!");
						System.out.println();
					}
					
				}while(con=='T');
			}
			if(sel==2){
				char con;
				do{
				
				    System.out.print("Enter Number");
		            int inp =obj.nextInt();
		
		            int fi_tho=(inp/5000);
		            int rem1  =(inp%5000);
		            int thous =(rem1/1000);
		            int rem2  =(rem1%1000);
		            int fi_hun=(rem2/500);
		            int rem3  =(rem2%500);
		            int hund  =(rem3/100);
		            int rem4  =(rem3%100);
		            int fif   =(rem4/50);
		            int rem5  =(rem4%50);
		            int twe   =(rem5/20);
		            int rem6  =(rem5%20);
		            int ten   =(rem6/10);
		            int rem7  =(rem6%10);
		            int five  =(rem7/5);
		            int rem8  =(rem7%5);
		            int two   =(rem8/2);
		            int rem9  =(rem8%2);
		            int one   =(rem9/1);
		            int rem10 =(rem9%1);
		            System.out.println("Five thousand = "+fi_tho);
		            System.out.println("thousand      = "+thous);
		            System.out.println("Five hundreds = "+fi_hun);
		            System.out.println("Hundred   = "+hund);
		            System.out.println("Fifty = "+fif);
		            System.out.println("twenty= "+twe);
		            System.out.println("Ten   = "+ten);
		            System.out.println("Five   = "+five);
		            System.out.println("Two   = "+two);
		            System.out.println("One   = "+one+"\n");
		            System.out.print("Do you want to run again!");
					con=obj.next().charAt(0);
					
				}while(con=='y' || con=='Y');
			}
			if(sel==3){
				char con;
				do{
					System.out.print("Enter TrolyLoad:");
					int load=obj.nextInt();
					int tax=80*load;
					int driver=150*load;
					int disel=200*load;
					int profit=360*load;
					int tot=800*load;
					
					System.out.println("Tax ="+tax);
					System.out.println("Driver ="+driver);
					System.out.println("Diesel ="+disel);
					System.out.println("profit ="+profit);
					System.out.println("total ="+tot+"\n");
					System.out.print("Do you want to run again!");
					con=obj.next().charAt(0);
					
				}while(con=='y' || con=='Y');
			}
			if(sel==4){
				char con;
				do{
					System.out.print("Enter Employee basic pay =");
					int inp=obj.nextInt();
					int med=(inp*15)/100;
					int ren=(inp*45)/100;
					int bon=(inp*5)/100;
					int gross=(inp+med+ren+bon);
					int tax=(inp*5)/100;
					int zakat=(inp*2)/100;
					int conv=(inp*8)/100;
					int net=(gross-(tax+zakat+conv));
					
					System.out.println("Medical ="+med);
					System.out.println("Rent ="+ren);
					System.out.println("Bonus ="+bon);
					System.out.println("GrossPay ="+gross);
					System.out.println("Tax ="+tax);
					System.out.println("Zakat ="+zakat);
					System.out.println("Convence ="+conv);
					System.out.println("NetWorth ="+net+"\n");
					System.out.print("Do you want to run again!");
					con=obj.next().charAt(0);
					
				}while(con=='y' || con=='Y');
			}
			if(sel==5){
				char con;
				do{
					System.out.print("enter units =");
		            int unit = obj.nextInt();
		
		            int hund1 =100*2,    rem  =unit-100 ;
		            int hund2 =100*4,    rem1 =unit-200 ;
		            int hund3 =100*6,    rem2 =unit-300;
		            int hund4 =100*8,    rem3 =unit-400;
		
		            int rs = rem*4  ,    tot = 2*unit;
		            int rs1= rem1*6 ,    tot1= hund1+rs; 
		            int rs2= rem2*8 ,    tot2= hund1+hund2+rs1;
		            int rs3= rem3*10,    tot3= hund1+hund2+hund3+rs2;
                    int tot4= hund1+hund2+hund3+hund4+rs3;		
		
		            if(unit>=1 && unit<=100){
		                System.out.println(unit+ "*2 = "+2*unit+"\nTotal Charges ="+tot);
		            }
			
		            if(unit>=101 && unit<=200){
			            System.out.println("100*2 =200\n"+rem+"*4  ="+rs+"\n Total Charges ="+tot1);
		            }
		
		            if(unit>=201 && unit<=300){
			            System.out.println("100*2 =200\n100*4 =400\n"+rem1+"*6 ="+rs1+"\n"+"Total Charges ="+tot2);
		            }
		            if(unit>=301 && unit<=400){
			            System.out.println("100*2 =200\n100*4 =400\n100*6 =600\n"+rem2+"*8 ="+rs2+"\nTotal charges ="+tot3);
		            }
		            if(unit>=401){
			            System.out.println("100*2 =200\n100*4 =400\n100*6 =600\n100*8 =800\n"+rem3+"*10 ="+rs3+"\nTotal Charges ="+tot4);
		            }
					System.out.println("Do you want to run again!");
					con=obj.next().charAt(0);
					
				}while(con=='y' || con=='Y');
			}
			if(sel==6){
				char ch2='T';
				do{
				    System.out.println("1, Fibnocci Series");
			     	System.out.println("2, Unknown Series");
				    System.out.println("3, Even/Odd Series");
				    System.out.println("4, Table Series");
			 	    System.out.println("5, Star Series");
				    System.out.println("6, back");
					System.out.print("Enter your Selection:");
				    int oper=obj.nextInt();
					
					if(oper==1){
						char ch3;
						do{
		                    System.out.print("Enter any No =");
		                    int no= obj.nextInt();
		                    int a=0,b=1,c;
	
		                    for(int i=1; i<=no; i++){
			                    System.out.println(b);
			                    c=a+b;
		                        a=b;
		                        b=c;
		                    }
							System.out.print("Do you want to run again!");
							ch3=obj.next().charAt(0);
							
						}while(ch3=='y' || ch3=='Y');
					}
					if(oper==2){
						char ch3;
						do{
							System.out.print("Enter any No =");
		                    int no=obj.nextInt();
		                    int a=0,b=3,c,d;
		
		                    for(int i=0; i<=no; i++){
			                    System.out.println(a);
			                    c=a+b;
			                    d=i+i;
			                    a=c+d;
		                    }
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
					}
					if(oper==3){
						char ch3;
						do{
							System.out.print("Enter any No =");
		                    int no= obj.nextInt();
		                    System.out.println("Odd  Even");
	
		                    for(int i=1; i<=no; i+=2){
			                System.out.println((i  )+ "     " +( i+1)+"\n");
		                    }
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
					}
					if(oper==4){
						char ch3='y';
						do{
							System.out.print("Enter table no:");
							int table=obj.nextInt();
							System.out.print("Enter Counter no:");
							int counter=obj.nextInt();
							
							for(int i=1; i<=counter; i++){
								System.out.println(table+" x"+i+" ="+(table*i));
							}
							System.out.println();
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
							
						}while(ch3=='y' || ch3=='Y');
					}
					if(oper==5){
						char ch3;
						do{
							System.out.print("Enter Rows :");
		                    int row=obj.nextInt();
		                    System.out.print("Enter Columns :");
		                    int column=obj.nextInt();
		
		                    for(int i=1; i<=row; i++){
			
			                    for(int k=1; k<=column; k++){
				                    System.out.print(" * ");
		                        }
			                    System.out.println();
			                }
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
							
						}while(ch3=='y' || ch3=='Y');
					}
					if(oper==6){
						ch2='f';
					}
                    if(oper>=7 || oper<1){
						System.out.println("Invalid Selection!");
						System.out.println();
					}					
				}while(ch2=='T');
			}
			if(sel==7){
				char ch2='T';
				do{
					System.out.println("1, Fibnocci Series");
			     	System.out.println("2, Unknown Series");
				    System.out.println("3, Even/Odd Series");
				    System.out.println("4, Table Series");
			 	    System.out.println("5, Star Series");
				    System.out.println("6, back");
					System.out.print("Enter your Selection:");
				    int op=obj.nextInt();
					
					if(op==1){
						char ch3='y';
						while(ch3=='y' || ch3=='Y'){
							System.out.print("Enter NO:");
			                int no=obj.nextInt();
			                int a=0,b=1,c;
			
			                int i=1;
			                while(i<=no){
				                System.out.println(b);
				                c=(a+b);
				                a=b;
				                b=c;
				
				                i++;
			                }
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}
					}
					if(op==2){
						char ch3='y';
						while(ch3=='y' || ch3=='Y'){
							System.out.print("Enter no:");
							int no=obj.nextInt();
							int a=0,b=3, c,d;
							int i=0;
							while(i<no){
							    System.out.println(a);
								c=a+b;
								d=(i+i);
								a=c+d;
								i++;
							}
							System.out.println();
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
							
						}
					}
					if(op==3){
						char ch3='y';
		                    while(ch3=='y' || ch3=='Y'){
			                    System.out.print("Enter no");
			                    int no=obj.nextInt();
			                    System.out.println("Even\tOdd");
			
			                    int i=1;
			                    while(i<=no){
				                    System.out.println((i+1)+"\t"+(i));
				                    i+=2;
			                    }
			                    System.out.print("Do you want to run again :");
			                    ch3=obj.next().charAt(0);
		                    }
					}
					if(op==4){
						
						char ch3='y';
		                while(ch3=='y' || ch3=='Y'){
			                System.out.print("Enter table no:");
			                int table=obj.nextInt();
			                System.out.print("Enter counter no:");
							int counter=obj.nextInt();
			
			                int i=1;
			                while(i<=counter){
				                System.out.println(table+" x"+i+" ="+(table*i));
				                i++;
			                }
			                System.out.print("Do you want to run again :");
			                ch3=obj.next().charAt(0);
		                    
					    }
					}
					if(op==5){
						char ch3='y';
						while(ch3=='y' || ch3=='Y'){
							System.out.print("Enter rows:");
							int row=obj.nextInt();
							System.out.print("Enter columns:");
							int column=obj.nextInt();
							
							int i=1;
							while(i<=row){
								int k=1;
								while(k<=column){
									System.out.print("*");
									k++;
								}
								System.out.println();
								i++;
							}
							System.out.println();
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}
					}
					if(op==6){
						ch2='f';
					}
					if(op>6 || op<1){
						System.out.println("Invalid Selection!");
						System.out.println();
					}
					
				}while(ch2=='T');
			}
			if(sel==8){
				char ch2='T';
				do{
					System.out.println("1, Fibnocci Series");
			     	System.out.println("2, Unknown Series");
				    System.out.println("3, Even/Odd Series");
				    System.out.println("4, Table Series");
			 	    System.out.println("5, Star Series");
				    System.out.println("6, back");
					System.out.print("Enter your Selection:");
				    int op=obj.nextInt();
					
					if(op==1){
						char ch3='y';
						do{
							System.out.print("Enter NO:");
			                int no=obj.nextInt();
			                int a=0,b=1,c;
			
			                int i=1;
			                do{
				                System.out.println(b);
				                c=(a+b);
				                a=b;
				                b=c;
				
				                i++;
			                }while(i<=no);
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
						
					}
					if(op==2){
						char ch3='y';
						do{
							System.out.print("Enter NO:");
			                int no=obj.nextInt();
			                int a=0,b=3, c,d;
			
			                int i=0;
			                do{
				                System.out.println(a);
								c=a+b;
								d=(i+i);
								a=c+d;
								i++;
								
			                }while(i<no);
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
						
					}
					if(op==3){
						char ch3='y';
		                do{
			                System.out.print("Enter no:");
			                int no=obj.nextInt();
			                System.out.println("Even\tOdd");
			
			                int i=1;
			                do{
				                System.out.println((i+1)+"\t"+(i));
				                i+=2;
			                }while(i<=no);
			                System.out.print("Do you want to run again :");
			                ch3=obj.next().charAt(0);
		                }while(ch3=='y' || ch3=='Y');	
					}
					if(op==4){
						char ch3='y';
		                do{
			                System.out.print("Enter table no:");
			                int table=obj.nextInt();
			                System.out.print("Enter counter no:");
							int counter=obj.nextInt();
			
			                int i=1;
			                do{
				                System.out.println(table+" x"+i+" ="+(table*i));
				                i++;
			                }while(i<=counter);
			                System.out.print("Do you want to run again :");
			                ch3=obj.next().charAt(0);
		                    
					    }while(ch3=='y' || ch3=='Y');
					}
					if(op==5){
						char ch3='y';
						do{
							System.out.print("Enter rows:");
							int row=obj.nextInt();
							System.out.print("Enter columns:");
							int column=obj.nextInt();
							
							int i=1;
							do{
								int k=1;
								do{
									System.out.print("*");
									k++;
								}while(k<=column);
								System.out.println();
								i++;
							}while(i<=row);
							System.out.println();
							System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
						
					}
					if(op==6){
						ch2='f';
					}
					if(op>6 || op<1){
						System.out.println("Invalid Selection!");
						System.out.println();
					}
				}while(ch2=='T');
			}
			if(sel==9){
				char ch2='T';
				do{
					System.out.println("1, Feet to inch");
					System.out.println("2, inches to feet");
					System.out.println("3, Kilo to gram");
					System.out.println("4, Gram to kilo");
					System.out.println("5, Back");
					System.out.print("Enter your Selection:");
					int op=obj.nextInt();
					
					if(op==1){
						char ch3;
						do{
						    System.out.print("Enter feet:");
						    int feet=obj.nextInt();
						    System.out.println(feet*12+" inches\n");
						    System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
					}
					if(op==2){
						char ch3;
						do{
						    System.out.print("Enter Inches:");
						    int inch=obj.nextInt();
						    System.out.println(inch/12+" feet\n");
						    System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
					}
					if(op==3){
						char ch3;
						do{
						    System.out.print("Enter Kilo:");
						    int kilo=obj.nextInt();
						    System.out.println(kilo*1000+" grams\n");
						    System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
					}
					if(op==4){
						
						char ch3;
						do{
						    System.out.print("Enter Grams:");
						    int gram=obj.nextInt();
						    System.out.println(gram/1000+" Kilo\n");
						    System.out.print("Do you want to run again:");
							ch3=obj.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
					}
					if(op==5){
						ch2='f';
					}
					if(op>5 || op<1){
						System.out.println("Invalid Selection!");
						System.out.println();
					}
					
				}while(ch2=='T');
			}
			if(sel==10){
				ch='f';
			}
			if(sel>10 || sel<1){
				System.out.println("Invalid Selection!");
				System.out.println();
			}
		}while(ch=='T');
	}
}