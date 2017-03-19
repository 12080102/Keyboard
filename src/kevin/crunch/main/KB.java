package kevin.crunch.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class KB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "Hello", "Alaska", "Dad", "Peace", "Sfsdfhs", "QWert", "zxCSv", "bvcn" };
		String[] word = findWords(words);
		for (String s : word) {
			System.out.println("res: " + s);
		}
	}

	public static String[] findWords(String[] words) {
		//Java 8 new functions: stream and filter.
		return Stream.of(words).filter(s->s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
	}
	
	/*public static String[] findWords(String[] words) {
		List<String> ans = new ArrayList<String>();
		String[] a;
		for (String s : words) {
			int c = 0, bre = 0;
			char t = s.toLowerCase().charAt(0);
			switch (t) {
			case 'q':
			case 'w':
			case 'e':
			case 'r':
			case 't':
			case 'y':
			case 'u':
			case 'i':
			case 'o':
			case 'p':
				c = 1;
				break;
			case 'a':
			case 's':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
				c = 2;
				break;
			case 'z':
			case 'x':
			case 'c':
			case 'v':
			case 'b':
			case 'n':
			case 'm':
				c = 3;
				break;
			default:
				c = 0;
				break;
			}
			if (c == 1) {
				for (int i = 1; i < s.length() && bre == 0; i++) {
					switch (s.charAt(i)) {
					case 'q':
					case 'w':
					case 'e':
					case 'r':
					case 't':
					case 'y':
					case 'u':
					case 'i':
					case 'o':
					case 'p':
						break;
					default:
						bre++;
						break;
					}
				}
			} else if (c == 2) {
				for (int i = 1; i < s.length() && bre == 0; i++) {
					switch (s.charAt(i)) {
					case 'a':
					case 's':
					case 'd':
					case 'f':
					case 'g':
					case 'h':
					case 'j':
					case 'k':
					case 'l':
						break;
					default:
						bre++;
						break;
					}
				}
			} else if (c == 3) {
				for (int i = 1; i < s.length() && bre == 0; i++) {
					switch (s.charAt(i)) {
					case 'z':
					case 'x':
					case 'c':
					case 'v':
					case 'b':
					case 'n':
					case 'm':
						break;
					default:
						bre++;
						break;
					}
				}
			}
			if (bre == 0)
				ans.add(s);
			bre = 0;
		}
		a = (String[]) ans.toArray(new String[ans.size()]);
		return a;
	}*/
}