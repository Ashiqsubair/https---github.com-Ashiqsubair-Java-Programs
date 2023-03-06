import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

class RecursionPrintNUM{
    public static void main(String args[]){
        try{
            System.out.println("Enter the number");
            DataInputStream dis= new DataInputStream(System.in);
            int num= Integer.parseInt(dis.readLine());
            FactClass f= new FactClass();
            System.out.println("The numbers in order are:");
            f.PrintInOrder(num);
            System.out.println("The numbers in reverse are:");
            f.Printreverse(num);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
class FactClass{
    int fact=1;
    public int PrintInOrder(int n){
        if(n>0){
            PrintInOrder(n-1);
            System.out.println(n);
        }
            return 0;
        
    }
    public int Printreverse(int n){
        if(n>0){
            System.out.println(n);
            Printreverse(n-1);
        }
        return 0;
    }
}