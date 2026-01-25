
import java.util.List;

public class Course extends StudentRegistration{
    private String courseId;
    private String courseName;
    private List<Course> Prerequisites;

    public void addPrerequisite(){
        System.out.println("From class Course = addPrerequisite");
    }
    public void checkPrerequisite(){
        System.out.println("From class Course = checkPrerequisite");
    }
}
