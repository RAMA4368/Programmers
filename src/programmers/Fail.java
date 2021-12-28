package programmers;


import java.util.HashMap;
import java.util.Map;

public class Fail {

	public static int[] solution(int N, int[] stages) {
	int[] answer = new int[N];
	Map<Integer,Float>failPercent = new HashMap<>();
	
	
		float[] array=new float[N] ;//현재 stage 상황을 담을 배열 
		for(int i=0;i<stages.length;i++) {
			if(stages[i]-1!=N) {
			int room = stages[i] -1;
			array[room]++;
			}
		}
		// 실패율 구해서 failPercent 에 넣기 
		int total = stages.length;
		for(int i =0;i<N;i++) {
			failPercent.put(i+1, array[i]/total);
			total -=array[i];
		}	

		//failPercent 에 들어있는 값 비교해서 키값을 차례대로 배열에 넣기  	
		for(int i=0;i<N;i++) {
			float max =-1;
			int maxKey = 0;
			
			for(int key : failPercent.keySet()) {
				
				if(max<failPercent.get(key)) {// 가장 큰 값 구하기 . ex) 3=0.5 / 4=0.5 이기때문에 for문 돌다가 if문 밖으로 빠진다.
					max = failPercent.get(key);
					maxKey = key;	
					
				}
			}
			answer[i] = maxKey;
			failPercent.remove(maxKey);//넣은 값 제거 
		}	

		return answer;
	}
	
	public static void main(String[] args) {
		solution(5, new int[] {2,1,2,6,2,4,3,3});
	}
}
