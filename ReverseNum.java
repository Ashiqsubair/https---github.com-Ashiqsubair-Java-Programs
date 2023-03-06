import java.io.*;
class ReverseNum{
    public static void main(String args[]){
        Check c=new Check();
        c.Reverse();
    }
}
class Check{
    public void Reverse(){
        try{
        System.out.println("Enter the number to reverse");
        DataInputStream dis = new DataInputStream(System.in);
        int num=Integer.parseInt(dis.readLine());
        int temp=num;
        int x=0;
        while(num>0){
			x=x*10;
			x=x+(num%10);
			num=num/10;
		}
        System.out.println("Orginal number is "+temp+" Reverse number is "+x);
    }
    catch(IOException e){
        System.out.println(e);
    }
}

}