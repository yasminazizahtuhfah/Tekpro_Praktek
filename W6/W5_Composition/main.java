package W5_Aggregation;

public class main {
	public static void main(String[] args) {
		MPK mpk = new MPK("Majelis Perwakilan Kelas SMANSA Bandung\n");
		Komisi kom1 = new Komisi("Komisi Aspirasi");
		Komisi kom2 = new Komisi("Komisi Pengawasan");
		Komisi kom3 = new Komisi("Komisi Mediasi");
		Komisi kom4 = new Komisi("Komisi Legislasi");
		Komisi kom5 = new Komisi("Komisi Yudikasi");
		
		System.out.println(mpk.getName() + "Memiliki 5 Komisi yaitu :");
		System.out.println("1. " + kom1.getNamaKomisi());
		System.out.println("2. " + kom2.getNamaKomisi());
		System.out.println("3. " + kom3.getNamaKomisi());
		System.out.println("4. " + kom4.getNamaKomisi());
		System.out.println("5. " + kom5.getNamaKomisi());
	}
}


