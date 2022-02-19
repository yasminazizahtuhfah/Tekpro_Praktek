package W3;
import java.util.Scanner;

/** <h1> Gaji Agent </h1>
 * <p> Dalam sebuah agent penjualan. Agent akan menerima gaji pokok sebesar Rp.500.000,00 perbulan.
 * 	Agent akan menerima bonus penjualan sebesar 25% dari total penjualan item jika berhasil menjual
 * 	minimal 40 item. Agent akan menerima bonus penjualan 35% dari total penjualan jika berhasi
 *  menjual diatas 80 item. Namun, Jika Agent menjual dibawah 15 item akan menerima denda pemotongan
 *  gajih pokok sebesar 15% dari total minus penjualan ke 15 item. Selain itu agen hanya menerima
 *  bonus 10% setiap itemnya. Harga setiap item adalah Rp. 50.000,00 </p>
 * <b> Format Input </b>
 * Satu baris berupa jumlah penjualan bulan ini.
 * <b> Format output <b>
 * Satu baris berisi sebuah bilangan berupa gajih yang diterima.
 * 
 * @author YasminA
 * @version 1.0
 * @since 2022-02-19
*/

public class Soal4_GajiAgent {
	public static final int gajiPokok = 500000;
	public static final int hargaItem = 50000;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double gajiAgent, item;
		item = sc.nextDouble();
		sc.close();
		
		if(item >= 40) { //bonus per item = 25%
			gajiAgent = gajiPokok + ((item*hargaItem)*0.25);
		}else if(item > 80) { //bonus per item = 35%
			gajiAgent = gajiPokok + ((item*hargaItem)*0.35);
		}else if(item < 15){
			gajiAgent = gajiPokok - (((15-item)*hargaItem)*0.15);
		}else {
			gajiAgent = gajiPokok + ((item*hargaItem)*0.10);
		}
	System.out.println(gajiAgent);
	}
}
