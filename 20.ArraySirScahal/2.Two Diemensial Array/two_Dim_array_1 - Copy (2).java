import java.util.*;
class two_Dim_array_1{
       public static void main(String arg[]){
		   Scanner ob =new Scanner(System.in);
		   System.out.println("two Dimensional Array ");
		   System.out.print("Enter number student ");
		   int row =ob.nextInt();
		   System.out.println("number of colums constuctor  ");
		   String data[][]=new String[row][3];
		  int data1;
		   int i;
		   for(i=0; i<row; i++){
			   System.out.println("\nEnter data of student "+(i+1));
			   System.out.print("name ");
			   data[i][0]=ob.next();
			    System.out.print("Subjects ");
			   data[i][1]=ob.next();
			    System.out.print("Marks ");
			   data[i][2]=ob.next();
			   
		   }
		  
		   for(i=0;i<data.length;i++)
	data1=Integer.parseInt(data[i][2]);
     int a;
    do{	 
			   System.out.print("\n\n1.sort by name\n2.sort by subject\n3.sort by Marks\n4.traversing\nEnter sel  ");
			a=ob.nextInt();
			if(a==1)
				   rec.strName(data);
			if(a==2) 
				   rec.strsub(data);
		    if(a==3)
			       rec.strMarks(data);
		    if(a==4) 
				   rec.traversing(data);
				   
	   }while(a!=5);
		  
		   }
		   
	   }


class rec{
	static void strName(String data[][]){
		System.out.println("Name sorting has been done ");
		int num,i;
		for(i=0; i<data.length-1; i++){
			for(int j=0; j<data.length-1; j++){
				num=data[j][0].compareTo(data[j+1][0]);
			if(num>0){
				String temp []=data[j];
				data [j]=data[j+1];
				data [j+1]=temp;
			}
			}
			
		}
	}
	static void strsub(String data[][]){
		System.out.println("Subject sorting has been done ");
		int num,i;
		for(i=0; i<data.length-1; i++){
			for(int j=0; j<data.length-1; j++){
				num=data[j][1].compareTo(data[j+1][1]);
			if(num>0){
				String temp []=data[j];
				data [j]=data[j+1];
				data [j+1]=temp;
			}
			}
		}
	}
	static void strMarks(String data[][]){
		System.out.println("Marks sorting has been done ");
		int num,i;
		for(i=0; i<data.length-1; i++){
			for(int j=0; j<data.length-1; j++){
				num=data[j][2].compareTo(data[j+1][2]);
			if(num>0){
				String temp []=data[j];
				data [j]=data[j+1];
				data [j+1]=temp;
			}
			}
		}
	}
	static void traversing(String data[][]){
		System.out.println("Subject Marks");
		
		for(int i=0; i<data.length-1; i++){
			for(int j=0; j<data[i].length; j++){
				System.out.println(data[i][j]);
			}
			System.out.println();
		}
	}
}
	
