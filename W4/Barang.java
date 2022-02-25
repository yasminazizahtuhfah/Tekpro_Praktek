package W4;
/** <h1> Barang </h1>
 * <p> Class Barang berfungsi untuk mendefiniskan struktur data yang diperlukan
 * oleh Objek Barang. </p>
 * @author YasminA
 * @version 1.0
 * @since 2022-02-24
*/

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	//constructor
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		setStok(stk);
	}
	
	//method getter (encapsulation)
	public int getStok() {
		return stok;
	}
	
	//method setter (encapsulation)
	public void setStok(int stok) {
		this.stok += stok;
	}
}
