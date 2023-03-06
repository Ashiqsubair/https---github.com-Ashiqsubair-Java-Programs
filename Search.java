import java.io.*;
import java.lang.*;
class Search{
    public static void main(String args[]){
        try{
            int a[];
            int flag=0;
            System.out.println("Enter the limit for array");
            DataInputStream dis= new DataInputStream(System.in);
            int n=Integer.parseInt(dis.readLine());
            a = new int[n];
            System.out.println("Enter the Elements");
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(dis.readLine());
            }
            //Searching in array
            System.out.println("Enter the Value to search in the array");
            int key=Integer.parseInt(dis.readLine());
            for(int i=0;i<n;i++){
                if(key==a[i]){
                    System.out.println("Element is found at"+ (i+1)+" position");
                    flag=1;
                }
            }
            if(flag==0){
                System.out.println("Element not found ");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}