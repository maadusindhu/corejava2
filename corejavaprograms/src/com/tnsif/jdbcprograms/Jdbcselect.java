package com.tnsif.jdbcprograms;
import java.sql.*;
import javax.sql.*;
public class Jdbcselect {
	public static void main(String[] args) {
		
	try {
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","maadusindhu@123");
Statement st=conn.createStatement();
String strselect="Select booktitle,price,qty,from book";
ResultSet rst=st.executeQuery(stselect);
System.out.println("records are");
int price=
}
}
}