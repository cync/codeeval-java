package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main implements Comparator<String> {

	public static void main(String[] args) {
		
		int count = 0;
		@SuppressWarnings("unused")
		int res = 0;
		ArrayList<String> frases = new ArrayList<String> ();
		if (args.length > 0) {
			try {
				File file = new File(args[0]);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				@SuppressWarnings("unused")
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
				
					if (line.isEmpty()) continue;
					if (count == 0)
						res = Integer.parseInt(line);
					
					frases.add(line);
					count++;
					
				}
				fileReader.close();
				printLines(frases, res);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Uso: <program> <filename>");
			System.exit(1);
		}
	}
	
	static void printLines (ArrayList<String> array, int result) {
		String[] strArray = array.toArray(new String[array.size()]);
		Arrays.sort(strArray, new Main());
		
		for(int counter=strArray.length-1; counter > 3 ;counter--){
            System.out.println(strArray[counter]);
        }
	}

	@Override
	public int compare(String s1, String s2) {
		 if (s1.length() > s2.length())
	         return 1;
	        else if (s1.length() < s2.length())
	         return -1;
	        else return 0;
	}
}
