import java.io.*;
public class Slot11_1 {
    public static void main(String args[]){
        try {
            String fname="";
            RandomAccessFile ra=new RandomAccessFile("test.txt","rw");
            int choice=0;
            while(choice!=5){
                System.out.println("\n1.Create a File 2.Write Into file 3.Read a File 4.Append into file 5.Delete the File");
                DataInputStream cis= new DataInputStream(System.in);
                System.out.println("Enter your choice!!");
                choice=Integer.parseInt(cis.readLine());
               switch (choice) {
                case 1:
                    //creating file
                    DataInputStream dis= new DataInputStream(System.in);
                    System.out.println("Enter the file with extension, Like example.txt");
                    fname=dis.readLine();
                    ra=new RandomAccessFile(fname,"rw");
                    break;
                case 2:
                    //writing into file
                    DataInputStream wis= new DataInputStream(System.in);
                    System.out.println("Enter the content you want to enter to your file");
                    String st=wis.readLine();
                    ra.seek(0);
                    ra.write(st.getBytes());
                    break;
                case 3:
                    //Reading
                    int i=ra.read();
                    while (i!=-1) {
                        char c=(char)i;
                        System.out.print(c);
                        i=ra.read();
                    }
                
                case 4:
                    //append into file
                    DataInputStream ais= new DataInputStream(System.in);
                    System.out.println("Enter the content you want to enter to your file");
                    ra.seek(ra.length());
                    String apstring=ais.readLine();
                    ra.write(apstring.getBytes());
                    break;
                case 5:
                    //deleting file
                    break;

                default:
                    System.out.println("Wrong entry!!!");
                    break;
               } 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
}