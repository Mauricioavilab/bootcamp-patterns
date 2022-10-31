package singleton;

import java.sql.*;

public class MySqlDBClient {
    public static MySqlDBClient client = null;
    private static Connection sqlConnection;

    private MySqlDBClient(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sonoo","roott","root");
//here sonoo is database name, root is username and password

        }catch(Exception e){ System.out.println(e);}
    }
    public static MySqlDBClient getClient()
    {
        if (client == null){
            System.out.println("Primera vez");
            client = new MySqlDBClient();
        }

        return client;
    }
    public ResultSet getData(){
        Statement stmt= null;
        ResultSet rs= null;
        try {
            stmt = sqlConnection.createStatement();
            rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            sqlConnection.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return rs;
    }
}





