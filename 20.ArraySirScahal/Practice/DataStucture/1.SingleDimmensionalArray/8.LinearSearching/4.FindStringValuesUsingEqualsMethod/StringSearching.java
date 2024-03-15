import java.util.*;
class StringSearching{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size:");
		int size=ob.nextInt();
		String data[]=new String[size];
		System.out.println("Enter "+size+" Items");
		for(int i=0; i<data.length;i++){
			data[i]=ob.next();
		}
		System.out.println("Which name you want to search:");
		String item=ob.next();
		boolean b=false;
		int i;
		for(i=0; i<data.length; i++){
			if(data[i].equals(item)){
				b=true;
				break;
			}
		}
		if(b==true){
			System.out.print(item+" is on location "+i);
		}else
			System.out.print(item+"Not Found");
	}
}