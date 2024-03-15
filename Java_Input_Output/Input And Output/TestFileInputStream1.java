import java.io.* ;
import java.util.* ;
class TestFileInputStream1{
	public static void main(String[] args)throws Exception {
		FileInputStream fin = new FileInputStream("a1.txt");
		int i;
		char a[]={'A','B'};
		do{
			i = fin.read();
			if(i!=-1){
				System.out.println((char)i);
			}
		}while(i!=-1);
	fin.close();
	}
}