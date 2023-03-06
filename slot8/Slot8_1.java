import java.io.*;
public class Slot8_1 {
    public static void main(String args[]){
        try{
            System.out.print("Enter the size of array: ");
            DataInputStream dis= new DataInputStream(System.in);
            int n=Integer.parseInt(dis.readLine());
            Array a=new Array();
            a.array_insert(n);
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
class Array{
    void array_insert(int n){
        int arr[];
        arr=new int[n];
        try{
            DataInputStream dis= new DataInputStream(System.in);
            for(int i=0;i<n;i++){
                System.out.print("Enter the Number "+(i+1)+": ");
                arr[i] =Integer.parseInt(dis.readLine());
            }
            //Printing array elements.
            
            System.out.println("Enter the index to be searched.");
            int index=Integer.parseInt(dis.readLine());
            System.out.println("The Searched element in index "+index+" is "+arr[index]);
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}