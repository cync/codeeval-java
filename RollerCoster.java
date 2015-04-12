package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class RollerCoster {

	public static void main(String[] args) {

		if (args.length > 0) {
			try {
				File file = new File(args[0]);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
			
				String line, str = "";
				
				while ((line = bufferedReader.readLine()) != null) {
					if (line.length() < 1) {
						continue;
					}
					line = line.toLowerCase();
					boolean cap = true;
			    	for (int i = 0; i < line.length(); i++) {
			    		char c = line.charAt(i); 
			    		String letter = c + ""; 
			    		if (Character.isLetter(c) && cap) {
			    			str += letter.toUpperCase(); 
			    			cap = false; 
			    		} else if (Character.isLetter(c)) {
			    			str += letter.toLowerCase(); 
			    			cap = true; 
			    		} else {
			    		    str += letter; 
			    		}
			    	}
			    
					System.out.println(str);
					str="";
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