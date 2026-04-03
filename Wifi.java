//task1
interface WiFi {
    default void connect() {
        System.out.println("Connecting via WiFi...");
    }
}
interface Bluetooth {
    default void connect() {
        System.out.println("Connecting via Bluetooth...");
    }
}
class FAST {
    class Department {
        String deptName;
        Department(String deptName) {
            this.deptName = deptName;
        }
        void showDepartment() {
            System.out.println("Department: " + deptName);
        }
    }
    public static void main(String[] args) {

        FAST fast = new FAST();
        FAST.Department csDept = fast.new Department("Computer Science");
        SmartDevice device = new SmartDevice(csDept);
        device.showDetails();
        device.connect();
    }
}
class SmartDevice implements WiFi, Bluetooth {
    FAST.Department department;
    SmartDevice(FAST.Department department) {
        this.department = department;
    }
    @Override
    public void connect() {
        WiFi.super.connect();
        Bluetooth.super.connect();
        System.out.println("SmartDevice connected.");
    }
    void showDetails() {
        department.showDepartment();
    }
}