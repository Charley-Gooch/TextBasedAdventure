import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		Player player = new Player(Character_Creation.ccStart(), "roderick", 10, "Stamina", 20);
		Character_Creation.classData(player);
		//System.out.println(player.getName());
	}

}
