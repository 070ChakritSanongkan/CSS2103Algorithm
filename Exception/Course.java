import java.util.List;

public class Course {

    private String courseId;
    private String courseName;
    private List<Course> prerequisites;

    public Course() {}

    public Course(String courseId, String courseName, List<Course> prerequisites) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.prerequisites = prerequisites;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        try {
            if (courseId == null) {
                throw new Exception("Course ID cannot be null");
            }
            this.courseId = courseId;

        } catch (Exception e) {
            System.out.println("Error setting course ID: " + e.getMessage());
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        try {
            if (courseName == null) {
                throw new Exception("Course name cannot be null");
            }
            this.courseName = courseName;

        } catch (Exception e) {
            System.out.println("Error setting course name: " + e.getMessage());
        }
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<Course> prerequisites) {
        try {
            if (prerequisites == null) {
                throw new Exception("Prerequisite list cannot be null");
            }
            this.prerequisites = prerequisites;

        } catch (Exception e) {
            System.out.println("Error setting prerequisites: " + e.getMessage());
        }
    }

    public void addPrerequisite(Course course) {
        try {
            if (course == null) {
                throw new Exception("Prerequisite course cannot be null");
            }
            prerequisites.add(course);

        } catch (Exception e) {
            System.out.println("Error adding prerequisite: " + e.getMessage());
        }
    }

    public void checkPrerequisite() {
        try {
            if (prerequisites == null || prerequisites.isEmpty()) {
                throw new Exception("No prerequisite course");
            }

        } catch (Exception e) {
            System.out.println("Error checking prerequisite: " + e.getMessage());
        }
    }
}
