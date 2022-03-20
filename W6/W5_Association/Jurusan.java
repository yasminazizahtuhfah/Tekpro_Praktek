package W5_Association;

public class Jurusan {
	String namaJurusan;
	private Mahasiswa mhs;
	
	public Jurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
		mhs = null;
	}

	public String getNamaJurusan() {
		return namaJurusan;
	}

	public void setNamaJurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
	}

	public Mahasiswa getMhs() {
		return mhs;
	}

	public void setMhs(Mahasiswa mhs) {
		this.mhs = mhs;
	}
}



