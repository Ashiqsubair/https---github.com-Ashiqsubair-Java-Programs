import java.io.*;
import java.lang.*;
public class CallByValue {
    public static void main(String args[]){
        try{
            System.out.println("Enter two number to be swapped");
            System.out.println("num1= ");
            DataInputStream dis=new DataInputStream(System.in);
            float num1=Float.parseFloat(dis.readLine());
            System.out.println("num2= ");
            float num2=Float.parseFloat(dis.readLine());
            Swap(num1,num2);
            System.out.println(" num1="+num1+" and num2= "+num2);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    static void Swap(Float num1,float num2){
        float temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping num1="+num1+" and num2= "+num2);
    }
}

