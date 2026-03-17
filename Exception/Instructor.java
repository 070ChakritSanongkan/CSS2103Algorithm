import java.util.List;

public class Instructor {

    private String instructorId;
    private String instructorName;
    private List<Section> sectionTeaching;

    public Instructor() {}

    public Instructor(String instructorId, String instructorName, List<Section> sectionTeaching){
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.sectionTeaching = sectionTeaching;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        try {
            if (instructorId == null) {
                throw new Exception("Instructor ID cannot be null");
            }
            this.instructorId = instructorId;

        } catch (Exception e) {
            System.out.println("Error setting instructor ID: " + e.getMessage());
        }
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        try {
            if (instructorName == null) {
                throw new Exception("Instructor name cannot be null");
            }
            this.instructorName = instructorName;

        } catch (Exception e) {
            System.out.println("Error setting instructor name: " + e.getMessage());
        }
    }

    public List<Section> getSectionTeaching() {
        return sectionTeaching;
    }

    public void setSectionTeaching(List<Section> sectionTeaching) {
        try {
            if (sectionTeaching == null) {
                throw new Exception("Section list cannot be null");
            }
            this.sectionTeaching = sectionTeaching;

        } catch (Exception e) {
            System.out.println("Error setting section teaching: " + e.getMessage());
        }
    }

    public void assign(Section section) {
        try {
            if (section == null) {
                throw new Exception("Section cannot be null");
            }

            this.sectionTeaching.add(section);

        } catch (Exception e) {
            System.out.println("Error assigning section: " + e.getMessage());
        }
    }
}