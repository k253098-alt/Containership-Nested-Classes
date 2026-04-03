//task 4
interface GPS {
    void trackLocation();
}

interface Payment {
    void makePayment();
}

class Ride implements GPS, Payment {

    @Override
    public void trackLocation() {
        System.out.println("Tracking ride location via GPS.");
    }

    @Override
    public void makePayment() {
        System.out.println("Processing payment.");
    }

    static class CompanyRules {
        static void showRules() {
            System.out.println("Follow company policies and safety rules.");
        }
    }

    public static void main(String[] args) {
        Ride ride = new Ride();

        ride.trackLocation();
        ride.makePayment();

        Ride.CompanyRules.showRules();
    }
}