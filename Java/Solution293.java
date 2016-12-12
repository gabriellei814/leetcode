import java.util.*;

public class Solution293 {
	public static void main(String[] args) {
		String str = "++++";
		List<String> res = generatePossibleNextMoves(str);
		for(String s: res) {
			System.out.println(s);
		}
	}

	public static List<String> generatePossibleNextMoves(String s) {
			List<String> res = new ArrayList<>();
			for(int i = 0; i < s.length() - 1; i++) {
					if(s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
							res.add(s.substring(0, i) + "--" + s.substring(i + 2));
					}
			}
			return res;
	}
}
