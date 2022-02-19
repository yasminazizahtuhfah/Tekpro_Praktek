package W3;
import java.util.Scanner;
/** <h1> Input dan Output </h1>
 * <p> Diberikan string, s, cocok dengan ekspresi reguler [A-Za-z !,?._'@]+,
 * pisahkan string menjadi token. Kami mendefinisikan token menjadi satu atau
 * lebih huruf alfabet Inggris berturut-turut. Kemudian, cetak jumlah token,
 * diikuti oleh setiap token pada baris baru. </p>
 * 
 * @author YasminA
 * @version 1.0
 * @since 2022-02-17
*/

public class Soal1_IO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); //proses pembacaan input bertipe string
	    sc.close();
	 
        String[] tokens = s.trim().split("[!,?.*_'@\\ ]+");
        int size = tokens.length;
        System.out.println(size);
	        for(int i=0; i<size; i++){
	            System.out.println(tokens[i]); //proses cetak string
	        }
	}
}

/*
if(!sc.hasNext()){
	System.out.println("0");
	sc.close();
	return;
}
*/