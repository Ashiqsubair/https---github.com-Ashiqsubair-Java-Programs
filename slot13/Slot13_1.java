import java.io.*;
public class Slot13_1 {
	public static void main(String args[]){ 
		StringBuffer s=new StringBuffer("hello"); 
		System.out.println(s.capacity());
		s.append("Ashiq");
		System.out.println(s);
		System.out.println(s.capacity());
		s.append("Subair"); 
		//System.out.println(s.capacity());
		s.insert(9,"s");
		System.out.println(s);
		s.replace(1,3,"aii"); 
		System.out.println(s);
		s.delete(0,7); 
		System.out.println(s);
		s.reverse(); 
		System.out.println(s);
		}	
 }