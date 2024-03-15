import java.io.*;;
public class RandomAccessWriteFile{
public static void main(String[] args) throws IOException{
   RandomAccessFile file = new RandomAccessFile("a2.txt", "w");
   
   byte a=100;
   byte b=90;
   byte c=80;
   
   file.writeByte(a);
   file.writeByte(b);
   file.writeByte(c);
   
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   
   file.close();
}
}