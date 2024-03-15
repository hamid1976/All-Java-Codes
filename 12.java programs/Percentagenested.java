import java.util.*;

class Percentagenested{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Percentage ");
		int a=as.nextInt();
		
		if(a==90 || a==91 || a==92 || a==93 || a==94 || a==95 || a==96 || a==97 || a==98 || a==99 || a==100)
			System.out.print("A-1");
		
		if(a==80 || a==81  || a==82 || a==83  || a==84  || a==85  || a==86  || a==87  || a==88  || a==89)
			System.out.print("A");
		
		if(a==70 || a==71  || a==72  || a==73  || a==74  || a==75  || a==76  || a==77  || a==78  || a==79)
			System.out.print("B");
		
		if(a==60 || a==61  || a==62  || a==63  || a==64  || a==65  || a==66  || a==67  || a==68  || a==69 )
			System.out.print("C");
		
		if(a==50 || a==51  || a==52  || a==53  || a==54  || a==55  || a==56  || a==57  || a==58  || a==59 )
			System.out.print("D");
		
		if(a==40 || a==41  || a==42  || a==43  || a==44  || a==45  || a==46  || a==47  || a==48  || a==49  )
			System.out.print("E");
		if(a<=39)
			System.out.print("F");
		
		
		
	}
}