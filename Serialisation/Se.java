package Serialisation;
//serialization on employee
import java.io.*;
public class Se{
    public static void main(String[] args) {
        try {
            Employee emp=new Employee("Rajagiri", 1213, 21);
            FileOutputStream fos=new FileOutputStream("D:\\MCA_FILES\\Java Programs\\java lab cycle\\Serialisation\\emp.txt");
            ObjectOutputStream oos=new  ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("Serialization happened");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
