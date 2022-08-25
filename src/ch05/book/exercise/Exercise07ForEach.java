package ch05.book.exercise;

public class Exercise07ForEach {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int score : array) {
			if (max < score) {
				max = score;
			}
		}
		System.out.println("max : " + max);
		
		int min = Integer.MAX_VALUE;
		for (int scores : array) {
			if (min > scores) {
				min = scores;
			}
		}
		System.out.println("min : " + min);
	}
}
