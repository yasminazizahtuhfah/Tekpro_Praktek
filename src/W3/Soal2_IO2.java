package W3;
import java.util.Scanner;
/** <h1> Input dan Output (2) </h1>
 * <p> Setiap baris akan diinputkan string dan diikuti oleh integer.
 * Setiap String akan memiliki maksimal 10 karakter alfabet, dan setiap
 * bilangan bulat akan berada dalam rentang inklusif dari 0 hingga 999.</p>
 * <b> Format output <b>
 * Di setiap baris output harus ada dua kolom:
 * <ul> 
 * 	<li> Kolom pertama berisi String dan dibiarkan rata menggunakan tepat 15 karakter. </li>
 * 	<li> Kolom kedua berisi bilangan bulat, yang dinyatakan dengan tepat 3 digit;
 * 		 jika input asli memiliki kurang dari tiga digit, maka harus mengisi digit
 * 		 utama keluaran dengan nol.</li>
 * 
 * @author YasminA
 * @version 1.0
 * @since 2022-02-17
*/

public class Soal2_IO2 {
	public static void main(String[] args) {
		String s[] = new String[3];
		short x[] = new short[3];
		Scanner sc = new Scanner(System.in);
		
        System.out.println("================================");
        for(byte i=0; i<3; i++){
            s[i] = sc.next();
            x[i] = sc.nextShort();
        }
        for(byte j=0; j<3; j++) {
            System.out.printf("%-15s%03d\n",s[j],x[j]);
            // %-15s --> artinya -15 spasi ke kanan untuk string
            // %03 --> artinya 3 spasi ke kiri untuk integer dimulai dari nol
        }
        sc.close();
        System.out.println("================================");
	}
}

