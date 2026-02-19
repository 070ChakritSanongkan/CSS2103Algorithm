public class Battery {
    private int percent;

    public Battery() {
        this.percent = 100; // แบตเตอรี่เริ่มที่ 100%
    }

    public void drain(int amount) {
        this.percent -= amount;
        if (this.percent < 0) {
            this.percent = 0;
        }
    }

    public void charge(int amount) {
        this.percent += amount;
        if (this.percent > 100) {
            this.percent = 100;
        }
    }

    public int getPercent() {
        return percent;
    }
}
