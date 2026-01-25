public class StudentRegistration {
    public static void main(String[] args) {

        Student obj1 = new Student();
        obj1.enroll();

        Section s1 = new Section();
        s1.checkseat();
        s1.addseat();
        s1.removeseat();

        Course c1 = new Course();
        c1.addPrerequisite();
        c1.checkPrerequisite();

        Instructor i1 = new Instructor();
        i1.assign(s1);

        Schedule sc1 = new Schedule();
        sc1.checkConflict();

        Enrollment en1 = new Enrollment();
        en1.confirm();
        en1.cancel();
    }
}
