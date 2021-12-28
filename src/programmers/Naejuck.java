package programmers;

public class Naejuck {

	public static int Naejuck(int []a, int[] b) {
		
		// a[0] * b[0] +a[1] * b[2] + ... 
		int result = 0 ;
		
		for(int i=0; i<a.length;i++) {
			result += a[i] * b[i] ; 
		}

		return result;
	}

	public static void main(String[] args) {
		int result =Naejuck.Naejuck(new int[] {1,2,3,4},new int[] {-3,-1,0,2});
		int result1 = Naejuck.Naejuck(new int[] {-1,0,1},new int[] {1,0,-1});
		System.out.println(result);
		System.out.println(result1);
	}
}
