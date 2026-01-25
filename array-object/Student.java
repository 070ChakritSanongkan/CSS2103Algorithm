package Work1;

public class Student {

    String studentId;
    String name;
    String major;
    double gpa;

    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("รหัสนักศึกษา : " + studentId);
        System.out.println("ชื่อ         : " + name);
        System.out.println("สาขาวิชา     : " + major);
        System.out.println("เกรดเฉลี่ย    : " + gpa);
    }
}
