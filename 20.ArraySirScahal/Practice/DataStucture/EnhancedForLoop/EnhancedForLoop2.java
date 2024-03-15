class EnhancedForLoop2{
	public static void main(String arg[]){
	
	int[] factors={10,8,7,6,9,5};
	double product=1;
		     //element=0  values=10
		for(int element: factors){
			product =product * element;
			System.out.println(product);
		}
	}
}
