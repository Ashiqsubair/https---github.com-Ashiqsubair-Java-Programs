package SocketProgramming;
import java.net.*;
import java.io.*;
public class SocketServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(1234);
            System.out.println("Listening for connection.");
            Socket s= ss.accept();
            System.out.println("Connection made!");
            ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
            String str= (String)ois.readUTF();
            System.out.println("Message is "+str);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
