package com.StudentLogin;
import java.sql.*;
public class LoginDao {
	public boolean insert(User user) throws ClassNotFoundException {
		Connection con=null;
		boolean result=false;
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentLogin", "root", "nithiya_7105");

            String query = "INSERT INTO Login (UserName, Password) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, user.getUserName());
            pst.setString(2, user.getPassword());

            int rowsAffected = pst.executeUpdate(); 
            result = rowsAffected > 0; 

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close(); 
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
		
	}

}
