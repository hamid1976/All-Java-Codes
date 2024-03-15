public class GFG {

	public static void main(String[] args)
	{

		Integer[] a = { 100, 22, 58, 41, 6, 50 };

		Character[] c = { 'v', 'g', 'a', 'c', 'x', 'd', 't' };

		String[] s = { "Virat", "Rohit", "Abhinay", "Chandu","Sam", "Bharat", "Kalam" };

		System.out.print("Sorted Integer array : ");
		sort_generics(a);

		System.out.print("Sorted Character array : ");
		sort_generics(c);

		System.out.print("Sorted String array : ");
		sort_generics(s);
	
	}

	public static <T extends Comparable<T> > void sort_generics(T[] data)
	{

		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j].compareTo(data[j + 1]) > 0) {
					swap(j, j + 1, data);
				}
			}
		}

		// Printing the elements after sorted

		for (T i : data) 
		{
			System.out.print(i + ", ");
		}
		System.out.println();
	
	}

	public static <T> void swap(int i, int j, T[] data)
	{
		T t = data[i];
		data[i] = data[j];
		data[j] = t;
	}

}
