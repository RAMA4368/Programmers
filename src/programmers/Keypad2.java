package programmers;

public class Keypad2 {

	public static String keypad(int[] numbers, String hand) {

		StringBuilder answer = new StringBuilder();
		// 숫자 % 3이 0이면 R, 1이면 L, 2이면 L이거나 R일 수 있다
		int left = 10, right = 12;
		for (int num : numbers) {
			if (num == 0) {
				num = 11;
			}
			switch (num % 3) {

			case 0: {
				answer.append("R");
				right = num;
			}
			case 1: {
				answer.append("L");
				left = num;
			}
			case 2: {
				int minusL = (num > left) ? num - left : left - num;
				int minusR = (num > right) ? num - right : right - num;
				int distanceL = (minusL % 3) + (minusL % 3); // 여긴 왜 이렇게? 
				int distanceR = (minusR % 3) + (minusR % 3);
				if (distanceL < distanceR) {//오른손까지 거리가 더 멀때
					answer.append("L");
					left = num;
				} else if (distanceR < distanceL) {//왼손까지 거리가 더 멀때
					answer.append("R");
					right = num;
				} else {
					answer.append(hand.equals("right") ? "R" : "L"); //왼손, 오른손까지의 거리가 같을때 
					if (hand.equals("right")) {
						right = num;
					} else {
						left = num;
					}
				}
			}
			}
		}
		return answer.toString();
	}

	public static void main(String[] args) {

	}
}
