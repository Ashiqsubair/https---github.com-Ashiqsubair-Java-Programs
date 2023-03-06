
import java.io.*;
import java.lang.*;
class Palindrome{
    public static void main(String args[]){
        try{
            System.out.println("Enter the number to check whether it is Palindrome or not!");
            DataInputStream dis = new DataInputStream(System.in);
            int num=Integer.parseInt(dis.readLine());
            Check C= new Check();
            int x=C.Reverse(num);
            System.out.println("Reverse number is "+x);
            int y=C.PalCheck(num, x);
            System.out.println("Returned "+y);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
class Check{
    public int Reverse(int num){
        int x=0;
        while(num>0){
			x=x*10;
			x=x+(num%10);
			num=num/10;
		}
        return x;
    }
    public int PalCheck(int num,int x){
        if(num==x){
            return 1;
        }
        else{
            return 0;
        }
    }
}