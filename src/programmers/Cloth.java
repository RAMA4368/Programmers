package programmers;

import java.sql.Array;

public class Cloth {

	public static int solution(int n, int[] lost, int[] reserve) {

		int answer = n-lost.length;
		//도난당한 학생에게 여벌의 옷을 빌려줄때
		for(int i=0;i<lost.length;i++) {
			for(int j=0;j<reserve.length;j++) {
				if(lost[i]-1==reserve[j]||lost[i]+1==reserve[j]) {
					answer++;
					reserve[j] =- 1; //여벌이 있는 학생 배열에서 제외시킨다. 
					break;
				}
				// 여별의 옷이 있는 학생이 도난 당했을 때
				if(lost[i]==reserve[j]) {
					answer++;
					lost[i]=-1;
					reserve[j]=-1;
					break;
				}
			}
		}
		
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		int result = solution(5,new int[] {2,4},new int[] {1,3,5});
		System.out.println(result);
	}
}
