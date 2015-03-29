package codeeval;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SelfDescrNumber {

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
					if (isSelfDescribing(line)) {
						System.out.println(1);
					} else {
						System.out.println(0);
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

	public static boolean isSelfDescribing(String line) {
		for (int i = 0; i < line.length(); i++) {

			int amount = Character.getNumericValue(line.charAt(i));

			int count = 0;
			for (int j = 0; j < line.length(); j++) {
				if (Character.getNumericValue(line.charAt(j)) == i)
					count++;
			}

			if (count != amount)
				return false;
		}
		return true;
	}
}
