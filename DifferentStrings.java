public class DifferentStrings {
	public int minimize(String A, String B) {
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i + A.length() <= B.length(); i++) {
			minDiff = Math.min(minDiff,
					calcDiff(A, B.substring(i, i + A.length())));
		}
		return minDiff;
	}

	int calcDiff(String str1, String str2) {
		int diff = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				diff++;
			}
		}
		return diff;
	}
}
