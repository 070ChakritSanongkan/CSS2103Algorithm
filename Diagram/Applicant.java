public class Applicant {
    // Attributes
    private int Applicant_id;
    private String Applicant_name;
    private String Applicant_job;
    private String Applicant_address;
    private Gender Applicant_gender;
    private char Applicant_tel; // โจทย์กำหนดเป็น char แต่ปกติใช้ String (เขียนตามโจทย์)

    public Applicant(int id, String name, String job, String address, Gender gender, char tel) {
        this.Applicant_id = id;
        this.Applicant_name = name;
        this.Applicant_job = job;
        this.Applicant_address = address;
        this.Applicant_gender = gender;
        this.Applicant_tel = tel;
    }

    // Methods
    public void insertApplicant() {
        System.out.println("Insert Applicant: " + Applicant_name);
    }

    public void updateApplicant() {
        System.out.println("Update Applicant info...");
    }

    public void deleteApplicant() {
        System.out.println("Delete Applicant ID: " + Applicant_id);
    }

    // Getter สำหรับแสดงผล
    public String getName() {
        return Applicant_name;
    }
}
