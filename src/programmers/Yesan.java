package programmers;

import java.util.Arrays;

public class Yesan {

	public static int solution(int[] d, int budget) {
		// 배열에 들어있는 수중 작은 순서대로 나열 
		int []request = new int[d.length];
		Arrays.sort(d);
		int i=0;
	
		for(int req : d) {
			request[i]=req;
			budget = budget - request[i];
			
			if(budget<0) {
				break;
			}
			i++;
		}
		// 예산에서 배열 순서대로 빼주기
		
		// 예산이  - 이면  return		
		
		return i;
	}
	
	
	public static void main(String[] args) {
		int answer = solution(new int[] {1,3,2,5,4}, 9);
		int answer1 = solution(new int[] {2,2,3,3},10);
	}
}
