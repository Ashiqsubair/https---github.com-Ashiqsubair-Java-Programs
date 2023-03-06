package slot16;

import java.io.DataInputStream;
import java.sql.*;
public class Slot16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataInputStream br=new DataInputStream(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String p="create table citizen(cid varchar2(10)primary key,cname varchar2(10),age VARCHAR2(2),dob varchar2(10),address varchar2(10))";
			stmt.executeUpdate(p);
			System.out.println("table created");
			String t1,t2,t3,t4;
			int ag;
			System.out.println("enter id:");
			t1=br.readLine();
			System.out.println("enter name:");
			t2=br.readLine();
			System.out.println("enter age:");
			ag=Integer.parseInt(br.readLine());
			System.out.println("enter dob:");
			t3=br.readLine();
			System.out.println("enter address:");
			t4=br.readLine();
			String q="insert into citizen values('"+t1+"','"+t2+"','"+ag+"','"+t3+"','"+t4+"')";
			stmt.executeUpdate(q);
			System.out.println("value inserted");
			ResultSet rs=stmt.executeQuery("select * from citizen");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+"   "+rs.getString(5));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			}
		}
	}