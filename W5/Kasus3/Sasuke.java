package W5_Kasus3;

public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	void printDojutsu() {
		super.printDojutsu(); //tambahan sintaks
		System.out.println(this.Dojutsu);
	}
}