public class Login {
    // Attributes
    protected String username;
    protected String password;

    // Constructor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Methods
    public boolean loginStatus() {
        // จำลองการเช็คสถานะล็อกอิน
        System.out.println("Checking login status for: " + username);
        return true;
    }
}