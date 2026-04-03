//task 9
interface OnlinePayment {
    default void pay() {
        System.out.println("Paid using online payment.");
    }
}

interface CashPayment {
    default void pay() {
        System.out.println("Paid using cash.");
    }
}

abstract class Order {
    abstract void processOrder();
}

class SmartOrder extends Order implements OnlinePayment, CashPayment {

    class Invoice {
        void generateInvoice() {
            System.out.println("Invoice generated.");
        }
    }

    @Override
    void processOrder() {
        System.out.println("Order processed.");
    }

    @Override
    public void pay() {
        OnlinePayment.super.pay();
        CashPayment.super.pay();
        System.out.println("Payment completed.");
    }

    public static void main(String[] args) {
        SmartOrder order = new SmartOrder();
        order.processOrder();
        order.pay();

        SmartOrder.Invoice inv = order.new Invoice();
        inv.generateInvoice();
    }
}