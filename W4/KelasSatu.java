package W4;
/** <h1> KelasSatu </h1>
 * 
 * @author Yasmin Azizah Tuhfah
 * @version 1.0
 * @since 2022-02-24
*/

public class KelasSatu {
	//blok inisialisasi objek
	{
		System.out.println(11);
	}
	
	//blok inisialisasi statis
	//blok ini akan selalu dieksekusi di awal ketika kelas KelasSatu dipanggil
	static {
		System.out.println(2);
	}
	
	//blok constructor ini akan dijalankan jika objek lain mengirimkan parameter integer
	public KelasSatu(int i)	{
		System.out.println(3);
	}
	
	//blok constructor yang tidak memiliki parameter
	public KelasSatu(){
		System.out.println(4);
	}
}
