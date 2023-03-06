import java.io.DataInputStream;
import java.io.IOException;

class SumOfEven{
    public static void main(String args[]){
        Sum s=new Sum();
        s.SumFn();
    }
}
class Sum{
    public void SumFn(){
        try{
            int num,sum=0;
            System.out.println("Enter the number");
            DataInputStream dis=new DataInputStream(System.in);
            num =Integer.parseInt(dis.readLine());
            for(int i=0;i<=num;i=i+2){
                sum=sum+i;
            }
            System.out.println("Sum of "+num+" number is "+sum);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}