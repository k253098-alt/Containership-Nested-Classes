//task 6
interface IoTDevice {
    default void update() {
        System.out.println("Device firmware updated.");
    }

    static void info() {
        System.out.println("IoT Device Information.");
    }
}

class SmartSensor implements IoTDevice {

    public static void main(String[] args) {
        SmartSensor device = new SmartSensor();
        device.update();
        IoTDevice.info();
    }
}