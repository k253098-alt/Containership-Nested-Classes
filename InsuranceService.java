//task 8
interface InsuranceService {
    default void serviceStatus() {
        System.out.println("Insurance service active.");
    }
}

interface EmergencyService {
    default void serviceStatus() {
        System.out.println("Emergency service ready.");
    }
}

abstract class Patient {
    abstract void getTreatment();
}

class SmartPatient extends Patient implements InsuranceService, EmergencyService {

    class MedicalHistory {
        void showHistory() {
            System.out.println("Displaying medical history.");
        }
    }

    @Override
    void getTreatment() {
        System.out.println("Patient is receiving treatment.");
    }

    @Override
    public void serviceStatus() {
        InsuranceService.super.serviceStatus();
        EmergencyService.super.serviceStatus();
        System.out.println("All patient services are operational.");
    }

    public static void main(String[] args) {
        SmartPatient patient = new SmartPatient();
        patient.getTreatment();
        patient.serviceStatus();

        SmartPatient.MedicalHistory history = patient.new MedicalHistory();
        history.showHistory();
    }
}