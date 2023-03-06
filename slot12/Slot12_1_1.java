package slot12;

import java.io.*;
class Slot12_1_1{
	public static void main(String args[]){
		DataInputStream br=new DataInputStream(System.in);
		try{
			String name;
			int age,no;
			System.out.println("Enter a name:");
			name=br.readLine();
			System.out.println("Enter a roll number:");
			no=Integer.parseInt(br.readLine());
			System.out.println("Enter a age:");
			age=Integer.parseInt(br.readLine());
		    student s=new student(name,no,age);
			FileOutputStream fout=new FileOutputStream("C:\\Users\\sgaya\\OneDrive\\Desktop\\javamca\\s.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			oos.writeObject(s);
			s.disp();
			System.out.println("serialization happened");
		   }catch(IOException e){System.out.println(e);}
		}
}