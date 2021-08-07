package ByteInputOutputStream;

import java.io.*;

public class CopyImage {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\Revature\\RevatureRepository\\Week2\\Day4\\src\\ByteInputOutputStream\\img\\img.jpg");
            BufferedInputStream bin = new BufferedInputStream(fin);
            FileOutputStream fout = new FileOutputStream("E:\\Revature\\RevatureRepository\\Week2\\Day4\\src\\ByteInputOutputStream\\img\\copyImg.jpg");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            int byteInt = bin.read();
            while (byteInt != -1) {
                System.out.print((char) byteInt);
                bout.write(byteInt);
                byteInt = bin.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
