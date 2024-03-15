public class ObjectComparisonExample  
{  
public static void main(String[] args)   
{  
//creating constructor of the Double class   
Double x = new Double(123.45555);  
Double x1 = new Double(123.45555);  
//creating constructor of the Long class   
Long y = new Long(9887544);  
//invoking the equals() method   
System.out.println("Objects are not equal, hence it returns " + x.equals(x1));  
System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));  
}  
}  