import java.util.*;
class StringSearch{
	public static void main(String arg[]){
	Scanner ob=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=ob.nextInt();
		String data[]=new String[size];
		System.out.println("Enter "+size+" Items");
		for(int i=0; i<data.length;i++){
			data[i]=ob.next();
		}
		System.out.println("Enter Item you want to Search:");
		String item=ob.next();
		int loc=0;
		boolean b=true;
			
		for(int i=0; i<data.length; i++){
			if(data[i].equals(item)){
				item=data[i];
				loc=i;
				b=false;
			}
		}
		if(b==false){
			System.out.println(item+" found on "+loc+" location");
		}else{
			System.out.println(item+"not found");
		}
			
	}
}