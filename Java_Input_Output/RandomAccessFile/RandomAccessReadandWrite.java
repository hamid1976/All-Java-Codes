import java.io.*;
public class RandomAccessReadandWrite{
public static void main(String[] args) throws IOException{
RandomAccessFile w = new RandomAccessFile("a3.txt", "rw");
   byte a1=100;
   byte b1=90;
   byte c1=80;
   
   w.writeByte(a1);
   w.writeByte(b1);
   w.writeByte(c1);
   
   System.out.println(a1);
   System.out.println(b1);
   System.out.println(c1);
   
   w.close();
   RandomAccessFile r = new RandomAccessFile("a2.txt", "r");
   
   byte a=r.readByte();
   byte b=r.readByte();
   byte c=r.readByte();
   
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   
   r.close();
   
   
 }
}