import java.util.*;
class SwitchPercentage{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print(" Enter percentage? ");
		int percentage=ob.nextInt();
		String per=Integer.toString(percentage);
		
		
		
		switch(per){
			
			case("90"):System.out.println("A-1 Grade");
			        break;
		    case("80"):System.out.println("A Grade");
			        break;
     		case("70"):System.out.println("B Grade");
		            
			case("60"):System.out.println("C Grade");
			        break;
			
			case("50"):System.out.println("D Grade");
			        break;
            case("40"):System.out.println("fail");
			        break;		
            default:System.out.println("Invalid percentage");
		}
		}	
}	