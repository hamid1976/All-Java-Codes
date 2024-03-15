import java.util.*;

class Programtest{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		Calculator ob=new Calculator();
		
		
		
		// boolean a=ob.even();
		// System.out.print(a);
		
		// boolean b=ob.prime();
		// System.out.print(b);
		
		// boolean c=ob.positive();
		// System.out.print(c);
		
		
		// String d=ob.Season();
		// System.out.print(d);
		
		
		// int e=ob.bill();
		// System.out.print(e);
		
		int v1=as.nextInt();
		int v2=as.nextInt();
	//	char n='+';
		
		int f1=ob.operater(v1,v2,'+');
		int f2=ob.operater(v1,v2,'-');
		int f3=ob.operater(v1,v2,'*');
		int f4=ob.operater(v1,v2,'/');
		int f5=ob.operater(v1,v2,'%');
		
		 System.out.println(f1);
		 System.out.println(f2);
		 System.out.println(f3);
		 System.out.println(f4);
		 System.out.println(f5);
		
		
		
		
		
	







	
		
	}
}

class Calculator{
	 Scanner as=new Scanner(System.in);
	
	// boolean even(){
		
		// System.out.print("Enter any No ");
		// int num=as.nextInt();
		
		// for(int k=2; k<=num; k+=2){
			
		
		
		
		// if(num%k==0)
			// return true;
		// else 
			// return false;
		
		 
	
				// }
				
				 // return true;
				
				
				// }
				
				
				
				
	// boolean prime(){
		// Scanner as=new Scanner(System.in);
		
		// (== 7.Prime NO Series Start ==)
				
					// System.out.print("\nEnter Any No ");
            		// int num=as.nextInt();
		
		
		
            	
        			// int counter=0;
			
        		    	// for(int k=2; k<=num-1; k++){
				
     		    		// if(num%k==0){
		    			// counter=counter+1;
        				// }
						
            			// }
				
            				// if(counter==0){
							// return true;
							// }
						// else{
							// return false;
						// }
							
					
				
				// (== 7.Prime NO Series End  ==)
		
		
	// }	

      
      // boolean positive(){
		  
		  // System.out.print("Enter Number ");
		  // int a=as.nextInt();
		  
		  // if(a>0)
			  // return true;
		  // else
			  // return false;
	  // }


// String Season(){
		// Scanner as=new Scanner(System.in);
		
		   // System.out.print("Enter Season No ");
    		// int z=as.nextInt();
		
    		// String season;
		
    		// switch(z){
    			// case 11:
    			// case 12:
	    		// case 1:
		    	// season = "Season is Winter";break;
    			// case 2:
    			// case 3:
    			// case 4:
    			// season = "Season is Spring";break;
    			// case 5:
    			// case 6:
    			// case 7:
    			// season = "Season is Summer";break;
    			// case 8:
    			// case 9:
    			// case 10:
    			// season = "Season is Autumn";break;
				
    			// default:
    			// return  "Invalid Month";
    		// }
    		
			// return season;
	// }	


// int bill(){
		// Scanner as=new Scanner(System.in);
		
			//(== Hesco Bill  Calculator Start ==)
			
		// System.out.print("Enter Units bill ");
		// int unit=as.nextInt();
		
		// if(unit>=1 && unit<=100){
			// int a=unit*2;
			
		
		  // return a;
		// }
		
		
		
		
		// if(unit>100 && unit<=200){
			// int a=100*2;
			// int b=(unit-100)*4;
			// System.out.print("\n100*2="+a);
			// System.out.print("\n");
			// System.out.print((unit-100)+"*4="+b+"\n");
			
			// return (a+b);
		// }
		// if(unit>200 &&  unit<=300){
			// int a=100*2;
			// int b=100*4;
			// int c=(unit-200)*6;
			// System.out.print("100*2="+a);
			// System.out.print("\n100*4="+b);
			// System.out.print("\n");
			// System.out.print((unit-200)+"*6="+c+"\n");
			
			// return (a+b+c);
			
		// }
		// if(unit>300 && unit<=400){
			// int a=100*2;
			// int b=100*4;
			// int c=100*6;
			// int d=(unit-300)*8;
			// System.out.print("100*2="+a);
			// System.out.print("\n100*4="+b);
			// System.out.print("\n100*6="+c);
			// System.out.print("\n");
			// System.out.print((unit-300)+"*8="+d+"\n");
		
			// return (a+b+c+d);
		// }
		// if(unit>400){
			// int a=100*2;
			// int b=100*4;
			// int c=100*6;
			// int d=100*8;
			// int e=(unit-400)*10;
			// System.out.print("100*2="+a);
			// System.out.print("\n100*4="+b);
			// System.out.print("\n100*6="+c);
			// System.out.print("\n100*8="+d);
			// System.out.print("\n");
			// System.out.print((unit-400)+"*10="+e);
			
			// return (a+b+c+d+e);
		// }
			
			// (== Hesco Bill  Calculator End ==)
			// return unit;
	// }	
	
	
	int operater(int a, int b,char op){
		
		if(op=='+'){return a+b;}
	
		
		return op;
		
		
		
	}
				
				
				
	
	
	
	
}