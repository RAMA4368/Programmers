package programmers;

import java.util.HashMap;
import java.util.Map;

public class Yaksu {

	public static int solution(int left, int right) {
		
		Map<Integer,Integer>yaksu = new HashMap<>();
		
		for(int i=left;i<right+1;i++) {
			int num=0;
			for(int j=1;j<right+1;j++) {
				//만약 13 % 1 =0 이면 약수 
				if(i % j==0) {
					num++;
				}
			}
			yaksu.put(i,num);
		}
		
		int answer = 0 ;
		for(int number : yaksu.keySet()) {
			
			if(yaksu.get(number)%2==0) {// 짝수면
				answer += number;
			}else {//홀수면
				answer -=number;
			}
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int answer= Yaksu.solution(13,17);
		System.out.println(answer);
	}
}
