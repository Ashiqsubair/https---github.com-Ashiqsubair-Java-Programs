package slot12;

import java.io.*;
public class student implements Serializable{
	int rno,age;
	String name;
	student(String name,int rno,int age){
		this.name=name;
		this.rno=rno;
		this.age=age;
	}
	public void disp(){
		System.out.println(name);
		System.out.println(rno);
		System.out.println(age);
	}
}