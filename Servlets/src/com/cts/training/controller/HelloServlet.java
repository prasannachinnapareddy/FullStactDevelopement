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
public class HelloServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
{
			PrintWriter out = response.getWriter();
			String id=request.getParameter("id");
			String firstname = request.getParameter("fname");
			String lastname= request.getParameter("lname");
			String gmail= request.getParameter("mail");
			String password1 = request.getParameter("pass");
			String repeatpassword = request.getParameter("rpass");
			Long phone=Long.parseLong(request.getParameter("pnumber"));
			out.println("Id: " +id);
			out.println("<br> FirstNmae: " +firstname);
			out.println("<br> LastName: " +lastname);
			out.println("<br> Gmail: " +gmail);
			out.println("<br> Password: " +password1);
			out.println("<br> RepeatPassword: " +repeatpassword);
			out.println("<br> Phone: " +phone);	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/cts";
				String username="root";
				String password="admin";
				Connection conn=  DriverManager.getConnection(url, username, password);
				System.out.println("Connection Succesfull");
				String query="insert into register values (?,?,?,?,?,?,?)";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, id);
				ps.setString(2, firstname);
				ps.setString(3, lastname);
				ps.setString(4, gmail);
				ps.setString(5, password1);
				ps.setString(6, repeatpassword);
				ps.setLong(7, phone);
				int result=ps.executeUpdate();
			}
			catch (Exception e) {
			e.printStackTrace();
			}
}
}