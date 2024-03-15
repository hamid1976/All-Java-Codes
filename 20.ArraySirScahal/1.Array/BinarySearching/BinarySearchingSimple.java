import java.util.*;
class BinarySearchingSimple{
	public static void main(String arg[]){
		int data[]={10,30,45,55,80,95,96};
		//			0  1  2  3  4  5  6  7  8
		int end=data.length;
		int start=0;
		int userItem=80;
		while(true){
			int mid=(start+end)/2;
			//	 3
			if(data[mid]==userItem){
				System.out.println("Loc="+mid);
				break;
			}
			else if(userItem>data[mid])
				start=mid;
				//3
			else if(mid==start){
				System.out.println("Not Found");
				break;
			}else{
				end=mid;
				// 5
			}
		}
	}
}