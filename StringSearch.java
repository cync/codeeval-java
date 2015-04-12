package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringSearch {

	public static void main(String[] args) {
		
		if (args.length > 0) {
			try {
				File file = new File(args[0]);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				String line;
				String[] str;
		
				
				while ((line = bufferedReader.readLine()) != null) {
					// Parse the arguments.
					if (line.isEmpty())
						continue;
					
					str=line.split(",");
					
					str[1] = str[1].trim();
					
					if (str[0].contains(str[1])) {
						System.out.println("true");
					} else {
						System.out.println("false");
					}
					
					
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Uso: <program> <filename>");
			System.exit(1);
		}
	}		
}
