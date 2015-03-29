package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FirstNonRepeatChar {

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
					System.out.println(firstNonRepeatedChar(line));
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

	@SuppressWarnings("null")
	public static char firstNonRepeatedChar (String line) {
	
		  HashMap<Character,Integer>  characterhashtable= 
                  new HashMap<Character ,Integer>();
     int i,length ;
     Character c ;
     length= line.length();  
     for (i=0;i < length;i++)
     {
         c=line.charAt(i);
         if(characterhashtable.containsKey(c))
         {
             // increment count corresponding to c
             characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
         }
         else
         {
             characterhashtable.put( c , 1 ) ;
         }
     }
     // Search characterhashtable in in order of string str
     
     for (i =0 ; i < length ; i++ )
     {
         c= line.charAt(i);
         if( characterhashtable.get(c)  == 1 )
         return c;
     }
     return (Character) null ;
		
	}
}
