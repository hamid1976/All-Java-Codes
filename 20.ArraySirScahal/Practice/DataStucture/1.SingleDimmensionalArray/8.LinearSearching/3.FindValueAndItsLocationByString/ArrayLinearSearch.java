import java.util.*;
class ArrayLinearSearch{
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter Array Size : ");
		int size=input.nextInt();
		
		int data[]=new int[size];
		
		System.out.println("Enter "+size+" items");
		
		for(int i=0;i<data.length;i++){
			data[i]=input.nextInt();
		}//end data[] input loop
		
		System.out.print("Which Number You Want To Search Enter Number : ");
		int num=input.nextInt();
		
		String str= "";

		for(int k=0;k<data.length;k++){
			if(data[k]==num){
				str=("it`s Location is "+(k+1));
				break;
			}//end if searching
			else
				str=(num+" Not found");
		        
		}//end searching loop
		
		System.out.println(str);
	}
}