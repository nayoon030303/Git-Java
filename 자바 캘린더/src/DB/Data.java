package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Data {

	
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String ur1 = "jdbc:mysql://localhost:3306/t1?serverTimezone=UTC&user=root&password=qwer1234503";
			conn = DriverManager.getConnection(ur1);
			System.out.println("���� ����");
			
		}
		catch(ClassNotFoundException e){
            System.out.println("����̹� �ε� ����");
        }
        catch(SQLException e){
            System.out.println("���� : " + e);
        }
	
 
        finally{
            try{
                if(conn != null && !conn.isClosed()){
                    conn.close();
                }
            }
 
            catch(SQLException e){
                e.printStackTrace();
            }
        }
		

	}

}
