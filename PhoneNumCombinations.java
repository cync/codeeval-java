package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PhoneNumCombinations {

	public static void main(String[] args) {
		
		int phoneNumb[] = new int[7];
		if (args.length > 0) {
			try {
				File file = new File(args[0]);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				@SuppressWarnings("unused")
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				
				while ((line = bufferedReader.readLine()) != null) {
					letterCombinations(line);
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

	public static void letterCombinations(String digits) {
		
		String letters = null;
		
        ArrayList<String> res = new ArrayList<String>();
        ArrayList<String> preres = new ArrayList<String>();
        res.add("");
        String[] resultado = new String[7];
        for(int i=0;i<digits.length();i++){
        	
        	letters = map.get(digits.charAt(i));
        	
            for(int j=0;j<letters.length();j++) {
              resultado[i] += letters.charAt(j);
              continue;
            }

            res = preres;
            preres = new ArrayList<String>();

        }
        System.out.println(resultado);
        
       
    }

    @SuppressWarnings("serial")
	static final HashMap<Character,String> map = new HashMap<Character,String>(){{
		
		put('0',"0");
        put('1',"1");
        
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
        
               
    }} ;
}