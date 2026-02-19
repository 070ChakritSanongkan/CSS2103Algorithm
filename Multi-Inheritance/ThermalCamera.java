public class ThermalCamera {
    public double getTemp() {
        // สุ่ม/จำลองค่าอุณหภูมิระหว่าง 30.0 - 40.0
        return 30.0 + (Math.random() * 10.0);
    }

    public boolean detectHuman(double temp, double thresholdC) {
        return temp >= thresholdC;
    }
}   