import java.io.*;
class Matrix{
    public static void main(String args[]){
            int a[][];
            a= new int[2][2];
            Sum S= new Sum();
            S.Matrix_insert(a);
            S.Rowsum(a);
            S.Colsum(a);
    }
}
class Sum{
    public void Matrix_insert(int a[][]){
        try{
            System.out.println("Enter the elements");
            DataInputStream dis= new DataInputStream(System.in);
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.println("a["+i+"]["+j+"]");
                    a[i][j]=Integer.parseInt(dis.readLine());
                }
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
    public void Rowsum(int a[][]){
        System.out.println("Row wise sum is:");
        for(int i=0;i<2;i++){
            int sum=0;
            for(int j=0;j<2;j++){
                sum=sum+a[i][j];
            }
            System.out.println(sum);
        }
    }
    public void Colsum(int a[][]){
        System.out.println("Column wise sum is:");
        for(int i=0;i<2;i++){
            int sum=0;
            for(int j=0;j<2;j++){
                sum=sum+a[j][i];
            }
            System.out.println(sum);
        }
    }
}