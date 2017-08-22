package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","root");
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery("select * from employee");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

