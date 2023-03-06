import java.io.*;
import java.lang.*;
class Min{
    public static void main(String args[]){
        try{
            System.out.println("Enter the value for first number");
            DataInputStream dis=new DataInputStream(System.in);
            int a= Integer.parseInt(dis.readLine());
            System.out.println("Enter the value for second number");
            int b=Integer.parseInt(dis.readLine());
            System.out.println("Enter the value for third number");
            int c=Integer.parseInt(dis.readLine());
            int x=a<b&&a<c?a:(b<c?b:c);
            System.out.println(x+" is the minimum");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}