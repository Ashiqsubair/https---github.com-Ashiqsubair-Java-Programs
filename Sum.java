import java.io.*;
class Sum{
    public static void main(String args[]){
        try{
            System.out.println("Enter the value for first number");
            DataInputStream dis=new DataInputStream(System.in);
            int a= Integer.parseInt(dis.readLine());
            System.out.println("Enter the value for second number");
            int b=Integer.parseInt(dis.readLine());
            System.out.println("Sum of "+a+" and "+b+" is "+ (a+b));
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}