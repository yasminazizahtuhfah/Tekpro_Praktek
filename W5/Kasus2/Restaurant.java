package W5_Kasus2;

public class Restaurant {
	private SediaMenu menu; //inisialisasi variabel bertipe class SediaMenu
	private static byte idMenu;
	byte i;
	
	//constructor
	public Restaurant() {
		menu = new SediaMenu(); //membuat objek dari class SediaMenu
	}
	
	public void tambahMenu(String nama, double harga, int stok) {
		menu.setNamaMakanan(nama, idMenu);
		menu.setHargaMakanan(harga,idMenu);
		menu.setStok(stok, idMenu);
		idMenu++;
	}
	
	public void tampilMenu() {
		for(i=0; i<=idMenu; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(i + "| " + menu.getNamaMakanan(i) + "[" + menu.getStok(i) + "] | Rp." + menu.getHargaMakanan(i));
			}
		}
	}

	public boolean isOutOfStock(byte id) {
		if(menu.getStok(i)==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void pesan(int ID, int jumlah) {
		byte id = (byte) ID;
		if(jumlah < 0) {
			System.out.println("Jumlah yang dimasukkan tidak valid");
		}else if(menu.getStok(id) - jumlah < 0) {
			System.out.println("Makanan habis");
		}else {
			System.out.println("Pesanan anda : " + menu.getNamaMakanan(id));
			System.out.println("Jumlah : " + jumlah);
			System.out.println("Total Harga : " + menu.getHargaMakanan(id)*jumlah);
			menu.ambilStok(id,jumlah);
			System.out.println("===================================================");
		}
	}
	
}
