public class Section extends StudentRegistration {
    private String sectionId;
    private int sectionCapacity;
    private int currentSeat;
    private Instructor instructor;

    public void checkseat(){
        System.out.println("From class Section = checkseat");
    }
    public void addseat(){
        System.out.println("From class Section = addseat");
    }
    public void removeseat(){
        System.out.println("From class Section = removeseat");
    }
}
