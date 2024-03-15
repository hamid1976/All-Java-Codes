import java.util.*;

class Oop3{
	
	public static void main(String arg[]){
		
		Loop ob1=new Loop();
		Loop ob2=new Loop();
		
		ob1.Set(10); ob2.Set(20);
		
		ob1.Even();
		ob1.Odd();
		ob1.Fact();
		ob1.Prime();
		
		ob2.Even();
		ob2.Odd();
		ob2.Fact();
		ob2.Prime();
		
		
		
		
		
		
	}
}

class Loop{
	
	int num;
	
	void Set(int n){
		
		num=n;
	}
	
	
	void Even(){
		System.out.print("== Even ==");
		for(int i=1; i<=num; i+=2){
			
			System.out.print("\n"+i);
		}
	}
	
	void Odd(){
		System.out.print("\n== Odd ==");
		for(int i=2; i<=num; i+=2){
			
			System.out.print("\n"+i);
		}
	}
	
	void Fact(){
		
		System.out.println("\n==Factorial Number ==");
		
		int str=1;
		for(int i=1; i<=num; i++){
			
			str=str*i;
			System.out.println(str);
			
		}
		
	}
	
	void Prime(){
		System.out.println("== Prime Number ==");
		
            		for(int i=1; i<=num; i++){
        			int counter=0;
			
        		    	for(int k=2; k<=i-1; k++){
				
     		    		if(i%k==0){
		    			counter=counter+1;
        				}
						
            			}
				
            				if(counter==0)
        					System.out.println(i);
				
            		}
	}
	
	
}











 