package W3;
import java.util.Scanner;
import java.math.BigInteger; //class pada java yang digunakan untuk operasi matematika
/** <h1> Big Number </h1>
 * <p> Dalam soal ini, Anda harus menjumlahkan dan mengalikan bilangan besar!
 * 	Angka-angka ini sangat besar sehingga Anda tidak dapat memuatnya dalam
 * 	tipe data biasa seperti bilangan bulat panjang. Gunakan kekuatan kelas
 * 	BigInteger Java dan selesaikan masalah ini. </p>
 * <b> Format Input </b>
 * 	Akan ada dua baris yang berisi dua angka, a dan b.
 * <b> Constrains </b>
 *	a dan b adalah bilangan bulat non-negatif dan dapat memiliki maksimum 200 digit.
 * <b> Format output <b>
 * 	Keluarkan dua baris. Baris pertama harus berisi a + b, dan baris kedua harus
 * 	berisi a x b. Jangan mencetak angka nol di depan.
 * 
 * @author YasminA
 * @version 1.0
 * @since 2022-02-19
*/				 

public class Soal6_BigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b; //variabel untuk menyimpan nilai inputan
		BigInteger A, B, penjumlahan, perkalian;
		
		a = sc.next(); b = sc.next(); //menyimpan nilai inputan
		A = new BigInteger(a); B = new BigInteger(b); //merubah nilai ke tipe BigInteger
		sc.close();
		penjumlahan = A.add(B); //melakukan operasi penjumlahan
		perkalian = A.multiply(B); //melakukan operasi perkalian
		
		System.out.println(penjumlahan); //mencetak hasil
		System.out.println(perkalian);
	}
}
