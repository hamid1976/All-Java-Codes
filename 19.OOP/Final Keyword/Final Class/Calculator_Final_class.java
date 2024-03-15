//Final class do not Create its sub class
 final class Calculator_Final_class{
	 
    void sqr(int num){
       System.out.println(num*num);
    }
    void cube(int n){
        System.out.println(n*n*n);
    }

 
 public static void main(String arg[]){
	 Calculator_Final_class ob=new Calculator_Final_class();
	 ob.sqr(8);
	 ob.cube(5);
 }
 
 }
