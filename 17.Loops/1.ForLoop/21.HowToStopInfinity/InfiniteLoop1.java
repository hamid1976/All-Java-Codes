import java.util.*;
class InfiniteLoop1{
	public static void main(String arg[]){
		int i=1;
		for(;  ;){
			System.out.println(i);
			i++;
			if(i==5)
			break;
		}
	}
}
// output
// 1
// 2
// 3
// 4