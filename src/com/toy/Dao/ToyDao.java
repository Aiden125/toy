package com.toy.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.toy.Dto.ToyDto;

public class ToyDao {
	public static final int SUCCESS = 1;
	public static final int FAIL = 0;
	private DataSource ds = null;
	
	// 싱글톤
	private static ToyDao instance = new ToyDao();
	public static ToyDao getInstance() {
		return instance;
	}
	
	// 커넥션풀
	private ToyDao() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/Oracle11g"); 
		} catch (NamingException e) {
			System.out.println(e.getMessage());
		} 
	}
	
	// 0. 정보 가져오기
	public ToyDto getDto(String name) {
		ToyDto dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM WHATIF WHERE NAME=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if(rs.next()){
				int no = rs.getInt("no");
				// String name = rs.getString("name");
				String gender = rs.getString("gender");
				String type = rs.getString("type");
				int hit = rs.getInt("hit");
				dto = new ToyDto(no, name, gender, type, hit);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	
	// 1. 닉네임 중복 조회(select)
	public int checkName(String name) {
		int result = FAIL;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM WHATIF WHERE NAME=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if(rs.next()){
				result = FAIL;
			}else {
				result = SUCCESS;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 2. 정보입력(insert)
	public int joinMember(String name, String gender, String type) {
		int result = FAIL;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO WHATIF(NO, NAME, GENDER, TYPE) " + 
				"    VALUES(WHATIF_SEQ.NEXTVAL, ?, ?, ?)";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, gender);
			pstmt.setString(3, type);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
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
	
	// 3. 전체 조회 및 검색(select)
	public ArrayList<ToyDto> list(String word, int startRow, int endRow) {
		ArrayList<ToyDto> dtos = new ArrayList<ToyDto>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * " + 
				"    FROM (SELECT ROWNUM RN, A.* " + 
				"        FROM(SELECT * " + 
				"                FROM WHATIF " + 
				"                WHERE NAME LIKE '%'||?||'%' " + 
				"                ORDER BY NO DESC) A) " + 
				"    WHERE RN BETWEEN ? AND ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, word);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String type = rs.getString("type");
				int hit = rs.getInt("hit");
				dtos.add(new ToyDto(no, name, gender, type, hit));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}
	
	// 4. 검색된 멤버수
	public int getTotCnt(String name) {
		int totCnt = 0;
		Connection        conn  = null;
		PreparedStatement pstmt = null;
		ResultSet         rs    = null;
		String sql = "SELECT COUNT(*) TOTCNT FROM WHATIF WHERE NAME LIKE '%'||?||'%'";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			rs.next();
			totCnt = rs.getInt("totcnt");
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(rs    != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn  != null) conn.close();
			}catch (SQLException e) {
				// TODO: handle exception
			}
		}
		return totCnt;
	}
}
