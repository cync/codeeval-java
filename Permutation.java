package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation {

	public static void main(String[] args) {

		if (args.length > 0) {
			try {
				File file = new File(args[0]);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				String line;
				ArrayList<String> str = new ArrayList<String>();

				while ((line = bufferedReader.readLine()) != null) {
					if (line.isEmpty() || line == null) {
						continue;
					}
					for (String s : all_perm(line)) {
						// System.out.print(s+" ");
						str.add(s);
					}
					sortList(str);
					log(str);
					str.clear();
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

	public static Set<String> concat(String c, Set<String> lst) {
		HashSet<String> ret_set = new HashSet<String>();
		for (String s : lst) {
			ret_set.add(c + s);
		}
		return ret_set;
	}

	public static HashSet<String> all_perm(String a) {
		HashSet<String> set = new HashSet<String>();
		if (a.length() == 1) {
			set.add(a);
		} else {
			for (int i = 0; i < a.length(); i++) {
				set.addAll(concat(a.charAt(i) + "", all_perm(a.substring(0, i)
						+ a.substring(i + 1, a.length()))));
			}
		}
		return set;
	}

	private static void sortList(List<String> aItems) {
		Collections.sort(aItems);
	}

	private static void log(Object aObject) {
		System.out.println(String.valueOf(aObject).replace("[", "")
				.replace("]", "").replace(" ", ""));
	}

}
