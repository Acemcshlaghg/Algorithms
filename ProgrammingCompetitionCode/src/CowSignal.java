import java.util.ArrayList;
import java.util.Scanner;

public class CowSignal {

	public static void code() {
		Scanner s = new Scanner(System.in);
		int m = 5;
		int n = 4;
		int k = 2;

		for (int i = 0; i < m; i++) {
			String str = s.next();
			ArrayList<Character> chars = new ArrayList<>();
			for (int c = 0; c < str.length(); c++) {
				chars.add(str.charAt(c));
				chars.add(str.charAt(c));
			}
			for (int l = 0; l < k; l++) {
				System.out.println(new String(chars.toString().toCharArray()));
			}
		}
	}
}
