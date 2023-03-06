import java.io.DataInputStream;
import java.io.IOException;

interface Polygon {
  public double calculateArea();
}
class Triangle implements Polygon {
    double base;
    double height;
  public Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }
  public double calculateArea(){
    return 0.5 * base * height;
  }
}
public class TestPolygon {
  public static void main (String args[]){
    try{
        System.out.println("Base of triangle :");
        DataInputStream dis=new DataInputStream(System.in);
        Double base=Double.parseDouble(dis.readLine());
        System.out.println("Height of triangle :");
        Double height=Double.parseDouble(dis.readLine());
        Polygon p1 = new Triangle(base, height);
        System.out.println("Area of Triangle: "+p1.calculateArea());
    }
    catch(IOException e){
        System.out.println(e);
    }
    
  }
}