package programmers;

import java.util.Stack;

public class Crain {
	
	
	public static int crainGame(int[][] board, int[] moves) {
		int answer =0;
		
		Stack<Integer> stack = new Stack<>();
		//0을 넣어야 오류가 안난다.  >> ??
		stack.push(0);
	
		
		for(int move : moves) {
			
			for(int j=0;j<board.length; j++) {
				if(board[j][move -1]!=0) {
					if(stack.peek() == board[j][move-1]) { // peek 에 쌓인 것과 같으면 
						stack.pop(); //없앤다
						answer+=2; // 인형 2개가 없어지기 때문에 +2 
					}else {
						stack.push(board[j][move-1]);
					}
					board[j][move-1] = 0;
					break;
				}
			}
		}

		return answer;
		
		
 }
	
	public static void main(String[] args) {
		Crain.crainGame(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4});
	}
}
