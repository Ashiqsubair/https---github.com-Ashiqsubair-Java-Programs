import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.channels.NonWritableChannelException;

import java.io.*;
import java.lang.*;
class AreaOfCircle{
    public static void main(String args[]){
        Circle c= new Circle();
        c.Area();
    }
}
class Circle{
    public void Area(){
        try{
            float rad;
            System.out.println("Enter the radius");
            DataInputStream dis = new DataInputStream(System.in);
            rad=Float.parseFloat(dis.readLine());
            double area=3.14 * rad * rad;
            System.out.println("Area of circle with radius "+rad+" is "+(int)area);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}