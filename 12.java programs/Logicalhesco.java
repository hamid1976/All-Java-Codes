import java.util.*;

class Logicalhesco{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("\nEnter Electric unit ");
		int a=as.nextInt();
		
		int b=a%100*4;
		int c=a%200*6;
		int d=a%300*8;
		int e=a%400*10;
		
		if(a>=1 && a<100){
			
			System.out.print("\ncharges1 will be: "+(a*2));
		}
		if(a>=100 && a<200){
		System.out.print("\n100*2=200 \n20*4="+b);
		
		System.out.print("\nCharges2 will be: "+(a*4 -200));	
		}
		if(a>=200 && a<300){
			System.out.print("\n100*2=200 \n100*4=400 \n 20*6="+c);
			
			System.out.print("\nChargers3 will be: "+(a*6 -600));
		
		}
		if(a>=300 && a<400){
			System.out.print("\n100*2=200 \n100*4=400 \n100*6=600 \n30*8="+d);
			System.out.print("Chargers4 will be:"+(a*8 -1200));
		}
			if(a>=400 && a<500){
				System.out.print("\n100*2=200 \n100*4=400 \n100*6=600 \n100*8=800 \n40*10="+e);
			
			System.out.print("\nChargers5 will be: "+(a*10 -2000));
			}
		
		
	}
}
		

	