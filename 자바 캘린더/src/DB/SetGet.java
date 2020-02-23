package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import Left.FeelingL;

public class SetGet {
	
	private int year;
	private int month;
	private int day;
	private int study;
	private int rest;
	private String feeling;
	private String s1,s2,s3,s4;
	
	private int sumStudy=0;
	
	private Connection conn ;
	private PreparedStatement st ;
	private Statement stmt;
	private ResultSet rs ;
	
	private String url = "jdbc:mysql://localhost:3306/t1?serverTimezone=UTC";//3307,1111
	private String id = "root";
	private String pw = "qwer1234503";

	public SetGet(int year, int month, int day, int study, int rest, String feeling, String s1, String s2, String s3,
			String s4) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.study = study;
		this.rest = rest;
		this.feeling = feeling;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		
	}
	

	public SetGet() {
		
	}


	public void stand() {
		
		conn = null;
		st = null;
		stmt = null;
		rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException ee) {
			System.out.print("DB연결 드라이버가 없음");
		}
		try {
			conn = DriverManager.getConnection(url,id,pw);
		}catch(SQLException ee) {
			System.out.println("DB 서버 연결 실패");
		}
		
	}
	public void setData() {
		
		stand();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
			stmt = conn.createStatement();
			String sql = "insert into data2(_year, _month, _day, study, rest, feeling, s1, s2, s3, s4) value(" + year + "," + month + ", " + day + ","+study+","+rest+",'"+feeling+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"');";
			stmt.executeUpdate(sql);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print("오류가 발생했습니다");
		}finally {
			if(st != null)try {st.close();}catch(SQLException sqle) {}
			if(conn!= null)try {conn.close();}catch(SQLException sqle) {}
		}
		
	}
	public void getData() {
		
		stand();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
			stmt = conn.createStatement();
			String sql = "select * from data2 where _year=\""+year+"\" and _month=\""+month+"\" and _day=\""+day+"\";";
			rs=stmt.executeQuery(sql);
			if(rs.next()) {
				year = rs.getInt("_year");
				month =rs.getInt("_month");
				day = rs.getInt("_day");
				study = rs.getInt("study");
				rest = rs.getInt("rest");
				feeling = rs.getString("feeling");
				s1 = rs.getString("s1");
				s2 = rs.getString("s2");
				s3 = rs.getString("s3");
				s4 = rs.getString("s4");
			
			}else {
				year = 0;
				month = 0;
				day = 0;
				study = 0;
				rest = 0;
				feeling = "0";
				s1 = "null";
				s2 = "null";
				s3 = "null";
				s4 = "null";
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("오류가 발생했습니다");
		}finally {
			if(st!= null)try {st.close();}catch(SQLException sqle) {}
			if(conn!=null)try {conn.close();}catch(SQLException sqle) {}
		}
	}
	public void delect(int year, int month, int day) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
			stmt = conn.createStatement();
			
			String sql = "use t1;";
			stmt.executeQuery(sql);
			
			String sql1 = "DELETE FROM data2 WHERE _year="+year+" and _month="+month+" and _day="+day+";";
			stmt.executeUpdate(sql1);
			
		}catch(ClassNotFoundException ex) {
			System.out.println("로딩 실패");
		}catch(SQLException ex) {
			System.out.println("오류 : " + ex);
		}
		finally {
			
			if(st != null) {
				try {
					st.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	public String studyData(int year, int month) {//sum study;
		
			return selectSum("SELECT sum(study) from data2 Where _year like "+year+" and _month like "+month+"");
	}
	public String restData(int year,int month) {
		return selectSum("SELECT sum(rest) from data2 Where _year like "+year+" and _month like "+month+"");
	}
	public String FeelData(int year,int month,String str) {
		return selectcount("SELECT count(feeling) from data2 Where _year like "+year+" and _month like "+month+" and feeling = \""+str+"\"");
	}
	
	

	private String selectcount(String sql) {
		// TODO Auto-generated method stub
		
		Connection conn;
		Statement stmt;
		ResultSet rs;
		String result = "";
		int n=0;
		
		try 
		{
			conn = DriverManager.getConnection(url,id,pw);
			stmt = conn.createStatement();
			rs= stmt.executeQuery(sql);
			
			if(rs.next()) {
				result = rs.getString("count(feeling)");
			}
		}catch (Exception e) {
			System.out.println("오류:"+e);
		}
		if(result == null)
			result ="0";
		return result;
	}


	private String selectSum(String sql) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement stmt;
		ResultSet rs;
		String result = "";
		
		try 
		{
			conn = DriverManager.getConnection(url,id,pw);
			stmt = conn.createStatement();
			rs= stmt.executeQuery(sql);
			while(rs.next()) {
				result = rs.getString(1);
				break;
			}
			db_Close(rs, stmt, conn);
		}catch (Exception e) {
			System.out.println("오류:"+e);
		}
		if(result == null)
			result ="0";
		return result;

	}
	
	private static void db_Close(ResultSet rs, Statement ps,Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		if(rs != null)rs.close();
		if(ps != null)ps.close();
		if(conn != null)conn.close();
	}

	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getStudy() {
		return study;
	}

	public int getRest() {
		return rest;
	}


	public String getFeeling() {
		return feeling;
	}


	public String getS1() {
		return s1;
	}

	public String getS2() {
		return s2;
	}

	
	public String getS3() {
		return s3;
	}


	public String getS4() {
		return s4;
	}
	
	public int sumStudy() {
		return sumStudy;
		
	}
	

	
	
}
