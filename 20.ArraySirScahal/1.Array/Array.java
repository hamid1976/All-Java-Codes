import java.util.*;
class Array{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		int a [] = {41,32,100,81,16};
        int i;
        System.out.print("Enter the element: ");
        int check=ob.nextInt();
        for(i=0;i<5;i++){
		
          if(check==a[i])
        {
        System.out.print("Fount at index: "+(i+1));
        break;
}
}
	}
}