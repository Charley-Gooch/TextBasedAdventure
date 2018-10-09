import java.io.BufferedReader;
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
				selection = scanner.nextLine();
				selection = selection.toLowerCase();
			}
			if (selection.equals("brute") || selection.equals("ranger") || selection.equals("warrior") || selection.equals("wizard")) {
				Text_Printer.text_print("class_"+selection+".txt");
				System.out.println("to confirm your choice, please type 'confirm', else type another class to view");
				String conf = scanner.nextLine();
				conf = conf.toLowerCase();
				if (conf.equals("confirm")) {
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

	public static void classData(Player player) throws IOException, NullPointerException {
		//TODO make this assign each part of the player their respective piece of equipment
		String temp = player.getPClass();
		switch(temp) {
		case "wizard": 
			player.setPHelmet("Tattered Cap");
			player.setPChestpiece("Tattered Robe Top");
			player.setPLeggings("Tattered Robe Bottom");
			player.setPMainhand("Broken Stave");
			player.setPOffhand("No Offhand");
			player.setHealth(10);
			player.setResource("Mana");
			player.setResourceCount(15);
			player.setSTR(1);
			player.setCON(1);
			player.setAGI(1);
			player.setINT(3);
			player.setCHA(1);
			break;
		case "warrior":
			player.setPHelmet("Rusty Chainhelm");
			player.setPChestpiece("Rusted Platemail");
			player.setPLeggings("Rusted Chainskirt");
			player.setPMainhand("Shoddy Shortsword");
			player.setPOffhand("Cracked Wooden Shield");
			player.setHealth(10);
			player.setResource("Stamina");
			player.setResourceCount(15);
			player.setSTR(2);
			player.setCON(2);
			player.setAGI(1);
			player.setINT(1);
			player.setCHA(1);
			break;
		case "ranger":
			player.setPHelmet("Leather Cap");
			player.setPChestpiece("Leather Coat");
			player.setPLeggings("Leather Chaps");
			player.setPMainhand("Wooden Bow");
			player.setPOffhand("Withered Quiver");
			player.setHealth(10);
			player.setResource("Stamina");
			player.setResourceCount(15);
			player.setSTR(2);
			player.setCON(1);
			player.setAGI(2);
			player.setINT(1);
			player.setCHA(1);
			break;
		case "brute":
			player.setPHelmet("Rusty Chainhelm");
			player.setPChestpiece("Rusty Chainmail");
			player.setPLeggings("Leather Chaps");
			player.setPMainhand("Shoddy Greatsword");
			player.setPOffhand("No Offhand");
			player.setHealth(10);
			player.setResource("Stamina");
			player.setResourceCount(15);
			player.setSTR(3);
			player.setCON(1);
			player.setAGI(1);
			player.setINT(1);
			player.setCHA(1);
			break;
		}
	}
}