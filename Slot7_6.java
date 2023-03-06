
import java.io.*;
import packages.NCR;
class Slot_7_6{
    public static void main(String args[]){
        try{
            System.out.println("Enter the n value");
            DataInputStream dis=new DataInputStream(System.in);
            int n=Integer.parseInt(dis.readLine());
            System.out.println("Enter the r value");
            int r=Integer.parseInt(dis.readLine());
            int Combination=NCR.nCr(n, r);
            System.out.println(n+"C"+r+"= "+Combination);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
}
