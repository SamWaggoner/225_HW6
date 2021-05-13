
public class OrderQueue {
	
	LinkedQueue<CustomerOrder> orders = new LinkedQueue<CustomerOrder>();
	
	public int stock;
	public int queueLength;
	
	public OrderQueue() {
//		orders.size = 0; // exclude?
		stock = 0;
	}
	
	public OrderQueue(int stock) {
		this.stock = stock;
	}
	
	public void AddOrder(String name, String date, int quantity) {
		orders.enqueue(new CustomerOrder(name, date, quantity));
		queueLength++;
	}
	
	public void AddStock(int numStockAdded) {
		stock += numStockAdded;
	}
	
	public void TakeCustomer() {
//		System.out.println("--------------");
//		System.out.println("Queue length: " + queueLength);
//		System.out.println("Stock: " + stock);
//		System.out.println(orders.peek());
		CustomerOrder firstInLine = orders.peek();
//		System.out.println("About to ship: " + firstInLine.name + " " + firstInLine.quantity);
		firstInLine.Ship();
		if (firstInLine.quantity == 0) {
			orders.dequeue();
			queueLength--;
		}
		stock--;
	}
	
	public void SellAll() {
		while (stock >= 1) {
			TakeCustomer();
		}
	}

	@Override
	public String toString() {
		CustomerOrder firstInLine = orders.peek();
		return firstInLine.quantity + "";
	}
}
