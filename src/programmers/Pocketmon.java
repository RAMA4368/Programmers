package programmers;

import java.util.HashSet;

public class Pocketmon {

	// Hash를 몰랐을 때 해결법
	public static int Solution(int[] nums) {
		
		// 1) 배열의 길이 / 2 의 값을 구한다. result 새로운 배열을 만든다 . 
		int numsLen = nums.length/2;
		int []result = new int[numsLen];
		
		// 2) result[0] 에 비교할 값을 넣는다. 
		result[0] = nums[0];
		
		int i=0;
		// 3) 반복문으로 받은 파라미터 배열안에 들어있는 수와 result[0]을 비교한다.
		for(int j=1;j<nums.length;j++) {
			// result[0] 과 넣으려는 값이 다르면
			if(result[0]!=nums[j]) {
				// 그리고 넣으려고하는 배열 전의 값과 다르면 (result 배열에 같은 숫자가 들어가면 안된다)
				if(result[i]!=nums[j]) {
					i++;
					result[i]=nums[j];
				}
			}	
			// result 배열이 꽉차면 끝
				if(i==numsLen-1) {
					break;
				}
				}
		 //	배열에 0이 있으면 총 개수에서 빼기 ( 배열을 모두 못채웠을 경우 ) 
				int b=0;
				for(int a=0;a<result.length;a++) {
					if(result[a]==0) {
						b++;
					}
				}
				int answer = result.length-b;
		return answer; 
	}
	
	
	
	//Hash를 알때의 해결법
	public static int Solution1(int[] nums) {
		 
        int answer = 0;
		int n = nums.length/2;
		//HashSet 은 중복된 값을 허용하지 않는다.
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++) {
			hashSet.add(nums[i]);
		}
		if(n < hashSet.size()) answer = n;
		else answer = hashSet.size();
		return answer;
}
	
	
	
	
	public static void main(String[] args) {
		int answer=Pocketmon.Solution(new int[] {3,1,2,3});
		int answer2=Pocketmon.Solution(new int[] {3,3,3,2,2,4});
		int answer1=Pocketmon.Solution(new int[] {3,3,3,2,2,2});
		System.out.println(answer);
		System.out.println(answer1);
		System.out.println(answer2);
	}
}
