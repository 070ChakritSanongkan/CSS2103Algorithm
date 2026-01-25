package Project2;

public class Student {

    private String studentName;
    private String studentId;
    private String faculty;
    private String major;
    public Student() {}
    public Student(String studentName, String studentId, String faculty, String major) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.faculty = faculty;
        this.major = major;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void enroll() {
        System.out.println("From class Student = enroll");
    }
}
