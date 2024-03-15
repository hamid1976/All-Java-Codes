import java.util.*;
class Str{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size");
		int size=ob.nextInt();
		String data[]=new String[size];
		System.out.println("Enter "+size+" Items");
		for(int k=0;k<data.length;k++){
			data[k]=ob.next();
		}
		String temp="";
		System.out.println("1.Ascending Order \n2.Descending Order \n3.Traversing");
		int sel=ob.nextInt();
		if(sel==3){
			System.out.println("Before Sorting");
			for(int k=0;k<data.length;k++){
				System.out.println("data["+k+"]="+data[k]);
			}
		}
		if(sel==1){
			for(int j=0; j<data.length;j++){
				for(int i=0; i<data.length-1; i++){
					int code=data[i].compareTo(data[i+1]);
					if(code>0){
						temp=data[i];
						data[i]=data[i+1];
						data[i+1]=temp;
					}
				}
			}
		}
		if(sel==2){
			for(int j=0; j<data.length;j++){
				for(int i=0; i<data.length-1; i++){
					int code=data[i].compareTo(data[i+1]);
					if(code<0){
						temp=data[i];
						data[i]=data[i+1];
						data[i+1]=temp;
					}
				}
			}
		}
		System.out.println("After Sorting");
		for(int k=0;k<data.length;k++){
			System.out.println("data["+k+"]="+data[k]);
		}
	}
}
