import java.util.*;
class MaximumValueInArrayBySwapping{
	 public static void main(String args[]){  
     	Scanner ob=new Scanner(System.in);
	    int data[]={90,10,220,30,100};
	    int temp;
	
	    System.out.println("Array Before Swapping");
	    for(int x=0;x<data.length;x++){
		    System.out.println("["+x+"]:"+data[x]); 
	    }
	
	    for(int i=0; i<data.length-1;i++){
	       if(data[i]>data[i+1]){
		       temp=data[i];
		       data[i]=data[i+1];
		       data[i+1]=temp;
	       }
	    }
	    System.out.println("Array After Swapping");
	    for(int k=0;k<data.length;k++){
		    System.out.println("data["+k+"]:"+data[k]); 
	    }
	}
}