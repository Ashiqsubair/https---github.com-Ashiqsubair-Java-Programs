import java.io.*;
class NestedFn{
    public static void main(String args[]){
        Largest l=new Largest();
        l.fnlargest2();
    }
}
class Largest{
    DataInputStream dis= new DataInputStream(System.in);
    public int fnlargest1(){
        try{
            System.out.println("Enter the two more numbers :");
            int num1=Integer.parseInt(dis.readLine());
            int num2=Integer.parseInt(dis.readLine());
            if(num1>num2){
                return num1;
            }
            else{
                return num2;
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        return 0;
    }
    public void fnlargest2(){
        try{
            System.out.println("Enter a number :");
        int num3=Integer.parseInt(dis.readLine());
        
        int x=fnlargest1();
        if(x>num3){
            System.out.println("Greatest is "+x);
        }
        else{
            System.out.println("Greatest is "+num3);
        }
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
}