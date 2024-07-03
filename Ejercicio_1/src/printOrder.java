public class printOrder {
    public void printOrder(Order order) {
        System.out.println("Order" + order.getItems());
        System.out.println("Total " + order.getTotalAmount());
    }
}
