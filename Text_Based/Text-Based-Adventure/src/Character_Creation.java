import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Character_Creation {

	private static String selection = null;
	private static boolean confirmation = false;
	private String[] armour;
	private String[] weapons;
	private String[] stats;
	static Scanner scanner = new Scanner(System.in);

	public static String ccStart() throws IOException {
		Text_Printer.text_print("classes.txt");
		processing();
		String chosen_class = selection;
		return chosen_class;
	}

	public static String ccCreateName() {
		System.out.println("Please enter your character name");
		return scanner.next();
	}


	private static void processing() throws IOException {
		while (confirmation == false) {
			if (selection == null) {
				selection = scanner.next();
			}
			if (selection == "brute" || selection == "ranger" || selection == "warrior" || selection == "wizard") {
				Text_Printer.text_print("class_"+selection);
				System.out.println("to confirm your choice, please type 'confirm', else type another class to view");
				String conf = scanner.next();
				if (conf == "confirm") {
					confirmation = true;
					break;
				} else {
					selection = conf;
					processing();
				}
			}
			else {
				System.out.println("this is not a valid class. please enter: brute, ranger, warrior or wizard.");
				selection = null;
			}
		}
	}

	public static void classData(Player player) throws FileNotFoundException {
		FileReader in = null;
		try {
			in = new FileReader("com/charley/gooch/texts/class_" + player.getPClass() + ".txt");
		}finally {
			System.out.println(in);
		}
	}
}