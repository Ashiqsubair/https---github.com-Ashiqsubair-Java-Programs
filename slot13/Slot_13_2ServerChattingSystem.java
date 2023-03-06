package slot13;

import java.net.*;
import java.io.*;
public class Slot_13_2ServerChattingSystem {
    public static void main(String args[]){

    
    try {
        ServerSocket ss=new ServerSocket(1234);//port of the socket
        System.out.println("waiting for the connection");
        Socket so= ss.accept();
        System.out.println("Connection made");
        DataInputStream dis=new DataInputStream(so.getInputStream());//getting the information from the client
        String str=(String)dis.readUTF();
        System.out.println("The message from Client is :"+str);//printing the string information
        DataOutputStream dos=new DataOutputStream(so.getOutputStream());//sending some message to the client
        dos.writeUTF("Hello user good day!");
        DataInputStream dis2=new DataInputStream(System.in);
        while(true){
            String str3=(String)dis.readUTF();
            if(str3.isEmpty()==false){
                System.out.println("Client :"+str3);
            }
            String str2= dis2.readLine();
            dos.writeUTF(str2);
        }
        // ss.close();
    } catch (Exception e) {
        System.out.print(e);
    }
}
}