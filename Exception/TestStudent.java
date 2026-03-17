import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
public class TestStudent {
    public static void main(String[] args)  {
        Student s1 = new Student();
        s1.setStudentId("68122250045");
        System.out.println(s1.getStudentId());
        Student s2 = new Student("Panupong","68122250045","Science","Computer Science");
        System.out.println(s2.getStudentName() + " " + s2.getStudentId() + " " + s2.getFaculty() + " " + s2.getMajor());
        Student s = new Student();
        s.enroll();

        Course c1 = new Course();
        c1.setCourseId("CSD1102");
        System.out.println(c1.getCourseId());
        Course c2 = new Course( "CSD1102","Computer Science",null);
        System.out.println(c2.getCourseId() + " " + c2.getCourseName());     
        c2.addPrerequisite(c1);

        Schedule sc1 = new Schedule();
        sc1.setDay("Monday");
        System.out.println(sc1.getDay());
        Schedule sc2 = new Schedule("Monday", Time.valueOf("13:00:00"), Time.valueOf("17:00:00"), "Room 2234");
        System.out.println(sc2.getDay() + " " + sc2.getStartTime() + " " + sc2.getEndTime() + " " + sc2.getRoom());
        sc2.checkConflict();

        Section sec1 = new Section();
        sec1.setSectionId("001");
        System.out.println(sec1.getSectionId());
        Section sec2 = new Section("001", 50, 30, null);
        System.out.println(sec2.getSectionId() + " " + sec2.getSectionCapacity() + " " + sec2.getCurrentSeat());
        sec2.checkSeat();

        Instructor in1 = new Instructor();
        in1.setInstructorId("123456");
        System.out.println(in1.getInstructorId());

        Instructor in2 = new Instructor("123456", "Kui", new ArrayList<>());
        System.out.println(in2.getInstructorName() + " " + in2.getInstructorId());
        in2.assign(null);

         Enrollment e1 = new Enrollment();
        e1.setEnrollmentdate(new Date());
        e1.setStatus("Confirm");
        System.out.println(e1.getEnrollmentdate() + " " + e1.getStatus());
        e1.confirm();

        Enrollment e2 = new Enrollment(new Date(), "Cancel");
        System.out.println(e2.getEnrollmentdate() + " " + e2.getStatus());
        e2.cancel();


    }
}