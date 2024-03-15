import java.io.*;
class CopyPaste{
    public static void main(String arg[])throws Exception{
       FileInputStream f=new FileInputStream("y2.mp4");		
	   FileOutputStream f1=new FileOutputStream("e:/y3.mp4");
	   
	   int size=f.available();
	   int packetSize=3000;
	   int totalPackets=size/packetSize;
	   int LastPacketSize=size%packetSize;
	   byte data[]=new byte[packetSize];
	      for(int p=1; p<=totalPackets; p++){
			  f.read(data,0,packetSize);
			  f1.write(data,0,packetSize);
			  System.out.println("Packets Transmitt:"+p);
		  }
		  f.read(data,0,LastPacketSize);
		  f1.write(data,0,LastPacketSize);
		  
		  f.close();
		  f1.close();
		  System.out.println("All Packets Transmitt Successfully");
	}
}