package com.online.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Welcome!!");//.append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		
		System.out.println(fName);
		System.out.println(lName);
		
		insertEmployee(fName,lName);
		
		 System.out.println("Employee Inserted Successfully!!");
		 
		 response.getWriter().append("Welcome!!");
		
	}
	
	
	private static final String SQL_INSERT = "INSERT INTO EMP (fname, lname) VALUES (?,?)";

    public void insertEmployee(String fName, String lName) {
    	
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    
        try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB","root", "3099");
        	preparedStatement = conn.prepareStatement(SQL_INSERT);
        	
            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, lName);

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
