package student_manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection
{
    static Connection con;
    public static Connection create()  {
        try {
        //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            String user="root";
            String password="936969";
            String url="jdbc:mysql://localhost:3306/student_manage";
            con=DriverManager.getConnection(url, user,password);
        }
        catch (Exception e)
        {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }


        return con;
    }
}
