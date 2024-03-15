import java.util.*;

class LogicalOperator4{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st Age ? ");
		int age=as.nextInt();
		
		System.out.print("Enter 2nd Age ? ");
		int age2=as.nextInt();
		
		System.out.print("Enter 3nd Age ? ");
		int age3=as.nextInt();
		
		System.out.print("Enter 4nd Age ? ");
		int age4=as.nextInt();
		
		System.out.print("Enter 5nd Age ? ");
		int age5=as.nextInt();
		
		if(age>age2){
			if(age>age3){
				if(age>age4){
					if(age>age5){
						System.out.print("1st Age is Greater");
					}
				}
			}
		}
		if(age2>age){
			if(age2>age3){
				if(age2>age4){
					if(age2>age5){
						System.out.print("2nd Age is Greater");
					}
				}
			}
		}
		if(age3>age){
			if(age3>age2){
				if(age3>age4){
					if(age3>age5){
						System.out.print("3nd Age is Greater");
					}
				}
			}
		}
		if(age4>age){
			if(age4>age2){
				if(age4>age3){
					if(age4>age5){
						System.out.print("4nd Age is Greater");
					}
				}
			}
		}
		if(age5>age){
			if(age5>age2){
				if(age5>age3){
					if(age5>age4){
						System.out.print("5nd Age is Greater");
					}
				}
			}
		}
	}
}