import java.io.*;
public class Slot8_2 {
    public static void main(String args[]){
        try{
            System.out.print("Enter a number ");
            DataInputStream dis= new DataInputStream(System.in);
            int n=Integer.parseInt(dis.readLine());
            //checking if number is prime
            int prnum=checkPrime(n);
            if(prnum==2){
                throw new ArithmeticException("You have entered a prime number");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static int checkPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        return count;
    }
}