import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

class Recursion{
    public static void main(String args[]){
        try{
            System.out.println("Enter the number to find Factorial");
            DataInputStream dis= new DataInputStream(System.in);
            int num= Integer.parseInt(dis.readLine());
            FactClass f= new FactClass();
            int x=f.Factorial(num);
            System.out.println(x+" is the Factorial");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
class FactClass{
    int fact=1;
    public int Factorial(int n){
        if(n>=1){
            return n*Factorial(n-1);
        }
            return 1;
        
    }
}