package W9;

public class Comission extends Hourly {
	private double total_sales;
	private double commission_rate;
	
	public Comission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commission_rate = commission;
	}
	
	public void addSales(double totalSales) {
		total_sales = totalSales;
	}
	
	public double pay() {
		double payment = super.pay() + (total_sales * (1.0 + commission_rate));
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sale: " + total_sales;
		return result;
	}

}
