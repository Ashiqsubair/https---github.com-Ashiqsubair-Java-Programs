package slot7;

import java.io.*;
import packages.Prime;

class Slot7_5{
    public static void main(String args[]){
        try {
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter a number:");
            long num=Integer.parseInt(dis.readLine());
            Prime.FindPrime(num);

        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
