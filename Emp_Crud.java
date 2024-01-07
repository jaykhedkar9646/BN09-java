package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Emp_Crud {
	
	

	public static void addEmp() 
	{
		try
		{
		int eId;
		String eName;
		String Address;
		double salary;
		
		System.out.println("Enter Employee Id:");
		Scanner sc2=new Scanner(System.in);
		eId=sc2.nextInt();
		System.out.println("Enter Employee Name:");
		Scanner sc3=new Scanner(System.in);
		eName=sc3.next();
		System.out.println("Enter Employee Address:");
		Scanner sc4=new Scanner(System.in);
		Address=sc4.next();
		System.out.println("Enter Employee salary:");
		Scanner sc5=new Scanner(System.in);
		salary=sc5.nextDouble();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
		String insert="insert into employee values("+eId+",'"+eName+"','"+Address+"',"+salary+")";
		
		Statement smt = con.createStatement();
		
		smt.execute(insert);
		
		con.close();
		smt.close();
		System.out.println("Data inserted successfully...");
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e.getMessage());
		}
	}
	public	static void totalDetails() 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
		String details="select * from employee";
		
		Statement smt = con.createStatement();
		
		ResultSet data = smt.executeQuery(details);
		if(data.isBeforeFirst())
		{
		while(data.next())
		{
			System.out.println(data.getInt(1));
			System.out.println(data.getString(2));
			System.out.println(data.getString(3));
			System.out.println(data.getDouble(4));
			System.out.println("-------------------");
		}
		con.close();
		smt.close();
		}
		else
		{
			System.out.println("No record found...");
		}
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e.getMessage());
		}
		
	}
	public static void singleDetails() 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
		
		System.out.println("Enter Employee Id:");
		Scanner sc12=new Scanner(System.in);
		int id=sc12.nextInt();
		
		String check="select Emp_Id from employee where Emp_Id="+id+"";
		Statement smt1 = con.createStatement();
		
		 ResultSet result = smt1.executeQuery(check);
		 if(result.isBeforeFirst())
		 {
		
		String detail="select * from employee where Emp_Id="+id+"";
		
		Statement smt = con.createStatement();
		
		ResultSet data = smt.executeQuery(detail);
		while(data.next())
		{
			System.out.println(data.getInt(1));
			System.out.println(data.getString(2));
			System.out.println(data.getString(3));
			System.out.println(data.getDouble(4));
			System.out.println("-------------------");
		}
		con.close();
		smt.close();
		 }
		 else
		 {
			 System.out.println("Entered Id not found...");
		 }
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e.getMessage());
		}
	}
	public static void deleteEmp() 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
		
		System.out.println("Enter Employee Id:");
		Scanner sc22=new Scanner(System.in);
		int id=sc22.nextInt();
		
		String check="select Emp_Id from employee where Emp_Id="+id+"";
		Statement smt1 = con.createStatement();
		
		 ResultSet result = smt1.executeQuery(check);
		 if(result.isBeforeFirst())
		 {
		
		String delete="delete from employee where Emp_Id="+id+"";
		
		Statement smt = con.createStatement();
		
		smt.execute(delete);
		
		con.close();
		smt.close();
		System.out.println("Employee Deleted Successfully...");
		 }
		 else
		 {
			 System.out.println("Entered Id not found...");
		 }
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e.getMessage());
		}
	}
	public static void updateName() 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
		
		System.out.println("Enter Employee Id:");
		Scanner sc22=new Scanner(System.in);
		int id=sc22.nextInt();
		
		String check="select Emp_Id from employee where Emp_Id="+id+"";
		Statement smt1 = con.createStatement();
		
		 ResultSet result = smt1.executeQuery(check);
		 if(result.isBeforeFirst())
		 {
		
		System.out.println("Enter New Name:");
		Scanner sc23=new Scanner(System.in);
		String name=sc23.next();
		
		String update="update employee set Name='"+name+"' where Emp_Id="+id+"";
		
		Statement smt = con.createStatement();
		
		smt.executeUpdate(update);
		
		con.close();
		smt.close();
		System.out.println("Name Updated Successfully...");
		 }
		 else
		 {
			 System.out.println("Entered Id Not found...");
		 }
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e.getMessage());
		}
	}
	public static void upadteAddress() 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
		
		System.out.println("Enter Employee Id:");
		Scanner sc32=new Scanner(System.in);
		int id=sc32.nextInt();
		
		String check="select Emp_Id from employee where Emp_Id="+id+"";
		Statement smt1=con.createStatement();
		ResultSet result=smt1.executeQuery(check);
		
		if(result.isBeforeFirst())
		{
		
		System.out.println("Enter New Address:");
		Scanner sc43=new Scanner(System.in);
		String addrs=sc43.next();
		
		String update="update employee set Address='"+addrs+"' where Emp_Id="+id+"";
		
		Statement smt = con.createStatement();
		
		smt.executeUpdate(update);
		
		con.close();
		smt.close();
		System.out.println("Address Updated Successfully...");
		}
		else
		{
			System.out.println("Entered Id Not found...");
		}
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e.getMessage());
		}
	}
	public static void updateSalary() 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
		
		System.out.println("Enter Employee Id:");
		Scanner sc52=new Scanner(System.in);
		int id=sc52.nextInt();
		
		String check="select Emp_Id from employee where Emp_Id="+id+"";
		Statement smt1=con.createStatement();
		ResultSet result=smt1.executeQuery(check);
		
		if(result.isBeforeFirst())
		{
		
		System.out.println("Enter New Salary:");
		Scanner sc63=new Scanner(System.in);
		String salary=sc63.next();
		
		String update="update employee set Salary="+salary+" where Emp_Id="+id+"";
		
		Statement smt = con.createStatement();
		
		smt.executeUpdate(update);
		
		con.close();
		smt.close();
		System.out.println("salary Updated Successfully...");
		}
		else
		{
			System.out.println("Entered Id Not found...");
		}
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e.getMessage());
		}
	
	}
	public static void main(String[] args) 
	{
		
		while(true)
		{
			System.out.println("--------//------------//----------//------------");	
		int choice=0;
		
		System.out.println("Choose Operation...");
		System.out.println("1: Add Employee\n 2: View Total Emp Details\n 3: View Single Employee Details\n 4: Delete Employee\n 5: Update Employee Details\n 6: Exit");
		while(true)
		{
			try
			{
				Scanner sc123=new Scanner(System.in);
				choice=sc123.nextInt();
				break;
			}catch(Exception e)
			{
				System.out.println("Choice is in digits only...");
			}
		}
		
		switch(choice)
		{
		case 1:
			System.out.println("--------//------------//----------//------------");
			Emp_Crud.addEmp();
			break;
		case 2:
			System.out.println("--------//------------//----------//------------");
			Emp_Crud.totalDetails();
			break;
		case 3:
			System.out.println("--------//------------//----------//------------");
			Emp_Crud.singleDetails();
			break;
		case 4:
			System.out.println("--------//------------//----------//------------");
			Emp_Crud.deleteEmp();
			break;
		case 5:
			Emp_Crud.update();
			break;
			
			
		case 6:
			System.exit(0);
		}
		
		
		}
		
	}
	public static void update()
	{

		while(true)
		{
		
		System.out.println("--------//------------//----------//------------");
		System.out.println("Select Updation...");
		System.out.println("1: Name\n 2: Address\n 3: Salary\n 4: Back");
		Scanner sc1=new Scanner(System.in);
		int updChoice=0;
		while(true)
		{
			try
			{
				Scanner sc43=new Scanner(System.in);
				updChoice=sc43.nextInt();
				break;
			}catch(Exception e)
			{
				System.out.println("Choice is in digits only...");
			}
		}
		switch(updChoice)
		{
		case 1:
			System.out.println("--------//------------//----------//------------");
			Emp_Crud.updateName();
			break;
		case 2:
			System.out.println("--------//------------//----------//------------");
			Emp_Crud.upadteAddress();
			break;
		case 3:
			System.out.println("--------//------------//----------//------------");
			Emp_Crud.updateSalary();
			break;
		case 4:
			Emp_Crud.main(null);
			
		
		}
		
		}
	}
	
}
