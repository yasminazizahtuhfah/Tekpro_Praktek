package W4;
/** <h1> Inventori </h1>
 * <p> Class Inventori berfungsi untuk mendefinisikan pembuatan objek-objek barang dan
 * menampilkan objek barang yang telah dibuat dan pengadaan barang baru untuk
 * menambah stok barang. Class inventori juga adalah Main Classnya. </p>
 * 
 * @author Yasmin Azizah Tuhfah
 * @version 1.0
 * @since 2022-02-24
*/

public class Inventori {
	Barang[] barangs; //membuat instance baru bernama bernama array barangs bertipe barang
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10); //membuat objek pertama
		barangs[1] = new Barang("002", "Celana", 20); //membuat objek kedua
	}
	
	void showBarang() {
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}

	void pengadaan() {
		initBarang();
			barangs[0].setStok(20);
			barangs[1].setStok(30);
			showBarang();
	}
	
	public static void main(String[] args) {
		Inventori beli = new Inventori();
		beli.pengadaan();
	}
}
