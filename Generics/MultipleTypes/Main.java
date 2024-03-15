class Box<T, U>
{
	T obj1; 
	U obj2; 

	
	Box(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
class Main
{
	public static void main (String[] args)
	{
		Box <String, Integer> ob =new Box<>("GfG", 1445);
		ob.print();
		Box <Boolean, Float> ob1 =new Box<>(true, 15.5f);
		ob1.print();
		Box <Character, Long> ob2 =new Box<>('c', 15L);
		ob2.print();
	}
}
