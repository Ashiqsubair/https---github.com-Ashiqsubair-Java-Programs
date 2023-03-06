import java.lang.*;
import java.io.*;
class display{
    public static void main(String args[]){
        try{
        System.out.println("Enter the Starting and Ending Number");
        DataInputStream dis= new DataInputStream(System.in);
        int m= Integer.parseInt(dis.readLine());
        int n= Integer.parseInt(dis.readLine());
        loop l= new loop();
        l.print(m, n);
    }
    catch(IOException e){
        System.out.println(e);
    }
    }
}
class loop{
    public void print(int m,int n){
        System.out.println("The numbers are");
        while(m<=n){
            System.out.println(m);
            m++;
        }
    }
}