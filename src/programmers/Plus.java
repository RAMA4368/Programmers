package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Plus {
	public static ArrayList<Integer> solution(int[] numbers) {
		
		HashSet<Integer> answer = new HashSet<Integer>();
		//HashSet 사용
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(i!=j) {// 같은 인덱스에 있는 값을 더하지 않는다. 
					answer.add(numbers[i] + numbers[j]);
				}
			}
		}
		//Set 은 정렬없이 무작위로 뽑아내기 때문에 정렬이 필요하다.
		//정렬해도 점수는 같음?
		ArrayList<Integer> answerList = new ArrayList<Integer>(answer);
		Collections.sort(answerList);
			
		
		return answerList;
	}
	
	public static void main(String[] args) {
		solution(new int[] {2,1,3,4,1});
		//solution(new int[] {5,0,2,7});
	}
}
