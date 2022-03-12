package W5_Kasus2;
import java.util.*;

public class RestaurantMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,jumlah;
		boolean lagi = true;
		String x=null;
		double tambah, totalBayar=0;
		
		SediaMenu Menu = new SediaMenu();
		Restaurant menu = new Restaurant();
		menu.tambahMenu("Bala-Bala", 1000, 20);
		menu.tambahMenu("Gehu", 1000, 20);
		menu.tambahMenu("Tahu", 1000, 0);
		menu.tambahMenu("Molen", 1000, 20);
		
		menu.tampilMenu();
		while(lagi == true) {
			System.out.println("Masukkan ID pesanan : ");
			id = sc.nextInt();
			System.out.println("Masukkan jumlah pesanan : ");
			jumlah = sc.nextInt();
			menu.pesan(id, jumlah);
			tambah = Menu.getHargaMakanan(id)*jumlah;
			totalBayar = totalBayar + tambah;
			menu.tampilMenu();
			System.out.println("Ingin memesan lagi ? [y/t]");
			x = sc.next();
			if(x == "y") {
				lagi = false;
			}else if(x == "t") {
				System.out.println("Total Pembayaran : " + totalBayar);
			}
		}
	}
}
