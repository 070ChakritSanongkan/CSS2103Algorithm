public class Main {
    public static void main(String[] args) {
        // 1. สร้าง RescueRobot("RR-01")
        RescueRobot robot = new RescueRobot("RR-01");

        // 2. updatePosition เป็นพิกัดใดก็ได้
        robot.updatePosition(13.7563, 100.5018); // ใส่เป็นพิกัดสมมติ

        // 3. takeOff -> status -> land
        robot.takeOff();
        System.out.println(robot.status());
        robot.land();
        System.out.println("Battery left: " + robot.getBatteryPercent() + "%");
        System.out.println("-------------------------");

        // 4. startEngine -> maxSpeed -> stopEngine
        robot.startEngine();
        System.out.println("Max Speed: " + robot.maxSpeed());
        robot.stopEngine();
        System.out.println("Battery left: " + robot.getBatteryPercent() + "%");
        System.out.println("-------------------------");

        // 5. อ่านอุณหภูมิ และ detectHuman(36.5)
        double temp = robot.readTemperatureC();
        System.out.println("Current Temp: " + String.format("%.2f", temp));
        boolean isHuman = robot.detectHuman(36.5);
        System.out.println("Detect Human (>36.5C): " + isHuman);
        System.out.println("-------------------------");

        // 6. send("Found hotspot...")
        robot.send("Found hotspot...");
        System.out.println("Final Battery: " + robot.getBatteryPercent() + "%");
    }
}