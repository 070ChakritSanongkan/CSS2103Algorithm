import java.util.Date;

public class Enrollment {

    private Date enrollmentdate;
    private String status;

    public Enrollment() {}

    public Enrollment(Date enrollmentdate, String status) {
        this.enrollmentdate = enrollmentdate;
        this.status = status;
    }

    public Date getEnrollmentdate() {
        return enrollmentdate;
    }

    public void setEnrollmentdate(Date enrollmentdate) {
        try {
            if (enrollmentdate == null) {
                throw new Exception("Enrollment date cannot be null");
            }
            this.enrollmentdate = enrollmentdate;

        } catch (Exception e) {
            System.out.println("Error setting enrollment date: " + e.getMessage());
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        try {
            if (status == null) {
                throw new Exception("Status cannot be null");
            }
            this.status = status;

        } catch (Exception e) {
            System.out.println("Error setting status: " + e.getMessage());
        }
    }

    public void confirm() {
        try {
            status = "Confirmed";
        } catch (Exception e) {
            System.out.println("Error confirming enrollment: " + e.getMessage());
        }
    }

    public void cancel() {
        try {
            status = "Canceled";
        } catch (Exception e) {
            System.out.println("Error canceling enrollment: " + e.getMessage());
        }
    }
}