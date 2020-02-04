package com.cts.training.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/helloServlet")
public class Login extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
{
			PrintWriter out = response.getWriter();
			String id=request.getParameter("id");
			String username1= request.getParameter("uname");
			String password1 = request.getParameter("pass");
			out.println("Id: " +id);
			out.println("<br> UserNmae: " +username1);
			out.println("<br> Password: " +password1);
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/cts";
				String username="root";
				String password="admin";
				Connection conn=  DriverManager.getConnection(url, username, password);
				System.out.println("Connection Succesfull");
				String query="insert into login values (?,?,?)";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, id);
				ps.setString(2, username);
				ps.setString(3, password1);
				int result=ps.executeUpdate();
			}
			catch (Exception e) {
			e.printStackTrace();
			}
}
}
