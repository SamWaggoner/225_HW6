
public class CustomerOrder {
	public String name;
	public String date;
	public int quantity;
	
	public CustomerOrder() {
	}
	
	public CustomerOrder(String name, String date, int quantity) {
		this.name = name;
		this.date = date;
		this.quantity = quantity;
	}
	
	public void Ship() {
		if (quantity > 0)
			quantity--;
		else
			return;
	}

//	@Override
//	public String toString() {
//		return "CustomerOrder [name=" + name + ", date=" + date + ", quantity=" + quantity + "]";
//	}
}
