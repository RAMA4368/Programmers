package programmers;

import java.sql.Array;
import java.util.Arrays;


// 1) Arrays.sort() 
// 2) Arrays.copyOfRange()

public class Knumber {

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length]; //정답은 commands의 행만큼 나온다. 
		int from = 0 ; // 몇번째부터?
		int to = 0 ; // 몇번째까지?
		int want=0; // 몇번째 배열의 값을 원해? 
		int n = 0; 
		int nw =0;  

		for(int i=0;i<commands.length;i++) {
			 
			 n=0;
			 from = commands[i][0];
			 to = commands[i][1];
			 want =commands[i][2];
			 
			 //배열의 크기를 정해준다.  
			 int []result = new int [(to-from)+1];
	
			 for(int j=from-1; j<to;j++){
				result[n] = array[j];
				n++;
			 }
			 //마구잡이로 들어가있는 배열을 정렬시킨다.
			 Arrays.sort(result);
			 answer[nw] = result[want-1]; // 정렬된 숫자들중 원하는 숫자를 빈 배열에 넣는다. 
			 nw++;
			 
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] result = solution(new int[] {1,5,2,6,3,7,4},new int[][] {{2,5,3},{4,4,1},{1,7,3}});
		System.out.println(Arrays.toString(result));
	}
}
