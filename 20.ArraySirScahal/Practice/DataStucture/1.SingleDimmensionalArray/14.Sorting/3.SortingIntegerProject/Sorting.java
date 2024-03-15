import java.util.*;
class Sorting{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		int data[]={50,90,30,20,25,40,10};
		int temp;
		do{
		System.out.println("1.Ascneding Order\n2.Disassending Order\n3.Traversing\n4.Exit");
		int sel=ob.nextInt();
		
		if(sel==1){
			for(int i=0; i<data.length;i++){
				for(int j=0; j<data.length-1;j++){
					if(data[j]>data[j+1]){
						temp=data[j];
						data[j]=data[j+1];
						data[j+1]=data[j];
					}
				}
			}
			System.out.println("Asscending order done Succesfully");
		}//end Ascending Order
		//System.out.println(data[j]);
		if(sel==2){
			for(int i=0; i<data.length;i++){
				for(int j=data.length-1;j>0;j--){
					if(data[j]<data[j-1]){
						temp=data[j];
						data[j]=data[j-1];
						data[j-1]=data[j];
					}
				}
			}
			System.out.println("Disaccending order done Succesfully");
		}//end Discending Order
		if(sel==3){
			System.out.println("Traversing");
			for(int i=0; i<data.length; i++){
				System.out.println(data[i]);
			}
		}
		if(sel==4){
			System.exit(0);
		}
		}while(true);
		// for( i=0; i<data.length; i++){
			// System.out.println(data[i]);
			// }
	}
}