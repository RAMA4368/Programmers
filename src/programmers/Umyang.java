package programmers;

public class Umyang {

	public static int Umyang(int []absolutes, boolean[] signs) {
		int result = 0 ;
		for(int i=0;i<absolutes.length;i++) {
			if(signs[i]==false) {
				absolutes[i] -= absolutes[i] * 2;
			}
			result += absolutes[i];
			
		}   
		
		return result; 
	}
	
	public static void main(String[] args) {
		int result = Umyang(new int[] {4,7,12}, new boolean[] {true,false,true});
		int result1 = Umyang(new int[] {1,2,3}, new boolean[] {false,false,true});
		System.out.println(result);
		System.out.println(result1);
	}
}
