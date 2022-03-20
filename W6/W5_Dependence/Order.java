package W5_Dependence;

public class Order {
	public int OrderCustomerId;
	public String OrderName;
	
	public Order(Costumer costumer) {
		OrderCustomerId = costumer.getCostumerId();
		OrderName = costumer.getCostumerName();
		
		System.out.println(OrderName);
		System.out.println(OrderCustomerId);
	}
}
