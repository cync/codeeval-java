package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ShortestRepetition {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String linha;

		while ((linha = in.readLine()) != null) {
			linha = linha.trim();

			for (int i = 1; i <= linha.length(); i++) {
				String sub = linha.substring(0, i);
				
			
				String[] lineArray = linha.split(sub);

				boolean splitElmt = true;
				for (String s : lineArray) {
			
					if (!s.isEmpty()) {
						splitElmt = false;
						break;
					}
				}

				if (splitElmt) {
					System.out.println(sub.length());
					break;
				}
			}
		}
	}
}
