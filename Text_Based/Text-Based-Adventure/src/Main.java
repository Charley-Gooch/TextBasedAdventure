public class Main {

	public static void main(String[] args) throws Exception {
		Player player = new Player(Character_Creation.ccStart(), Character_Creation.ccCreateName(), 10, "Stamina", 20);
		Character_Creation.classData(player);
	}

}
