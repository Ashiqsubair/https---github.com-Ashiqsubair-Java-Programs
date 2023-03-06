package Serialisation;
//serialization on employee
import java.io.*;
public class De {
    public static void main(String[] args) {
        try {
            Employee p=null;
            FileInputStream fis=new FileInputStream("D:\\MCA_FILES\\Java Programs\\java lab cycle\\Serialisation\\emp.txt");
            ObjectInputStream ois=new  ObjectInputStream(fis);
            p=(Employee)ois.readObject();
            System.out.println(p.address1);
            System.out.println(p.age1);
            System.out.println(p.id1);
            p.disp();
            ois.close();
            fis.close();
            System.out.println("DESerialization happened");

        } catch (Exception ex) {
            System.out.println(ex);
        }



    }
}
