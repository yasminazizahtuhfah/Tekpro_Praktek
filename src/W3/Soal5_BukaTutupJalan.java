package W3;
import java.util.Scanner;
/** <h1> Buka Tutup Jalan </h1>
 * <p> Setiap empat mobil yang lewat digabung setiap angkanya. Jika (gabungan angka
 * 	tersebut dikurangi 999999) hasilnya dibagi 5 sisa bagi hasilnya 0 maka 4 mobil
 * 	tersebut harus berhenti, dan memperbolehkan mobil lainnya dari arah bersebrangan
 * 	untuk jalan. Begitu terus sebaliknya. </p>
 * <b> Format Input </b>
 * 	Satu baris berupa plat number untuk 4 mobil
 * <b> Format output <b>
 * 	Berupa tulisan “Jalan” atau “Berhenti
 * 
 * @author YasminA
 * @version 1.0
 * @since 2022-02-19
*/

public class Soal5_BukaTutupJalan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = 0L;//menampung 16 buah digit yang merupakan gabungan dari 4 plat mobil
		
		String platMobil = sc.nextLine().replaceAll("\\s", ""); //menghapus spasi antara string yang diinput
		number = Long.parseLong(platMobil); //convert menjadi bilangan bertipe long integer
		
		if((number - 999999) % 5 == 0) {
			System.out.println("berhenti");
		}else {
			System.out.println("jalan");
		}
		sc.close();
	}
}

	