class TestBinarySearch{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,12,14,15,16,17};
		int search=13,i=0,star=0,end=arr.length,mid=(star+end)/2;
		for (i=0; i<arr.length; i++) 
			System.out.print("["+arr[i]+"] = "+i+", ");
		System.out.println();
		
		while (star<=end){
			if (search==arr[mid]){
				System.out.println(arr[mid]+" loc "+mid);
				break;
			}
			else if(arr[mid]<search){
				star =	mid+1;
			}
			else{
				end = mid-1;
			}
			mid = (star+end)/2;
		}
		if (star>end)
		 	System.out.println("Not found Value "+search);
		System.out.println();
	}
}
//1 2 3 first then second then third then result 