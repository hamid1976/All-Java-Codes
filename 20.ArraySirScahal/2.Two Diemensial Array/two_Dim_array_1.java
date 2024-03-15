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
			    System.out.print("fname ");
			   data[i][0]=ob.next();
			    System.out.print("surname ");
			   data[i][0]=ob.next();
		   }
		   char ch;
		   int sel=ob.nextInt();
		   do{
			   System.out.print("\n\n1.sort by name\n2.sort by father name\n3.sort by surname\n4.traversing\nEnter sel  ");
			   switch(sel){
				   case 1:
				   rec.strName(data);break;
			       case 2:
				   rec.strFName(data);
				   break;
			       case 3:
				   rec.strSurname(data);
				   break;
			       case 4:
				   rec.traversing(data);
				   break;
		   }
		   ch=ob.next().charAt(0);
		   }
		   while (ch=='y');
	   }
}

class rec{
	static void strName(String data[][]){
		System.out.println("Name sorting has been done ");
		int num,i;
		for(i=0; i<data.length-1; i++){
			for(int j=0; j<data.length+1; j++){
				num=data[j][0].compareTo(data[j+1][0]);
			if(num>0){
				String temp []=data[j];
				data [j]=data[j+1];
				data [j+1]=temp;
			}
			}
		}
	}
	static void strFName(String data[][]){
		System.out.println("Name sorting has been done ");
		int num,i;
		for(i=0; i<data.length-1; i++){
			for(int j=0; j<data.length+1; j++){
				num=data[j][0].compareTo(data[j+1][1]);
			if(num>0){
				String temp []=data[j];
				data [j]=data[j+1];
				data [j+1]=temp;
			}
			}
		}
	}
	static void strSurname(String data[][]){
		System.out.println("Name sorting has been done ");
		int num,i;
		for(i=0; i<data.length-1; i++){
			for(int j=0; j<data.length+1; j++){
				num=data[j][0].compareTo(data[j+1][2]);
			if(num>0){
				String temp []=data[j];
				data [j]=data[j+1];
				data [j+1]=temp;
			}
			}
		}
	}
	static void traversing(String data[][]){
		System.out.println("Name father surname");
		
		for(int i=0; i<data.length-1; i++){
			for(int j=0; j<data[i].length; j++){
				System.out.println(data[i][j]);
			}
			System.out.println();
		}
	}
}
	
