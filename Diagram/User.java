// Inheritance: User extends Login
public class User extends Login {
    // Attributes
    private int user_id;
    private int department_id; // Association FK
    private String user_username;
    private String user_password;
    private String user_name;
    private Gender user_gender;
    private String user_email;
    private RoleUser user_role;

    // Constructor
    public User(int id, int deptId, String username, String password, String name, Gender gender, String email,
            RoleUser role) {
        // ส่ง username, password ไปให้ Class แม่ (Login)
        super(username, password);

        this.user_id = id;
        this.department_id = deptId;
        this.user_username = username;
        this.user_password = password;
        this.user_name = name;
        this.user_gender = gender;
        this.user_email = email;
        this.user_role = role;
    }

    // Methods
    public void userLogin() {
        // เรียก method จาก Class แม่
        if (super.loginStatus()) {
            System.out.println("User " + user_name + " logged in successfully.");
        }
    }

    public void addProposal() {
        System.out.println("User creating new proposal...");
    }

    public void viewProposal() {
        System.out.println("User viewing proposal list...");
    }

    public void confirmProposal() {
        if (this.user_role == RoleUser.Manager) {
            System.out.println("Proposal Confirmed by Manager.");
        } else {
            System.out.println("You don't have permission to confirm.");
        }
    }

    public void createReports() {
        System.out.println("User creating report...");
    }

    public void viewReports() {
        System.out.println("User viewing reports...");
    }

    public void updateDepartment() {
        System.out.println("User updating department info...");
    }
}