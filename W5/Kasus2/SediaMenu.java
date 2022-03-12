package W5_Kasus2;

public class SediaMenu {
	private String[] NamaMakanan;
	private double[] HargaMakanan;
	private int[] stok;
	
	//Constructor
	public SediaMenu() {
		this.NamaMakanan = new String[15];
		this.HargaMakanan = new double[10];
		this.stok = new int[10];
	}

	public String getNamaMakanan(byte id) {
		return NamaMakanan[id];
	}

	public void setNamaMakanan(String nama, byte id) {
		this.NamaMakanan[id] = nama;
	}

	public double getHargaMakanan(int id) {
		return HargaMakanan[id];
	}

	public void setHargaMakanan(double harga, byte id) {
		this.HargaMakanan[id] = harga;
	}

	public int getStok(byte id) {
		return stok[id];
	}

	public void setStok(int stok, byte id) {
		this.stok[id] += stok;
	}
	
	public void ambilStok(byte id, int jumlah) {
		this.stok[id] -= jumlah;
	}
	
}
