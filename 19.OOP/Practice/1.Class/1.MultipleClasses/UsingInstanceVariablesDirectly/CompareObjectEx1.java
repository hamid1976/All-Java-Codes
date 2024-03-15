class CompareObjectEx1{
	public static void main(String arg[]){
		Integer n1 = new Integer(1);
		Integer n2 = new Integer(1);
		
		boolean b1= n1.hashCode(n2);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(b1);
	}
}