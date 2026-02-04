public enum StatusProposal {
    Waiting,
    Rejected,
    Accepted;

    // Method จำลองการเปลี่ยนสถานะตามโจทย์
    public void changeStatus() {
        System.out.println("Status changed.");
    }
}