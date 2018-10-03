package com.charley.gooch;
import com.charley.gooch.Character_Creation;

public class Main {

	public static void main(String[] args) {
		Player player = new Player(Character_Creation.ccStart(), Character_Creation.ccCreateName(), 10, "Stamina", 20);
		Character_Creation.classData();
		System.out.println(player.getName());
	}

}
