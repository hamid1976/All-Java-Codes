interface kb{
	public static final int A=65;//All Variables of interface are by default public static & final
	public static final int B=66;//All Variables of interface are by default public static & final
	public static final int C=67;//All Variables of interface are by default public static & final
	
	public static final int Z=90;//All Variables of interface are by default public static & final
	
	public static final int a=97;//All Variables of interface are by default public static & final
	public static final int b=98;//All Variables of interface are by default public static & final
	public static final int c=99;//All Variables of interface are by default public static & final
	
	public static final int z=122;//All Variables of interface are by default public static & final
	
	public static final int space=32;//All Variables of interface are by default public static & final
	public static final int Esc=27;//All Variables of interface are by default public static & final
	public static final int delete=8;//All Variables of interface are by default public static & final
}
class Keyboard{
	public static void main(String arg[]){
		System.out.println("A="+(kb.A));
		System.out.println("B="+(kb.B));
		System.out.println("C="+(kb.C));
		
		System.out.println("Z="+(kb.Z));
		
		System.out.println("a="+(kb.a));
		System.out.println("b="+(kb.b));
		System.out.println("c="+(kb.c));
		
		System.out.println("z="+(kb.z));
		
		System.out.println("space="+(kb.space));
		System.out.println("Esc="+(kb.Esc));
		System.out.println("delete="+(kb.delete));
		
	}
}