public interface Flyable {
    void takeOff();
    void land();
    double maxAltitude();

    // เพิ่ม default method ตามโจทย์
    default String status() {
        return "FLY MODE";
    }
}