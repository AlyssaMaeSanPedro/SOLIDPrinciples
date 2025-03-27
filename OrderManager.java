public class OrderManager {
    private final OrderInfo order;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationSender notificationSender;

    public OrderManager(OrderInfo order, InvoiceGenerator invoiceGenerator, NotificationSender notificationSender) {
        this.order = order;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationSender = notificationSender;
    }

    public void Order(String customerName, String address, double price, int quantity) {
        order.calculateTotal(price, quantity);
        order.placeOrder(customerName, address);
    }

    public void OrderWithInvoice(String fileName, String email) {
        invoiceGenerator.generateInvoice(fileName);
        notificationSender.sendEmailNotification(email);
    }
}
