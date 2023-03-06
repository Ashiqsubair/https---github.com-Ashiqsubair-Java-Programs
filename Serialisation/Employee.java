package Serialisation;
import java.io.*;

public class Employee implements Serializable{
    public String address1;
    public int id1;
    public int age1;
    public Employee(String address,int id,int age){
        this.address1=address;
        this.id1=id;
        this.age1=age;
    }
    public void disp(){
        System.out.println("THIS IS AN EXAMPLE");
    }
}
