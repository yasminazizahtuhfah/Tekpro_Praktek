package W4;
/** <h1> Item </h1>
 * 
 * @author Yasmin Azizah Tuhfah
 * @version 1.0
 * @since 2022-02-24
*/

public class Item {
	private String name; //instance variabel baru
	
	//constructor yang diset private
	private Item() {
		name = "Ipin";
	}
	
	//constructor
	public Item(String name) {
		this.name = "Ipin";
		System.out.println(this.name);
	}
}
