public class ExcitingGame {
	public int howMany(int nClassmates, int nTimes, int who) {
		int count = 0;
		int number = who + 1;
		while (number <= nTimes) {
			if (number % 3 == 0) {
				count++;
			}
			number += nClassmates;
		}
		return count;
	}
}
