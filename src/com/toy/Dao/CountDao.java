package com.toy.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CountDao {
	
	// 싱글톤
	private static CountDao instance = new CountDao();
	public static CountDao getInstance() {
		return instance;
	}
	
	private Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver"); //1단계
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		
		return conn;
	}
	// 1. 카운트
	public int count() {
		int totCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT NO TOTCNT FROM COUNTUP";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			totCnt = rs.getInt("totcnt");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return totCnt;
	}
	
	// 2. 카운트업
	public int countUp() {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE COUNTUP SET NO = NO+1";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			System.out.println("카운트업 성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("카운트업 실패");
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
