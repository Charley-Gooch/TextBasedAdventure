package com.charley.gooch;
import java.io.*;

public class Text_Printer {
	public static void text_print(String fileName) throws IOException {
	  FileReader in	= null;
	  FileWriter out = null;
	  try {
		  in = new FileReader("com.charley.gooch.texts/" + fileName);
		  System.out.println(in);
	  }finally {
		  if (in != null) {
			  in.close();
		  }
		  if (out != null) {
			  out.close();
		  }
	  }
	}
}
