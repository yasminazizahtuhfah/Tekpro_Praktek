package W5_Association;

public class main {
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("Yasmin Azizah", 211524064);
		Jurusan jurusan = new Jurusan("Teknik Informatika");
		jurusan.setMhs(mhs);
		mhs.setJurusan(jurusan);
		System.out.println("Nama    : " + mhs.getNama());
		System.out.println("NIM     : " + mhs.getNIM());
		System.out.println("Jurusan : " + jurusan.getNamaJurusan());	
	}
}


