public class Department {
    // Attributes ตาม Diagram
    private int department_id;
    private String department_name;

    // Constructor
    public Department(int department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }

    // Methods
    public void insertDepartment() {
        System.out.println("Insert Department: " + department_name);
    }

    public void updateDepartment() {
        System.out.println("Update Department ID: " + department_id);
    }

    public void deleteDepartment() {
        System.out.println("Delete Department ID: " + department_id);
    }
}