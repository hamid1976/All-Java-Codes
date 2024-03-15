import java.util.*;
class Test{
	
		static int data[]={10,546,8,3,12,65,0,98,54,232468,907,34234,65789,97,3437,789,7};
		static int temp;
		static void asscending(){
			System.out.println("Bubble Sorting In Ascending order Done");
			for(int j=0; j<data.length;){
				for(int i=0; i<data.length-1; i++){
					if(data[i]>data[i+1]){
						temp=data[i];
						data[i]=data[i+1];
						data[i+1]=temp;
					}
				}
				j++;
			}
		}
		static void descending(){
			System.out.println("Bubble Sorting In Descending order Done");
			for(int j=0; j<data.length;){
				for(int i=0; i<data.length-1; i++){
					if(data[i]<data[i+1]){
						temp=data[i];
						data[i]=data[i+1];
						data[i+1]=temp;
					}
				}
				j++;
			}
		}
		static void traversing(){
			System.out.println("Traversing");
			for(int k=0; k<data.length; k++){
			System.out.println("["+k+"]="+data[k]);
			}
		}
}
class MiniBubbleSort{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			int in;
			do{
				System.out.print("1.Ascending Order \n2.Descending Order \n3.Traversing \n4.Exit \nEnter Selection");
				in=ob.nextInt();
				switch(in){
					case 1:Test.asscending();break;
					case 2:Test.descending();break;
					case 3:Test.traversing();break;
				}
				if(in<1 || in>4)
					System.out.println("Invalid Selection");
			}while(in!=4);
	}
}