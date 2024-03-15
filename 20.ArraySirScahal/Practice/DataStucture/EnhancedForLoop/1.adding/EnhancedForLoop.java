class EnhancedForLoop{
	public static void main(String arg[]){
	
	int[] values={10,8,7,6,9,5};
	int total=0;
		     //element=0  values=10
		for(int element: values){
			total =total+ element;
			System.out.println(total);
		}
	}
}
