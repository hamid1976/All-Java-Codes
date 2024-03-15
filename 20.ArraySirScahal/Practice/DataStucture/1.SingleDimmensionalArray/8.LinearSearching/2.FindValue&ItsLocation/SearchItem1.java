import java.util.*;
class SearchItem1{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			System.out.print("Enter Array Size:");
			int size=ob.nextInt();
			int data[]=new int[size];
			System.out.println("Enter "+ size+" Items");
		    int b=0;
			for(int j=0; j<data.length; j++){
				data[j]=ob.nextInt();
			}
			System.out.println("which Item you want to search Enter Item?");
			int item=ob.nextInt();
			int i;
			for(i=0; i<data.length;i++){
				if(data[i]==item){
					//k=data[i];
					b=1;
					break;
				}
			}
				if(b==1)
					System.out.println(item+" found and its location is "+(i+1));
			    else
			     System.out.println(item+ " Not Found");
			 
		
	}
}