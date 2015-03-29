package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BitPos {

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
					// Parse the arguments.
					if (line.isEmpty())
						continue;
					final String[] pos = line.split(",");

					// Verify the length of the "position" arguments given in the input file.
					if (pos.length != 3) {
						throw new RuntimeException("Input file must contain three arguments per line.");
					}

					try {
						// Determine whether the bits at p1 and p2 are the same.
						final int n = Integer.parseInt(pos[0]);
						final int p1 = Integer.parseInt(pos[1]);
						final int p2 = Integer.parseInt(pos[2]);
						boolean result = ((n >> (p1-1))&1) == ((n >> (p2-1))&1);
						if (result) {
							System.out.println("true");
						} else {
							System.out.println("false");
						}
					} catch (final NumberFormatException e) {
						throw new RuntimeException("Input file contained non-numeric arguments.");
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
