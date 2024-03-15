import java.util.*;
class Queue{
	//public static void main(String arg[]){
int f=-1;
int r=-1;
int num[];
int size;
Queue(int size){
	this.size=size;
	num=new int [size];
}
void rear(int item){
	if(num[r+1]==0){
		num[++r]=item;
	}
	else{
		System.out.println(item+"can not be rear Queue overflow");
	if(num.length-1==r)
		r=-1;
	}
}
void front(){
	if(num[f+1]!=0){
		num[++f]=0;
	}
	else{
		System.out.println("can not be Front Queue");
		f=-1;
	}
	if(num.length-1==f)
		f=-1;
}
void traversing(){
	for(int i=0; i<num.length; i++){
		System.out.println("["+i+"]="+num[i]);
	}
}
}
class queueDemo{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=input.nextInt();
		Queue ob=new Queue(size);
		int a;
		char ch;
		do{
	       System.out.println("\n\n1.Rear\n2.Front\n3.Traversing\nEnter Selection:");
           int sel=input.nextInt();
            
           switch(sel){
           case 1:
		   System.out.print("Enter Push:");
		   a=input.nextInt();
		   ob.rear(a);
		   break;
		   
		   case 2:
		   System.out.print("Enter Pop:");
		   ob.front
		   ();
		   break;
		   case 3:
		   ob.traversing();
		   break;
		   default:
           if(sel!=4)
           System.out.println("Invalid number");
		   }
           System.out.print("do you want to run again:");
           ch=input.next().charAt(0);
		   
		}while(ch=='y'||ch=='Y');
		}
     }