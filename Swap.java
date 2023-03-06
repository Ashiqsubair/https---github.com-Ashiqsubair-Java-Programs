import java.io.*;
import java.lang.*;
class Swap{
    public static void main(String args[]){
        try{
            System.out.println("Enter the value for first number");
            DataInputStream dis=new DataInputStream(System.in);
            int a= Integer.parseInt(dis.readLine());
            System.out.println("Enter the value for second number");
            int b=Integer.parseInt(dis.readLine());
            int temp;
            temp=a;
            a=b;
            b=temp;
            System.out.println("After Swapping");
            System.out.println("value of first number is "+a);
            System.out.println("value of Second number is "+b);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}