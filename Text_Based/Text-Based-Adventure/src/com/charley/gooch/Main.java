package com.charley.gooch;
import java.io.IOException;

import com.charley.gooch.Character_Creation;

public class Main {

	public static void main(String[] args) throws Exception {
		Player player = new Player(Character_Creation.ccStart(), Character_Creation.ccCreateName(), 10, "Stamina", 20);
		Character_Creation.classData(player);
		System.out.println(player.getName());
	}

}
