import java.lang.*;
import java.io.*;
class SumOfSeries{
    public static void main(String args[]){
        try{
        System.out.println("Enter the Number");
        DataInputStream dis= new DataInputStream(System.in);
        int m= Integer.parseInt(dis.readLine());
        loop l= new loop();
        l.print(m);
    }
    catch(IOException e){
        System.out.println(e);
    }
    }
}
class loop{
    public void print(int m){
        int totalsum=0,sum=0,i=1;
        while(m>0){
            sum=sum+i;
            i++;
            totalsum=totalsum+sum;
            m--;
        }
        System.out.println("The Total Sum is "+totalsum);
    }
}