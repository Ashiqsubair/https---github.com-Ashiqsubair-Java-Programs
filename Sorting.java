import java.io.*;
import java.lang.*;
class Sorting{
    public static void main(String args[]){
        try{
        System.out.println("Enter the limit for array");
        DataInputStream dis= new DataInputStream(System.in);
        int n=Integer.parseInt(dis.readLine());
        Sort S=new Sort();
        S.sort(n);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
class Sort{
    public void sort(int n){
        try{
            int a[];
            a= new int[n];
            System.out.println("Enter the values for array");
            DataInputStream is= new DataInputStream(System.in);
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(is.readLine());
            }
            //Sorting
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            //Displaying
            System.out.println("After Sorting");
            for(int i=0;i<n;i++){
                System.out.println(a[i]);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        

    }
}