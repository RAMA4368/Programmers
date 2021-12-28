package programmers;

public class SecretMap2 {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i=0;i<n;i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			 //비트연산 : 7 | 2 이면 00111 | 00001 일 때 하나라도 1이면 1, 아니면 0
		}
	
		for(int i=0; i<n; i++) {
			
			answer[i] = String.format("%"+n+"s", answer[i]); //n 개의 자릿수만큼 문자열 담기
			answer[i] = String.format("1", "#"); //answer[i] 가 1이면 #으로 대체
			answer[i] = String.format("0", " "); //answer[i] 가 0 이면 " "으로 대체
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		 solution(5,new int[] {9,20,28,18,11},new int[] {30,1,21,17,28});
		 solution(6,new int[] {46, 33, 33 ,22, 31, 50},new int[] {27 ,56, 19, 14, 14, 10});
		
	}
}
