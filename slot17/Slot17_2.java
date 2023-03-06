package slot16.slot17;

import java.sql.*;
public class Slot17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String p1="insert into Department1 values('D01','MCA','Kochi')";
			String q1="insert into Department1 values('D02','MSW','Delhi')";
			stmt.executeUpdate(p1);
			stmt.executeUpdate(q1);
			System.out.println("department1 table value inserted");
			String p2="insert into Emp1 values('101','Rani',10000,'D01')";
			String q2="insert into Emp1 values('102','Vani',20000,'D02')";
			stmt.executeUpdate(p2);
			stmt.executeUpdate(q2);
			System.out.println("emp1 table value inserted");
			ResultSet rs=stmt.executeQuery("select e.eno,e.ename,e.esal,d.dname,d.dloc from emp1 e , department1 d where e.dno=d.dno ");
			System.out.println("ENO ENAME ESAL  DNAME DLOC");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+"   "+rs.getString(5));
			}
			con.close();
		}
		catch(Exception e) {System.out.println(e);}


	}

}
