package slot12;

import java.io.*;
class Slot12_1{
	public static void main(String args[]){
		student s=null;
		try{
			FileInputStream fin=new FileInputStream("D:\\java\\s.txt");
			ObjectInputStream ois=new ObjectInputStream(fin);
			s=(student)ois.readObject();
			System.out.println(s.name);
		System.out.println(s.rno);
		System.out.println(s.age);
			//System.out.println("serialization happened");
		   }catch(IOException e){System.out.println(e);}
		   catch(ClassNotFoundException e1){System.out.println(e1);}
		}
}