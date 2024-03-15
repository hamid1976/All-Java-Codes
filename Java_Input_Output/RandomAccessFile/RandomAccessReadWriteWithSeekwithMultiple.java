import java.io.*;
import java.util.*;
public class RandomAccessReadWriteWithSeekwithMultiple{
public static void main(String[] args) throws IOException{
   RandomAccessFile file = new RandomAccessFile("RandomRecord.txt", "rw");
   
   Scanner ob=new Scanner(System.in);
   int i;
   byte b;
   short s;
   char c;
   String ch;
   int temp=1;
   do{
	   System.out.println("Enter Int:");
	   i=ob.nextInt();
	   
	   System.out.println("Enter Byte:");
	   b=ob.nextByte();
	   
	   System.out.println("Enter Short");
	   s=ob.nextShort();
	   
	   System.out.println("Enter Char");
	   c=ob.next().charAt(0);
	   
	   System.out.println("Do you want to add more");
	   ch=ob.next();
	       file.writeInt(i);//8 byte
		   file.writeByte(b);//4 byte
		   file.writeShort(s);//8 byte
		   file.writeChar(c);//2 byte
		   temp++;
   }while(ch.equals("y") ||  ch.equals("Y"));
   
   RandomAccessFile r = new RandomAccessFile("RandomRecord.txt", "rw");
   
   for(int j=0; j<temp; j++){
	   System.out.println("How Many Bytes You want to Skip Enter Value");
	   byte sb = ob.nextByte();
	   r.skipBytes(sb);
	   System.out.println("Int="+r.readInt());
	   System.out.println("Byte="+r.readByte());
	   System.out.println("Short="+r.readShort());
	   System.out.println("Char="+r.readChar());
   }
   }
}