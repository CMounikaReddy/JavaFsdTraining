package com.education.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FormController() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Welcome!!");//.append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		int Age = Integer.parseInt(request.getParameter("age"));
		String Dob = request.getParameter("dob");
		String Email = request.getParameter("email");
		
		System.out.println(fName + " " + lName);
		System.out.println("Student Age is" + Age + "born on" + Dob);
		System.out.println(Email);
		
		insertStudent(fName,lName,Age,Dob,Email);
		
		 System.out.println("Student Details Added Successfully!!");
		 
		 response.getWriter().append("Welcome!!" + fName + " " + lName);
		
	}
		
	private static final String SQL_INSERT = "INSERT INTO Student (fname,lname,age,dob,Email) VALUES (?,?,?,?,?)";

    public void insertStudent(String fName, String lName,int Age,String Dob,String Email) {
    	
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    
        try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB","root", "3099");
        	preparedStatement = conn.prepareStatement(SQL_INSERT);
        	
            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, lName);
            preparedStatement.setLong(3, Age);
            preparedStatement.setString(4, Dob);
            preparedStatement.setString(5, Email);

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row); //1

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	
        	if(preparedStatement!=null) {
        		try {
        			preparedStatement.close();
        		} catch(SQLException e) {
        			e.printStackTrace();
        		}
        	}
        }
    }

}