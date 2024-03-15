import java.util.*;
class GreaterSmaller1{
	public static void main(String arg[]){
		ArrayList<Integer> value=new ArrayList<Integer>();
		
		System.out.println("Enter values , Q to Quit :");
		Scanner ob=new Scanner(System.in);
		
	
		while(ob.hasNextInt()){
			value.add(ob.nextInt());
		}
		
		int largest=value.get(0);
		int small=value.get(0);
		int loc=0;
		int loc1=0;
		
		for(int i=0; i<value.size();  i++){
			if(value.get(i)>largest){
				largest=value.get(i);
				loc=i;
			}
			if(value.get(i)<small){
				small=value.get(i);
				loc1=i;
			}
		}
		System.out.println(largest+" is largest and its location is "+loc);
		System.out.println(small+" is Smallest and its location is "+loc1);
	}
}