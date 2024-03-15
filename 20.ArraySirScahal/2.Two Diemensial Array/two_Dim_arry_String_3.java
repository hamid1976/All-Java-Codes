import java.util.*;
class two_Dim_arry_String_3{
	public static void main(String arg []){
		Scanner ob = new Scanner(System.in);
		String data[][]={{"imran","java","10"},{"zahid","c","5"},{"Ali","vb","30"},{"hyder","orcale","2"}};
		char ch;
		do{
			   System.out.print("\n\n1.sort by name\n2.sort by subject\n3.sort by Marks\n4.traversing\nEnter sel  ");
		int sel =ob.nextInt();
		
		
		switch(sel){
			case 1:
                int   num;
					for(int i=0; i<data.length-1; i++){
						for(int j=0; j<data.length-1; j++){
							num=data[j][0].compareTo(data[j+1][0]);
								if(num>0){
									String temp []=data[j];
									data [j]=data[j+1];
									data [j+1]=temp;
								}
						}
			
					}
		    break;
		case 2:
			  int y;
			 System.out.println("Subject sorting has been done ");
				for(int i=0; i<data.length-1; i++){
					for(int j=0; j<data.length-1; j++){
						y=data[j][1].compareTo(data[j+1][1]);
						if(y>0){
							String temp []=data[j];
							data [j]=data[j+1];
							data [j+1]=temp;
						}
					}
				}
		break;
		case 3:
						System.out.println("Marks sorting has been done ");
				 	int 	x,data1;
				for(int i=0; i<data.length-1; i++){
			       for(int j=0; j<data.length-1; j++){
				data1=data[j][2].compareTo(data[j+1][2]);
			if(data1>0){
				String temp []=data[j];
				data [j]=data[j+1];
				data [j+1]=temp;
			}
			}
		}
		for(int i=0;i<data.length;i++)
	       data1=Integer.parseInt(data[i][2]);
		break;
		case 4:
				System.out.println("Traversing");
		
		    for(int k=0; k<data.length; k++){
			for(int j=0; j<data[k].length; j++){
				System.out.println(data[k][j]);
			}
			System.out.println();
	    	}
	
		break;
		}
		System.out.print("Do you again run  a program ");
		ch=ob.next().charAt(0);
		
		}
		while(ch=='y');
	}
  }


