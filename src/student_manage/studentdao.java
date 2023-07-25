package student_manage;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.SQLException;

public class studentdao
{
    public  static boolean insertstudenttodb(student st)
    {
        boolean f=false;
        try {
        //jdbc code
            Connection con=connection.create();
            String q="insert into students(sname,sphone,scity) values(?,?,?)";
            //prepared statement
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1, st.getStudentname());
            pstmt.setString(2, st.getStudentphone());
            pstmt.setString(3, st.getStudentcity());
            //execute
            pstmt.executeUpdate();
            f=true;

        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deletestudent(int userId)
    {
        boolean f=false;
        try {
            //jdbc code
            Connection con=connection.create();
            String q="delete from students where sid=?";
            //prepared statement
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setInt(1, userId);

            //execute
            pstmt.executeUpdate();
            f=true;

        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        return f;
    }

    public static void showallstudents()
    {

        try {
            //jdbc code
            Connection con=connection.create();
            String q="select * from students;";
            //prepared statement
            Statement stmt=con.createStatement();

            //execute
           ResultSet set= stmt.executeQuery(q);
           while(set.next())
           {
               int id=set.getInt(1);
               String name=set.getString(2);
               String phone=set.getString(3);
               String city=set.getString(4);

               System.out.println("ID: "+id);
               System.out.println("NAME: "+name);
               System.out.println("PHONE: "+phone);
               System.out.println("CITY: "+city);
               System.out.println("+++++++++++++++++++++++++++++++");

           }


        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
}
