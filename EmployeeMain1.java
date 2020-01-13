package com.cts.activity.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class EmployeeMain1
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="admin";
		Connection conn=DriverManager.getConnection(url,username,password);
		System.out.println("connection established:");
		Statement stmt=conn.createStatement();
		/*String query="insert into emp values(19,'gayatri',21,98765678,'cse','guntur',34000)";
		int result=stmt.executeUpdate(query);
		if(result>0)
		System.out.println("data inserted succesfully");
		else
			System.out.println("try again");*/
		/*String query1="delete from emp where id=25";
		int result1=stmt.executeUpdate(query1);
		if(result1>0)
		System.out.println("data deleted succesfully");
		else
			System.out.println("try again");*/
	}
}