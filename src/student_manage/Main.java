package student_manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello world!");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
        System.out.println("Press 1 to add student");
        System.out.println("Press 2 to delete student");
        System.out.println("Press 3 to display student");
        System.out.println("Press 4 to EXIT");
        int c=Integer.parseInt(br.readLine());
        if(c==1)
        {
            //add students details
            System.out.println("Enter student name");
            String name= br.readLine();
            System.out.println("Enter student phone number");
            String ph= br.readLine();
            System.out.println("Enter student city");
            String city= br.readLine();

            //create student object to store student
            student st=new student(name,ph, city);
            boolean answer=studentdao.insertstudenttodb(st);
            if (answer){
                System.out.println("Student has been added");
            }else System.out.println("Please try again");
            System.out.println(st);
        }else if(c==2)
        {
            //delete students details
            System.out.println("Enter studentId to delete");
            int userId=Integer.parseInt(br.readLine());
            boolean answer=studentdao.deletestudent(userId);
            if(answer){
                System.out.println("Student deleted");
            }
            else {
                System.out.println("Something went wrong");
            }
        }else if(c==3)
        {
            //display students
            studentdao.showallstudents();
        }else if(c==4)
        {
            break;
        }
        else {

        }
        }
        System.out.println("Thank you for using this application");
        System.out.println("See you again.....!!!!");
    }
}