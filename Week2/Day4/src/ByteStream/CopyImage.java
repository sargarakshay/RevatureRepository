package ByteStream;

//Task 1 - Create file copy of an image.
	//          InputStream -> FileInputStream, BufferedInputStream
	//          OutputStream - FileOutputStream, BufferedOutputStream

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("E:\\Revature\\RevatureRepository\\Week2\\Day4\\src\\ByteStream\\image.jpeg");
			BufferedInputStream bin = new BufferedInputStream(fis);
			
			FileOutputStream fout=new FileOutputStream("E:\\test.jpeg");    
		    BufferedOutputStream bout=new BufferedOutputStream(fout); 
			
			int byteInt = bin.read();
			
			while(byteInt==-1) {
				System.out.println((byte)byteInt);
				bout.write(byteInt);
				byteInt = bin.read();
			}
			
			fis.close();
			bin.close();
			fout.close();
			bout.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

}
