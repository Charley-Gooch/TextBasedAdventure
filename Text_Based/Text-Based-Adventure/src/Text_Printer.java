import java.io.*;

public class Text_Printer {
	public static void text_print(String fileName) throws IOException {
		FileReader in	= null;
		FileWriter out = null;
		BufferedReader reader = null;
		try {
			in = new FileReader("C://Users//charley.gooch//git//repository//Text_Based//Text-Based-Adventure//resources//" + fileName);
			reader = new BufferedReader(in);
			String line = "";
			while ((line = reader.readLine())!= null) {
				System.out.println(line);
			}
		}finally {
			if (reader != null) {
				reader.close();
			}
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
