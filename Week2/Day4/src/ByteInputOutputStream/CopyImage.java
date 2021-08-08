package ByteInputOutputStream;

import java.io.*;

public class CopyImage {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\Revature\\RevatureRepository\\Week2\\Day4\\src\\ByteInputOutputStream\\img\\image.jpg");
            //BufferedInputStream bin = new BufferedInputStream(fin);
            FileOutputStream fout = new FileOutputStream("E:\\Revature\\RevatureRepository\\Week2\\Day4\\src\\copyImg.jpg");
            //BufferedOutputStream bout = new BufferedOutputStream(fout);

            int byteInt = fin.read();
            while (byteInt != -1) {
                System.out.print((char) byteInt); //Console Print
                fout.write(byteInt); // File Writing
                byteInt = fin.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
