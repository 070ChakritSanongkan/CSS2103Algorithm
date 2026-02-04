import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SYSTEM START ===");

        // 1. สร้าง Department
        Department dept = new Department(101, "IT Department");
        dept.insertDepartment();

        // 2. สร้าง User (ทดสอบ Inheritance จาก Login)
        User u1 = new User(1, 101, "somchai", "1234", "Somchai Jaidee", Gender.M, "somchai@mail.com", RoleUser.Manager);
        u1.userLogin();
        u1.confirmProposal(); // Test Role Manager

        // 3. สร้าง Applicant
        Applicant app1 = new Applicant(500, "Nadech", "Actor", "Bangkok", Gender.M, '0'); // '0' เพราะโจทย์ให้เป็น char
        app1.insertApplicant();

        // 4. สร้าง Proposal (ทดสอบ Composition กับ Applicant)
        Proposal p1 = new Proposal("P-001", "Buy New Server", "Request budget for server", app1);
        p1.viewProposal();
        p1.viewApplicant(); // ดูว่าใครยื่น

        // 5. สร้าง Report (ทดสอบ Composition กับ Proposal)
        Report r1 = new Report(999, p1);
        r1.createReports();
        r1.viewReports();

        System.out.println("=== SYSTEM END ===");
    }
}