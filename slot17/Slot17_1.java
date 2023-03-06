package slot17;

import java.sql.*;
public class Slot17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String q1="create table Department1(dno varchar2(10) primary key,dname varchar2(10),dloc varchar2(10))";
			String q2="create table Emp1(eno varchar2(10) primary key,ename varchar2(10),esal numeric(10),dno varchar2(10)references Department1)";
			stmt.executeUpdate(q1);
			System.out.println("Department table created");
			stmt.executeUpdate(q2);
			System.out.println("Emp table created");
			con.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
			}

	}

}