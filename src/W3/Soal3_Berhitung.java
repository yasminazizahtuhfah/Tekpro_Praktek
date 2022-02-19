package W3;
import java.util.Scanner;
/** <h1> Berhitung </h1>
 * Terdapat 5 buah operator matematika:
 * <ol> 
 * 	<li> Penjumlahan, direpresentasikan dengan '+'. </li>
 * 	<li> Pengurangan, direpresentasikan dengan '-'. </li>
 * 	<li> Perkalian, direpresentasikan dengan '*'. </li>
 * 	<li> Pembagian, direpresentasikan dengan '/'. </li>
 * 	<li> Sisa hasil bagi, direpresentasikan dengan '%'. </li>
 * </ol>
 * <b> Format Input </b>
 * <p> Satu baris berisi A, operator, dan B, masing-masing dipisahkan sebuah spasi,
 * yang menyatakan terdapat operasi "A operator B". </p>
 * <b> Format output <b>
 * Satu baris berisi sebuah bilangan bulat, hasil "A operator B".
 * 
 * @author YasminA
 * @version 1.0
 * @since 2022-02-19
*/

public class Soal3_Berhitung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //membaca input dan disimpan dalam variabel A bertipe integer
		String operator = sc.next(); //membaca input dan disimpan dalam variabel operator bertipe string
		int B = sc.nextInt(); //membaca input dan disimpan dalam variabel B bertipe integer
		sc.close();
			
		if(A>=1 && A<=1000 && B>=1 && B<=1000){ //mengecek apakah nilai A dan B sudah sesuai syarat
			switch(operator) { //menjalankan method sesuai operator yang dipilih
			case "+":
				System.out.println(A+B);
				break;
			case "-":
				System.out.println(A-B);
				break;
			case "*":
				System.out.println(A*B);
				break;
			case "/":
				System.out.println(A/B);
				break;
			case "%":
				System.out.println(A%B);
				break;
			default:
				System.out.println("Operator tidak tersedia");
				break;
			}
		}else {
			System.out.println("Tidak Sesuai Aturan"); //jika nilai A dan B tidak memenuhi syarat
		}
	}
}