package ByteInputOutputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectToByte {
    public static void main(String[] args) {
        List<Bus> busList = new ArrayList<>();

        busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
        busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
        busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
        busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
        busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
        busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));

        try {
            FileOutputStream fout = new FileOutputStream("E:\\Revature\\RevatureRepository\\Week2\\Day5\\src\\main\\java\\ByteInputOutputStream\\byteCodeOutput\\BusObjectByteCode1.ser");

            ObjectOutputStream oos =new ObjectOutputStream(fout);

            oos.writeObject(busList);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
