package Work1;

public class TestStudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("66001", "สมชาย ใจดี", "วิทยาการคอมพิวเตอร์", 3.50);
        Student s2 = new Student("66002", "สมหญิง รักเรียน", "เทคโนโลยีสารสนเทศ", 3.75);

        s1.displayInfo();
        s2.displayInfo();
        
        Student[] students = new Student[3];

        students[0] = new Student("66010", "John Doe", "Engineering", 2.80);
        students[1] = new Student("66011", "Jane Smith", "Mathematics", 3.90);
        students[2] = new Student("66012", "Bob Brown", "Physics", 3.20);

        for (int i = 0; i < students.length; i++) {

            students[i].displayInfo();
        }
    }
}