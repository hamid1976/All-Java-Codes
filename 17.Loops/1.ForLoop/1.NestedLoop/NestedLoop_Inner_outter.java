import java.util.*;
class NestedLoop_Inner_outter{
	public static void main(String arg[]){
		
		for (int i=1; i<=5; i++){
			System.out.println("outter loop:"+i);
			for(int j=1; j<=10; j++){
				System.out.println("Inner Loop:"+j);
			}
		}//end
	}
}