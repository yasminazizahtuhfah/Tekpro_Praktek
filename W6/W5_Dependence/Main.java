package W5_Dependence;

public class Main {
	public static void main(String[] args) {
		Costumer pelanggan1 = new Costumer();
		Costumer pelanggan2 = new Costumer();
		pelanggan1.setCostumerId(1);
		pelanggan1.setCostumerName("yasmin");
		pelanggan2.setCostumerId(2);
		pelanggan2.setCostumerName("azizah");
		
		Order resto1 = new Order(pelanggan1);
		Order resto2 = new Order(pelanggan2);
	}
	
}


