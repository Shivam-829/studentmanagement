package student_manage;

public class student {

    private int studentId;
    private String studentname;
    private String studentphone;
    private String studentcity;

    public student(int studentId, String studentname, String studentphone, String studentcity) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.studentphone = studentphone;
        this.studentcity = studentcity;
    }

    public student(String studentname, String studentphone, String studentcity) {
        this.studentname = studentname;
        this.studentphone = studentphone;
        this.studentcity = studentcity;
    }

    public student() {
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentphone() {
        return studentphone;
    }

    public void setStudentphone(String studentphone) {
        this.studentphone = studentphone;
    }

    public String getStudentcity() {
        return studentcity;
    }

    public void setStudentcity(String studentcity) {
        this.studentcity = studentcity;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentId=" + studentId +
                ", studentname='" + studentname + '\'' +
                ", studentphone='" + studentphone + '\'' +
                ", studentcity='" + studentcity + '\'' +
                '}';
    }
}