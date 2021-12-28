package programmers;

public class Lottos {

	
	public static String getLotto(int []lottos, int []win_nums) {
	
		//민우가 구매한 로또 번호 담은 배열 lottos 
		//당첨번호를 담은 배열 win_nums
		int top;
		int bottom=0;
		int zero=0; 

		//1. lottos 와 win_nums 배열안에서 일치하는 숫자의 개수를 찾는다 
		for(int lotto : lottos) {
			if(lotto==0) { // 0 (모르는 값) 이 있으면 
				zero+=1;  
			}
			for(int win : win_nums) {
				if(lotto==win) { // 일치하는 값이 있으면 
					bottom+=1; 
				}
			}
		}

		top = 7 - (bottom+zero) == 0 ? 6 : 7 - (bottom+zero);
		bottom = 7 - bottom == 0 ? 6 : 7-bottom ; // 7-bottom 이 0이면 6순위고, 0이 아니면 7-bottom 순위다. 

		return "["+top+","+bottom+"]";
	}
	
	public static void main(String[] args) {
		String result=getLotto(new int[]{44, 1, 0, 0, 31, 25},new int[]{31, 10, 45, 1, 6, 19});
		String result1=getLotto(new int[]{0, 0, 0, 0, 0, 0},new int[] {38, 19, 20, 40, 15, 25});
		String result2=getLotto(new int[] {45, 4, 35, 20, 3, 9},new int[]{20, 9, 3, 45, 4, 35});
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
