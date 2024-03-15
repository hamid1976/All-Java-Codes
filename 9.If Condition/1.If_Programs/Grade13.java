 import java.util.*;
 class Grade13{
	 public static void main(String arg []){
		 Scanner ob = new Scanner(System.in);
		 System.out.print("Enter percentage ");
		 int per = ob.nextInt();
		 if(per>1){
			 if(per<100){
				if(per>=90){
					if(per<=100){
						System.out.print("A1 Grade");
					}}
				if(per>=80){
					if (per<90){
						System.out.print("A Grade");
					}}
				if(per>=70){
					if(per<80){
						System.out.print("B Grade");
					}}
				if(per>=60){
					if(per<70){
						System.out.print("C Grade");
				}}
				if(per>=50){
					if(per<60){
						System.out.print("D Grade");
				}}
				if(per>=40){
					if(per<50){
						System.out.print("E Grade");
				}}
				if(per<40)
					System.out.print("Fail");
			 }
			 if(per>100)
				 System.out.print("Invalid per ");
			 }
	 }
 }