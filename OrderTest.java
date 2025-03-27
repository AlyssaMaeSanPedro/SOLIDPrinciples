public class OrderTest {
    public static void main(String[] args) {
        OrderInfo order = new OrderAction();
        InvoiceGenerator invoice = new InvoiceAction();
        NotificationSender notification = new NotificationAction();

        OrderManager manager = new OrderManager(order, invoice, notification);

        manager.Order("John Doe", "123 Main St", 10.0, 2);
        manager.OrderWithInvoice("order_123.pdf", "johndoe@example.com");
    }
}
