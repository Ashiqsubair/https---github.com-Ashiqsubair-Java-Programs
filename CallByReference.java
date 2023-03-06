import java.io.DataInputStream;
import java.lang.Math;
public class CallByReference {
    public static void main(String args[]){
        SquareRoot s=new SquareRoot();
        s.read();
        s.num1=Math.sqrt(s.num1);
        s.print();
    }
}
class SquareRoot{
    double num1;
    void read(){
        try {
            DataInputStream dis=new DataInputStream(System.in);
            num1= Double.parseDouble(dis.readLine());
        } catch (Exception e){
            System.out.println(e);
        }
    }
    void print(){
        System.out.println("Square root is "+num1);
    }
    
}
