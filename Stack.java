import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

class Stack{
    public static void main(String args[]){
        Stackclass s= new Stackclass();
        DataInputStream dis=new DataInputStream(System.in);
        int key=0;
        while(key!=3){
            try{

            System.out.println("Enter your choice 1.Push into Stack 2.Pop from Stack. 3.Exit");
            key=Integer.parseInt(dis.readLine());
            switch (key) {
                case 1:{
                    System.out.println("Enter the value to push");
                    int num= Integer.parseInt(dis.readLine());
                    s.push(num);
                    break;
                }
                case 2:{
                    s.pop();
                    break;
                }
                case 3:{
                    break;
                }
            
                default:
                    System.out.println("Wrong Choice, Enter the correct choice!!");
                    break;
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    }
}
class Stackclass{
    int top=-1;
    int a[];
     Stackclass(){
       a= new int[10];
     }
     public void push(int val){
        if(top==-1){
            top=0;
        }
        else{
            if(top==9){
                System.out.println("Stack is full");
            }
            else{
                
                a[top]=val;
                top=top+1;
                System.out.println("Value pushed");
            }
        }
     }
     public void pop(){
        if(top<0){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(a[top]+" is popped");
            top=top-1;
        }
     }
}