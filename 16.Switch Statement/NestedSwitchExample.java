import java.util.*;
class NestedSwitchExample{

public static void main(String args[]){

	
Scanner ob=new Scanner(System.in);

	
	System.out.println("Enter your\n1.Add\n2.Sub\nEnter yiur option?");
	int option=ob.nextInt();
    switch(option){
		case 1:
		System.out.println("Mini Calculatorn1.Add\n2.Sub\nEnter yiur option?");
        option=ob.nextInt();
		switch(option){
			case 1:
					System.out.println("Add");
					break;

		}
		System.out.println("Add");
		break;
	}// end of switch		
	
	
	
}	
	
}