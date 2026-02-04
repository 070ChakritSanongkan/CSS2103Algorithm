import java.util.Date;

public class Report {
    // Attributes
    private int Report_code;
    private Date Report_date;

    // Composition: Report ผูกกับ Proposal
    private Proposal proposal;

    public Report(int code, Proposal proposal) {
        this.Report_code = code;
        this.Report_date = new Date();
        this.proposal = proposal; // Composition
    }

    // Methods
    public void viewReports() {
        System.out.println("Viewing Report ID: " + Report_code);
        proposal.viewProposal(); // เรียกดูข้อมูล Proposal ในรายงาน
    }

    public void createReports() {
        System.out.println("Create Report Success.");
    }
}