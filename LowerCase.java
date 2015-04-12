package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LowerCase {
	
	public static void main(String[] args) {

		if (args.length > 0) {
			try {
				File file = new File(args[0]);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				@SuppressWarnings("unused")
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					if (line.length() < 1) {
						   continue;
					}		
	
					System.out.println(line.toLowerCase());
					
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
