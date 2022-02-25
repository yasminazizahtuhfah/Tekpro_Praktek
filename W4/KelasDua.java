package W4;
/** <h1> KelasDua </h1>
 * 
 * @author Yasmin Azizah Tuhfah
 * @version 1.0
 * @since 2022-02-24
*/

public class KelasDua {
	//blok inisialisasi objek ini akan dieksekusi jika kelas KelasDua membuat sebuah objek
	{
		System.out.println(5);
	}
	
	public static void main(String[] args) {
		System.out.println(6); //langkah pertama yang akan dieksekusi jika kelas KelasDua di run
		KelasSatu satu = new KelasSatu(); //membuat objek baru bernama satu dari kelas KelasSatu
		KelasSatu dua = new KelasSatu(10); //membuat objek baru bernama dua dari kelas KelasSatu
	}
}
