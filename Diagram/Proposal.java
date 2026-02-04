import java.util.Date;

public class Proposal {
    // Attributes
    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal Proposal_status;

    // Composition: Proposal ต้องมี Applicant (1 ต่อ 1)
    private Applicant applicant;

    public Proposal(String code, String title, String text, Applicant applicant) {
        this.proposal_code = code;
        this.proposal_title = title;
        this.proposal_text = text;
        this.proposal_date = new Date(); // วันที่ปัจจุบัน
        this.Proposal_status = StatusProposal.Waiting; // ค่าเริ่มต้น Waiting
        this.applicant = applicant; // ผูก Applicant เข้ากับ Proposal (Composition)
    }

    // Methods
    public void viewProposal() {
        System.out.println("View Proposal: " + proposal_title);
        System.out.println("Status: " + Proposal_status);
    }

    public void viewStatus() {
        System.out.println("Current Status: " + Proposal_status);
    }

    public void updateProposal() {
        System.out.println("Update Proposal: " + proposal_code);
    }

    public void deleteProposal() {
        System.out.println("Delete Proposal: " + proposal_code);
    }

    public void archiveProposal() {
        System.out.println("Archive Proposal...");
    }

    public void viewApplicant() {
        System.out.println("Applicant Name: " + applicant.getName());
    }
}