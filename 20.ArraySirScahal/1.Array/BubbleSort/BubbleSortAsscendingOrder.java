import java.util.*;
class BubbleSortAsscendingOrder{
	public static void main(String arg[]){
		int data[]={1000,909,535,153,1324,865,454,365,813,463,263,757,222,758,422,853,553,116,43,56,12,23,21,4,93,33,54,3};
		int outc=0;
		int inc=0;
		for(int i=0; i<data.length-1;i++){
			System.out.println("["+i+"]="+data[i]);
		}
		for(int j=1; j<data.length; j++){
			outc++;
			for(int k=0;k<data.length-j;k++){
				inc++;
				if(data[k]>data[k+1]){
					data[k]=data[k]+data[k+1];
					data[k+1]=data[k]-data[k+1];
					data[k]=data[k]-data[k+1];
				}
			}
		}
		System.out.println("outerloop="+outc+"\nInnerloop="+inc+"\nTraversing After Sorting");
		for(int k=0; k<data.length;k++){
			System.out.println("["+k+"]="+data[k]);
		}
		}
	}