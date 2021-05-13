
public class OrderTester {

	public static void main(String[] args) {
		OrderQueue orders = new OrderQueue(12);
		orders.AddOrder("companyA", "4/08/21", 3);
		orders.AddOrder("companyB", "4/09/21", 5);
		orders.AddOrder("companyC", "4/10/21", 8);
		System.out.println(orders);
		orders.SellAll();
		System.out.println(orders);
		orders.AddStock(8);
		orders.AddOrder("companyD", "4/11/21", 2);
		orders.AddOrder("companyE", "4/12/21", 2);
		orders.AddOrder("companyF", "4/13/21", 5);
		orders.SellAll();
		System.out.println(orders);
	}
}
