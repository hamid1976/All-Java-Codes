import java.util.*;
class SwitchMonth{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Month?");
		int Month=ob.nextInt();
		
		switch(Month){
			
			case 11: 
		    case 12: 
     		case 1:System.out.println(" Season is winter");
                    break; 
			case 2:
			case 3:      
			case 4:System.out.println(" Season is Spring");
			        break;
			case 5:       
            case 6:        
            case 7:System.out.println(" Season is Summer");
			        break;
			case 8:       
            case 9:        
            case 10:System.out.println(" Season is Automn");
			        break;					
            default:System.out.println("Invalid Month no");
		}
		}	
}		