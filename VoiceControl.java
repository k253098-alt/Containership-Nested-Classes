//task 8
interface VoiceControl {
    default void executeCommand() {
        System.out.println("Executing voice command.");
    }
}

interface RemoteControl {
    default void executeCommand() {
        System.out.println("Executing remote command.");
    }
}

abstract class Appliance {
    abstract void turnOn();
}

class SmartAppliance extends Appliance implements VoiceControl, RemoteControl {

    class Settings {
        void showSettings() {
            System.out.println("Device settings opened.");
        }
    }

    @Override
    void turnOn() {
        System.out.println("Appliance turned on.");
    }

    @Override
    public void executeCommand() {
        VoiceControl.super.executeCommand();
        RemoteControl.super.executeCommand();
        System.out.println("Command executed.");
    }

    public static void main(String[] args) {
        SmartAppliance device = new SmartAppliance();
        device.turnOn();
        device.executeCommand();

        SmartAppliance.Settings s = device.new Settings();
        s.showSettings();
    }
}