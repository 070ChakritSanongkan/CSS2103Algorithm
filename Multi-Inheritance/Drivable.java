public interface Drivable {
    void startEngine();
    void stopEngine();
    double maxSpeed();

    // เพิ่ม default method ตามโจทย์
    default String status() {
        return "DRIVE MODE";
    }
}