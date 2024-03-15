import java.util.*;

class TestlogicalOP3{
	
	public static void main(String age[]){
		
	
	    Scanner as=new Scanner(System.in);
	
	    System.out.print("Enter 1st No  ");
	    int age1=as.nextInt();
	
	    System.out.print("Enter 2nd No  ");
	    int age2=as.nextInt();
	
	    System.out.print("Enter 3nd No  ");
	    int age3=as.nextInt();
	
	    System.out.print("Enter 4nd No  ");
	    int age4=as.nextInt();
	
	    System.out.print("Enter 5nd No  ");
	    int age5=as.nextInt();
	
	    System.out.print("Enter 6nd No  ");
	    int age6=as.nextInt();
		
		System.out.println("Marks       "+age1+" "+age2+" "+age3+" "+age4+" "+age5+" "+age6);
	
	
	    if(age1>=1 && age1<=39){
		    System.out.println("F");
		}
	    if(age2>=40 && age2<=49){
		    System.out.println("D");
		}
	    if(age3>=50 && age3<=59){
		    System.out.println("C");
		}
	    if(age4>=60 && age4<=79){
		    System.out.println("B");
		}
	    if(age5>=80 && age5<=89){
		    System.out.println("A");
		}
	    if(age6>=90 && age6<=100){
		    System.out.println("A+");
		}
	}
}

	
	
