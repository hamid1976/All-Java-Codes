import java.util.*;
class Stack1st{
int top=-1;
int data[];
int size;
Stack1st(int size){
	this.size=size;
	data=new int[size];
}
void push(int item){
	if(top==size-1){
		if(item!=0){
			System.out.println("\n\n"+item+"overflow");
		}
	}

    else{
	  data[++top]=item;
      System.out.println(item+" pushed at "+top+" location");
    }
}
void pop(){
	if(top<0){
		System.out.println("underflow");
	}
	else{
		System.out.println(data[top]+" pop from "+top+" location");
		data[top]=0;
		top--;
	}
}
void traversing(){
	for(int i=0; i<data.length;i++){
	System.out.println("data["+i+"]="+data[i]);
	}
}
}
class StackTraversing{
	public static void main (String arg[]){
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Size");
		int size=input.nextInt();
		Stack1st ob=new Stack1st(size);
		
		int a;
		char ch;
		
		do{
		   System.out.println("\n\n1.push\n2.pop\n3.Traversing\nEnter Selection:");
           int sel=input.nextInt();
            
           switch(sel){
           case 1:
		   System.out.print("Enter Item:");
		   a=input.nextInt();
		   ob.push(a);
		   break;
		   
		   case 2:
		   ob.pop();
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