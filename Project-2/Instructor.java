import java.util.List;

public class Instructor extends StudentRegistration {
    private String instructorId;
    private String instructorName;
    private List<Section> sectionTeaching;

    public void assign(Section section) {
        System.out.println("From class Instructor = assign");
    }
}
