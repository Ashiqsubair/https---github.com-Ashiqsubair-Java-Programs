import java.io.*;
class HeightCalculation{
    public static void main(String args[]){
        Height h1=new Height();
        h1.read();
        h1.display();
        Height h2=new Height();
        h2.read();
        h2.display();
        Height h=new Height();
        h.add(h1, h2);
        h.multiply(h1, h2);
    }
}
class Height{
    int foot;
    int inch;
    public void read(){
        try{
            DataInputStream dis= new DataInputStream(System.in);
            System.out.println("Enter the foot");
            foot=Integer.parseInt(dis.readLine());
            System.out.println("Enter the inches");
            inch=Integer.parseInt(dis.readLine());
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void display(){
        System.out.println(foot+" Foot and "+inch+" inches");
    }
    public void add(Height h1,Height h2){
        Height h3=new Height();
        h3.foot=h1.foot+h2.foot;
        h3.inch=h1.inch+h2.inch;
        if(h3.inch>=12){
            int x=h3.inch/12;
           h3.foot= h3.foot+x;
           h3.inch= (h3.inch%12);
        }
        System.out.println(h3.foot+"Foot and "+h3.inch+" inches");
    }
    public void multiply(Height h1,Height h2){
        Height h3=new Height();
        h3.foot=h1.foot*h2.foot;
        h3.inch=h1.inch*h2.inch;
        if(h3.inch>=12){
            int x=h3.inch/12;
           h3.foot= h3.foot+x;
           h3.inch= (h3.inch%12);
        }
        System.out.println("After multiplication "+h3.foot+"Foot and "+h3.inch+" inches");
    }
}