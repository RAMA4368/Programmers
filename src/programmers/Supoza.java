package programmers;

import java.util.ArrayList;


public class Supoza {

	public static ArrayList<Integer> solution(int[] answers) {
		ArrayList<Integer>result = new ArrayList<Integer>();
		
		//1번 수포자
		int []one = {1,2,3,4,5};
		//2번 수포자
		int []two = {2,1,2,3,2,4,2,5};
		//3번 수포자
		int []three= {3,3,1,1,2,2,4,4,5,5};
		
		int []scores = {0,0,0};//답 맞은 개수
		
		for(int i=0;i<answers.length;i++) {
			if(one[i%5] == answers[i]) {scores[0]++;}
			if(two[i%8] == answers[i]) {scores[1]++;}
			if(three[i%10] == answers[i]) {scores[2]++;}
		}
		int []arr = new int[scores.length];
		for(int i=0;i<scores.length;i++) {
			arr[i] = scores[i];
		}
		
		int topScore = Math.max(scores[0], Math.max(scores[1], scores[2])); //3개의 값중 가장 높은 점수를 받은 사람을 구한다.
		if(topScore == scores[0]) {
			result.add(1);//1번 수포자
		}
		if(topScore == scores[1]) {
			result.add(2);//2번 수포자
		}
		if(topScore == scores[2]) {
			result.add(3);//3번 수포자
		}
		
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> result = solution(new int[] {1,2,3,4,5});
		ArrayList<Integer> result1 = solution(new int[] {1,3,2,4,2});
		System.out.println(result);
		System.out.println(result1);
	}
}
