import java.util.*;

class Testloopwhile20{
	
    public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch1='y';
		
		while(ch1=='y' || ch1=='Y'){
		System.out.print("Enter Alphabetic letter ");
		char letter=as.next().charAt(0);
		
		int i=0;
		
		while(i<letter-64){
			
			char ch=65;
			
			while(ch<=letter-i){
				
				System.out.print(ch);
				ch++;
				
			}
			System.out.println();
			i++;
		}
		System.out.print("Do you want to run this system again Enter y  ");
			ch1=as.next().charAt(0);
			
		}
		
		
		
	}
}
			
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	char ch1=ch;
		
	//	for(char i=65; i<=ch; i++){
	//		
	//		for(char j=65; j<=ch1; j++){
	//			
	//			System.out.print(j);
	//		}
	//		System.out.println();
		//	ch1-=1;
	//	}
		
		
		
		
	//	int i=0;
		
	//	while(i<letter-i){
			
	//		char ch=65;
	//		while(ch<letter-i){
				
	//			System.out.print(ch);
				//ch++;
	//		}
	//		System.out.println();
	//		i++;
	//	}
		
	
