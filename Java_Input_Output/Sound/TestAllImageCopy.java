import java.io.*;
class TestAllImageCopy{
	public static void main(String[] args) throws Exception{
		FileInputStream file = new FileInputStream("fb.jpg");
		FileOutputStream fout = new FileOutputStream("./Video/fbCpy.jpg");
		int code;
		while ((code=file.read())!=-1) {
			fout.write(code);
		}
	}
}