package codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);

		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(isHappy(Integer.valueOf(line)));

		}
	}

	private static int isHappy(int number) {
		
		 //declaring variables
        int digit1, digit2, digit3, sum;

        while (number != 0 && number != 1 && number != 4 && number != 16 && number != 20
                && number != 37 && number != 42 && number != 58 && number != 89 && number != 145) {
            digit1 = number % 1000;
            digit1 = digit1 / 100;
            digit2 = number % 100;
            digit2 = digit2 / 10;
            digit3 = number % 10;
            digit1 *= digit1;
            digit2 *= digit2;
            digit3 *= digit3;
            number = digit1 + digit2 + digit3;
        }

        if (number == 1) {
            return 1;
        } else {
            return 0;
        }
	}
}
