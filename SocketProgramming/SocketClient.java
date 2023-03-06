package SocketProgramming;
import java.net.*;
import java.io.*;
public class SocketClient {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost",1234);
            System.out.print("Alice waiting for connection.");
            ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
            out.writeUTF("Hello Bob");
            out.close();
            s.close()
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
        
    }
}
