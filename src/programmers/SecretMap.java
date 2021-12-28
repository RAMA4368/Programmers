package programmers;

public class SecretMap {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer  = new String[n] ;
		String []map1 = new String[n];
		String []map2 = new String[n];
		int i=0;
		int j=0;
		
		// 1)지도1에있는 값을 2진수로 바꾼후 배열에 넣는다
		
		// 2) 배열 0 에 있는 정수는 길이가 5인 문자열로 변환. 
		
		// 3) 자른 문자열을 하나씩 배열에 넣기
		
		// 4) 지도 1과 2같은 index에 들어있는 수를 더했을 때 0보다 크면 '#' 를 출력  
		for(int map:arr1) {
			String _map = Integer.toBinaryString(map);
			map1[i]=_map; 
			i++;
		}
	
		//지도2에 있는 값을 2진수로 바꾼 후 배열에 넣는다
		for(int map:arr2) {
			String _map = Integer.toBinaryString(map);
			map2[j]=_map; 
			j++;
		}
		
		for(int a=0;a<map1.length;a++) {
			// 2진수 String 값을 정수로 바꾼다.
			int a1 = Integer.parseInt(map1[a]);
			int b1 = Integer.parseInt(map2[a]);
			int result_int = a1+b1; //같은 index에 있는 2진수를 더한다. 
			
			String _int_toString = Integer.toString(result_int);// 더한 결과값을 String 으로 교체 
			String int_toString = null;
			String resultString = null;
			
			// 길이가 n 보다 작으면 맨앞에 0이 있던 수다.  
			if(_int_toString.length()<n) {
				//n보다 길이가 작은만큼 0을 붙여준다. 
				for(int t=0;t<n-_int_toString.length();t++) {
					int_toString += "0";
				}
				//0 다 붙였으면 그 뒤에 이진수 더한 값을 붙여준다.
				int_toString += _int_toString;
				//이 변수에 null 값이 있었으므로 null 문자열을 빼준다. 
				resultString = int_toString.substring(4); //null 빼고 넣은 값 
			
			//앞에 0이 있던 2진수가 아니면 변수에 그대로 넣어준다.
			}else {
				resultString=_int_toString;
			}
			
			//이진수 문자열을 하나씩 배열에 넣어준다. 
			String []numarray = resultString.split("");
			//가공된 스트링을 나눠서 배열에 넣는다
			String real = null;

			for(int q=0; q<numarray.length;q++) {
				//배열에 있는 문자가 0이면 공백
				if(numarray[q].equals("0")) {
					numarray[q] = " ";
				}else {
					numarray[q] = "#";
				}
				real +=numarray[q];
			}
			//null이 들어가서 길이가 길어지면 문자열을 잘라준다. 
			if(real.length()>n) {
				real = real.substring(4);
				answer[a] = real;
			}else {	
				answer[a] = real;
			}
		}
		
		

	

		return answer;
	}
	
	public static void main(String[] args) {
		solution(5,new int[] {9,20,28,18,11},new int[] {30,1,21,17,28});
		solution(6,new int[] {46, 33, 33 ,22, 31, 50},new int[] {27 ,56, 19, 14, 14, 10});
	}
}
