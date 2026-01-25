import java.util.Date;
public class Enrollment extends StudentRegistration{
    private Date enrollmentdate;
    private String status;

    public void confirm(){
        System.out.println("From class Enrollment = confirm");
    }
    public void cancel(){
        System.out.println("From class Enrollment = cancel");
    }
}
