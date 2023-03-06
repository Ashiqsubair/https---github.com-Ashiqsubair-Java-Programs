import java.io.*;
import java.lang.*;
class Max{
    public static void main(String args[]){
        try{
            System.out.println("Enter the value for first number");
            DataInputStream dis=new DataInputStream(System.in);
            int a= Integer.parseInt(dis.readLine());
            System.out.println("Enter the value for second number");
            int b=Integer.parseInt(dis.readLine());
            System.out.println("Enter the value for third number");
            int c=Integer.parseInt(dis.readLine());
            if(a>b && a>c){
                System.out.println(a+" is greater");
            }
            else if(b>a && b>c){
                System.out.println(b+" is greater");
            }
            else{
                System.out.println(c+" is greater");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}