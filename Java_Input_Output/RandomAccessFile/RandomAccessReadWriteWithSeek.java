import java.io.*;
public class RandomAccessReadWriteWithSeek{
public static void main(String[] args) throws IOException{
   RandomAccessFile file = new RandomAccessFile("Meta.txt", "rw");
   
   file.writeDouble(223.23);//8 byte
   file.writeInt(1000);//4 byte
   file.writeLong(50000000000L);//8 byte
   file.writeChar('c');//2 byte
   
   file.seek(0);
   double dd=file.readDouble();
   System.out.println(dd);
   
   file.seek(8);//argument is bytes which is passed
   int i=file.readInt();
   System.out.println(i);
   
   file.seek(12);
   long d =file.readLong();
   System.out.println(d);
   
   file.seek(20);
   char ch=file.readChar();
   System.out.println(ch);
   
   file.close();
 }
}