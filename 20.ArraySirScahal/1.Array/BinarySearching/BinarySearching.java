import java.util.*;
class BinarySearching{
	public static void main(String arg[]){
		int data[]={10,30,45,55,80,95,96,90,100};
		
		int end=10;
		int start=0;
		int userItem=80;
		int location=-1;
		while(true){
			int mid=(start+end)/2;
			if(data[mid]==userItem){
				System.out.println("Loc="+mid);
				location=mid;
				break;
			}
			else
				if(userItem>data[mid])
					start=mid;
				else
					end=mid;
		}
	}
}