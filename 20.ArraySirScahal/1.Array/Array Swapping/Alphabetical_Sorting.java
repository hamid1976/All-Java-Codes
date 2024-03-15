import java.util.*;
class Alphabetical_Sorting{
    public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
       String data[]={"100","59","230","1999","120000","5","7"};
		String  temp;
		System.out.println("Array before swaping");
		for(int k=0; k<data.length; k++){
			System.out.println("["+k+"] = "+data[k]);
		}
		
		char again;
		do{
		      System.out.print("1.assending\n2.disassending\n3.Traversing\nEnter selection ");
        int sel=ob.nextInt();
		switch(sel){
			case 1:
		System.out.println("");
		for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
				int code=data[i].compareTo(data[j]);
                if (code > 0){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
			}
		}
		break;
		case 2:
        System.out.println("");
				for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
				int code=data[i].compareTo(data[j]);
                if (code < 0){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
			}
		}
        break ;
		case 3:
        for (int i = 0; i < data.length ; i++) {
            System.out.println(data[i]);
        }
        break ; 
		}
		System.out.println("y/n");
		again=ob.next().charAt(0);
		}	
		while (again=='y');
		}
		
    }