//task 5
interface ElectricSystem {
    default void showStatus() {
        System.out.println("Electric system status: Battery and energy mode active.");
    }
}

interface GPSSystem {
    default void showStatus() {
        System.out.println("GPS system status: Navigation active.");
    }
}

abstract class Vehicle {
    abstract void startEngine();
}

class SmartVehicle extends Vehicle implements ElectricSystem, GPSSystem {

    class Engine {
        void engineInfo() {
            System.out.println("Engine is managing internal vehicle operations.");
        }
    }

    @Override
    void startEngine() {
        System.out.println("Vehicle started using push start button.");
    }

    @Override
    public void showStatus() {
        ElectricSystem.super.showStatus();
        GPSSystem.super.showStatus();
        System.out.println("Smart vehicle overall status displayed.");
    }

    public static void main(String[] args) {
        SmartVehicle vehicle = new SmartVehicle();
        vehicle.startEngine();
        vehicle.showStatus();

        SmartVehicle.Engine eng = vehicle.new Engine();
        eng.engineInfo();
    }
}