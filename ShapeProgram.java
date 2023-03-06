import java.io.*;
import java.lang.*;
interface Shape{
    public void disp();
    public void calc();
}
class Circle implements Shape{
    int radius;
    public void disp(){
        try{
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Circle \n");
            System.out.println("Radius: ");
            radius=Integer.parseInt(dis.readLine());
            System.out.println("Circle with radius "+radius);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void calc(){
        System.out.println("Area of a circle with radius "+radius+" is "+(3.14*radius*radius));
        System.out.println("==========================================================");
    }
}
class Rectangle implements Shape{
    int length;
    int breadth;
    public void disp(){
        try{
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Rectangle \n");
            System.out.println("Length: ");
            length=Integer.parseInt(dis.readLine());
            System.out.println("Breadth: ");
            breadth=Integer.parseInt(dis.readLine());
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void calc(){
        System.out.println("Area of a rectangle with length "+length+" and breadth "+breadth+" is "+(length*breadth));
        System.out.println("==========================================================");
    }
}
class ShapeProgram{
    public static void main(String args[]){
        int choice=0;
        while(choice!=3){
            try{
                System.out.println("1.Circle 2.Rectangle 3.Exit\nPlease enter your choice");
                DataInputStream dis=new DataInputStream(System.in);
                choice=Integer.parseInt(dis.readLine());
                switch(choice){
                    case 1:{
                        Circle c=new Circle();
                        c.disp();
                        c.calc();
                        break;
                    }
                    case 2:{
                        Rectangle r=new Rectangle();
                        r.disp();
                        r.calc();
                        break;
                    }
                    case 3:{
                        break;
                    }
                    default:{
                        System.out.println("Wrong choice");
                    }
                }
            }
            catch(IOException e){
                System.out.println(e);
            }
            
        }
    }
}