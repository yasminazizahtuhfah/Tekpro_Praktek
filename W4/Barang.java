package W4;
/** <h1> Barang </h1>
 * <p> Class Barang berfungsi untuk mendefiniskan struktur data yang diperlukan
 * oleh Objek Barang. Kelas ini menggunakan metode enkapsulasi dalam implementasinya
 * terhadap variabel "stok" untuk membatasinya dari akses luar..</p>
 * 
 * @author Yasmin Azizah Tuhfah
 * @version 1.0
 * @since 2022-02-24
*/
public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok; //enkapsulasi membuat variabel stok disembunyikan dari kelas lain
	
	//constructor
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		setStok(stk);
	}
	
	//method getter (encapsulation)
	//method ini bertindak sebagai acessor
	public int getStok() {
		return stok;
	}
	/**
	 * method setter (encapsulation)
	 * method ini bertindak sebagai mutator untuk nilai variabel stok yang dikirimkan
	 * ke dalam method ini, dan operasi yang berlaku untuk variabel stok hanya
	 * operasi penjumlahan 
	 */
	
	public void setStok(int stok) {
		this.stok += stok;
	}
}
