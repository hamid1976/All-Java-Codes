import java.io.*;
class File{
	public static void main(String arg[])throws IOException{
		FileInputStream f=new FileInputStream("a.txt");
		DataInputStream dis=new DataInputStream(f);
		String line=dis.readLine();
		System.out.println(line);
	}
}