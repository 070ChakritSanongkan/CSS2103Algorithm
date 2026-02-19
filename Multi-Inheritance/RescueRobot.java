public class RescueRobot implements Flyable, Drivable, ThermalSensor, Communicable {
    // ใช้งาน Composition
    private Battery battery;
    private GPSTracker gps;
    private ThermalCamera thermal;
    
    private String deviceId;

    public RescueRobot(String deviceId) {
        this.deviceId = deviceId;
        this.battery = new Battery();
        this.gps = new GPSTracker();
        this.thermal = new ThermalCamera();
    }

    // --- ส่วนของ Flyable ---
    @Override
    public void takeOff() {
        battery.drain(5); // หักแบตเตอรี่
        System.out.println("Taking off...");
    }

    @Override
    public void land() {
        battery.drain(5); // หักแบตเตอรี่
        System.out.println("Landing...");
    }

    @Override
    public double maxAltitude() {
        return 500.0;
    }

    // --- ส่วนของ Drivable ---
    @Override
    public void startEngine() {
        battery.drain(2); // หักแบตเตอรี่
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    @Override
    public double maxSpeed() {
        return 80.0;
    }

    // --- จัดการ Default Method ชื่อชนกัน ---
    @Override
    public String status() {
        return "ROBOT: " + Flyable.super.status() + " + " + Drivable.super.status();
    }

    // --- ส่วนของ ThermalSensor ---
    @Override
    public double readTemperatureC() {
        battery.drain(1); // หักแบตเตอรี่
        return thermal.getTemp();
    }

    @Override
    public boolean detectHuman(double thresholdC) {
        battery.drain(3); // หักแบตเตอรี่
        double currentTemp = thermal.getTemp();
        return thermal.detectHuman(currentTemp, thresholdC);
    }

    // --- ส่วนของ Communicable ---
    @Override
    public void send(String message) {
        battery.drain(2); // หักแบตเตอรี่
        System.out.println("ID=" + deviceId + ", POS=" + gps.currentPosition() + ", MSG=" + message);
    }

    @Override
    public String getDeviceId() {
        return deviceId;
    }

    // เมธอดเสริมสำหรับอัพเดตพิกัด GPS เพื่อใช้ใน Main
    public void updatePosition(double lat, double lon) {
        gps.updatePosition(lat, lon);
    }
    
    // ไว้ดูแบตเตอรี่ตอน Test
    public int getBatteryPercent() {
        return battery.getPercent();
    }
}