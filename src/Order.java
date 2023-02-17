public class Order {
  public void cancelOrder(Order order) {
    if (order == null) {
      System.out.println("Order does not exist.");
      return;
    }
    List<Order> orders = getOrders();
    orders.remove(order);
    Inventory inventory = getInventory();
    for (OrderItem item : order.getItems()) {
      inventory.addItem(item.getProduct(), item.getQuantity());
    }
    System.out.println("Order cancelled successfully.");
  }
}
