import java.io.*;;
public class RandomAccessReadFile{
public static void main(String[] args) throws IOException{
   RandomAccessFile file = new RandomAccessFile("a2.txt", "r");
   
   byte a=file.readByte();
   byte b=file.readByte();
   byte c=file.readByte();
   
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   
 }
}