public class Main {

	public static void main(String[] args) throws Exception {
		Player player = new Player(Character_Creation.ccStart(), Character_Creation.ccCreateName());
		Character_Creation.classData(player);
	}

}
