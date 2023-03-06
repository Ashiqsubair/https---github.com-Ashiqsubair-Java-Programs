package slot13;
import java.net.*;
import java.io.*;
public class Slot_13_2ClientChattingSystem {
    public static void main(String args[]){
        try {
            Socket so=new Socket("localhost",1234);//establishing the connection
            System.out.println("Sending request to Server");
            DataOutputStream dos=new DataOutputStream(so.getOutputStream());//sending information to server
            dos.writeUTF("hello");//sending to the Server
            DataInputStream dis=new DataInputStream(so.getInputStream());//receiving some string information from server
            DataInputStream dis2=new DataInputStream(System.in);
            while(true){
                String str= (String)dis.readUTF();
                System.out.println("server:"+str);//printing the information
                String str2=dis2.readLine();
                dos.writeUTF(str2);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}