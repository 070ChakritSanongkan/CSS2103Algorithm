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

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName) {
        try {
            if (studentName == null) {
                throw new Exception("Student name cannot be null");
            }
            this.studentName = studentName;

        } catch (Exception e) {
            System.out.println("Error setting student name: " + e.getMessage());
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        try {
            if (studentId == null) {
                throw new Exception("Student ID cannot be null");
            }
            this.studentId = studentId;

        } catch (Exception e) {
            System.out.println("Error setting student ID: " + e.getMessage());
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        try {
            if (faculty == null) {
                throw new Exception("Faculty cannot be null");
            }
            this.faculty = faculty;

        } catch (Exception e) {
            System.out.println("Error setting faculty: " + e.getMessage());
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        try {
            if (major == null) {
                throw new Exception("Major cannot be null");
            }
            this.major = major;

        } catch (Exception e) {
            System.out.println("Error setting major: " + e.getMessage());
        }
    }

    public void enroll() {
        try {
            if (major == null) {
                throw new Exception("Major cannot be null");
            }

        } catch (Exception e) {
            System.out.println("Error enrolling student: " + e.getMessage());
        }
    }
}