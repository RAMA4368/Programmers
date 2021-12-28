package programmers;

import java.sql.Array;
import java.util.Arrays;


// 1) Arrays.sort()  배열을 정렬한다 - default 값은 내림차순이다.  
// 2) Arrays.copyOfRange(복사할 배열, from, to)

public class Knumber2 {

	public static int[] solution(int[] array, int[][] commands) {
		int []answer = new int[commands.length];
		
		for(int i=0; i<commands.length;i++) {
			int[] result = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
			Arrays.sort(result);
			answer[i] = result[commands[i][2]-1];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] result = solution(new int[] {1,5,2,6,3,7,4},new int[][] {{2,5,3},{4,4,1},{1,7,3}});
		System.out.println(Arrays.toString(result));
	}
}
