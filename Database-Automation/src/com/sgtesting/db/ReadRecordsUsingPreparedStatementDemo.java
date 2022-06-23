package com.sgtesting.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ReadRecordsUsingPreparedStatementDemo {

	public static void main(String[] args) {
		//	displayRecordsFromTable();
			insertRecordsInToTable();
		}
		
		private static void displayRecordsFromTable()
		{
			Connection conn=null;
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
				
				String query="select * from dept2";
				PreparedStatement stmt=conn.prepareStatement(query);
				ResultSet rs=stmt.executeQuery(query);
				ResultSetMetaData rsdata=rs.getMetaData();
				String col1=rsdata.getColumnName(1);
				String col2=rsdata.getColumnName(2);
				String col3=rsdata.getColumnName(3);
				System.out.printf("%-12s",col1);
				System.out.printf("%-12s",col2);
				System.out.printf("%-12s",col3);
				System.out.printf("\n");
				while(rs.next())
				{
					String deptno=rs.getString("DEPTNO");
					String deptname=rs.getString("DNAME");
					String place=rs.getString("LOC");
					System.out.printf("%-12s",deptno);
					System.out.printf("%-12s",deptname);
					System.out.printf("%-12s",place);
					System.out.printf("\n");
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					conn.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
		private static void insertRecordsInToTable()
		{
			Connection conn=null;
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
				
				String query="insert into dept2 values(80,'SCIENCE','MANGALORE')";
				PreparedStatement stmt=conn.prepareStatement(query);
				stmt.executeUpdate(query);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					conn.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}

}
