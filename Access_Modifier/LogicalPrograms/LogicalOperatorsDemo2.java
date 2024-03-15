public class LogicalOperatorsDemo2 {
    public static void main(String[]args) {
        int  x = true;//boolean variable x is intialiized with value true
        boolean y = false;//boolean variable y is intialiized with value false  
        boolean z = (x || y) ;  //conditional-OR on x and y
        System.out.println("x || y = " + z);//print value of the result
        //This gives an output x || y = true
    }
}