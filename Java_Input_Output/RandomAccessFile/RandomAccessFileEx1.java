import java.io.*;
import java.util.*;
class RandomAccessFileEx1{
	public static void main(String[] args)throws IOException {
		Scanner ob = new Scanner(System.in);
		RandomAccessFile w = new RandomAccessFile("newFile.txt","rw");
		int ii,temp=1;
		short s;
		byte b;
		char c;
		String ch;
		// do{
			// System.out.println("Enter Int ?");
			// ii=ob.nextInt();
			// System.out.println("Enter Byte ?");
			// b=ob.nextByte();
			// System.out.println("Enter Short ?");
			// s=ob.nextShort();
			// System.out.println("Enter Char ?");
			// c=ob.next().charAt(0);
			
			// System.out.println("Do You Want Add More Y");
			// ch=ob.next();
			// w.writeInt(ii);
			// w.writeByte(b);
			// w.writeShort(s);
			// w.writeChar(c);
			// temp++;
		// }while(ch.equals("y") || ch.equals("Y"));
			//0
			w.writeInt(1000);
			w.writeByte(65);
			w.writeShort(454);
			w.writeChar('D');
			//9
			w.writeInt(999);
			w.writeByte(46);
			w.writeShort(643);
			w.writeChar('L');
			//9+9=18
			w.writeInt(3000);//4
			w.writeByte(46);//1
			w.writeShort(865);//2
			w.writeChar('M');//2
		RandomAccessFile r = new RandomAccessFile("newFile.txt","rw");
		
		for(int i=0; i<temp; i++){
			System.out.println("How To Skip Byte Enter Value");
			byte bb = ob.nextByte();
			r.skipBytes(bb);
			System.out.println("Int : "+r.readInt());
			System.out.println("Byte : "+r.readByte());
			System.out.println("Short : "+r.readShort());
			System.out.println("Char : "+r.readChar());
		}
	}
}