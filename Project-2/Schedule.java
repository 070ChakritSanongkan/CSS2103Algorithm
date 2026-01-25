import java.sql.Time;
public class Schedule extends StudentRegistration{
    private String day;
    private Time startTime;
    private Time endTime;
    private String room;

    public void checkConflict(){
        System.out.println("From class Schedule = checkConflict");
    }
}
