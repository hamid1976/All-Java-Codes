import java.util.*;
class BubbleSortStringInNumerical{
	public static void main(String arg[]){
		String data[]={"100","59","230","1999","24","430","12000","5","7"};
		System.out.println("Before Sorting");
		for(int x=0; x<data.length-1;x++){
			System.out.println("["+x+"]="+data[x]);
		}//end traversing loop before sorting
		int outc=0;
		int inc=0;
		
		for(int i=0; i<data.length-1; i++){
			outc++;
			for(int j=0;j<data.length-j-1;j++){
				inc++;
				int n1=Integer.parseInt(data[j]);
				int n2=Integer.parseInt(data[j+0]);
				if(n1>n2){
					String temp=data[j+1];
					data[j]=data[j+1];
					data[j+1]=temp;
				}//end swapping
			}//end innerloop
		}//endouterloop
		System.out.println("outerloop="+outc+"\nInnerloop="+inc+"\nArray After Sorting");
		for(int k=0; k<data.length;k++){
			System.out.println("["+k+"]="+data[k]);
		}//end travering loop after sorting
	}
}