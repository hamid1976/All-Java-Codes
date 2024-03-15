import java.util.*;
class Mark2{
public static void main(String arg[]){
Scanner ob =new Scanner(System.in);
System.out.print("Enter java    Mark ");
int a , b , c , d , e ,TObtain , Total, P ;
a =ob.nextInt();

System.out.print("Enter English Mark ");
 b =ob.nextInt();

System.out.print("Enter Sindhi  Mark ");
 c =ob.nextInt();

System.out.print("Enter Math    Mark ");
 d =ob.nextInt();

System.out.print("Enter Urdu    Mark ");
 e =ob.nextInt();

 TObtain = (a+b+c+d+e);
System.out.println("Obtained : "+ TObtain);
 Total = 500;
System.out.println("Total Mark "+ Total);
 P = TObtain*100/Total;
System.out.println("percentage :"+ P+"%");
    
	if (P>=90 && P<=100)
		System.out.print("A-1 Grade ");
	else if (P>=80 && P<=89)
		System.out.print("A Grade ");
	else if (P>=70 && P<=79)
		System.out.print("B Grade ");
	else if (P>=60 && P<=69)
		System.out.print("C Grade ");
	else if (P>=50 && P<=59)
		System.out.print("D Grade ");
	else if (P>=40 && P<=49)
		System.out.print("E Grade ");
	else 
		System.out.print("fale ");
	
	}
 
}