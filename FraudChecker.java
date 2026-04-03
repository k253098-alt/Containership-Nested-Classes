//task 3
abstract class FraudChecker {
    abstract void checkFraud();
}


interface Auditor {
    void auditReport();
}

class BankSystem {

    public static void main(String[] args) {

        FraudChecker fc = new FraudChecker() {
            void checkFraud() {
                System.out.println("Fraud check completed.");
            }
        };

        Auditor auditor = new Auditor() {
            public void auditReport() {
                System.out.println("Auditor report generated.");
            }
        };

        fc.checkFraud();
        auditor.auditReport();
    }
}