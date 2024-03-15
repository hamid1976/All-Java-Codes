import java.util.*;
class SearchItem{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			System.out.print("Enter Array Size:");
			int size=ob.nextInt();
			int data[]=new int[size];
			System.out.println("Enter "+ size+" Items");
			boolean b=true;
			for(int j=0; j<data.length; j++){
				data[j]=ob.nextInt();
			}
			System.out.println("which Item you want to search Enter Item?");
			int k=ob.nextInt();
			int i;
			for(i=0; i<data.length;i++){
				if(data[i]==k){
					k=data[i];
					b=false;
					break;
				}
			}
				if(b==false)
					System.out.println(k+" found and its location is "+(i+1));
			    else
			     System.out.println(k+ " Not Found");
			 
		
	}
}