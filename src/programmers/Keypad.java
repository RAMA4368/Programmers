package programmers;

public class Keypad {

	public static String keypad(int[] numbers, String hand) {
		String result = null;
		String[] number=new String[15];
		//1.왼손으로 눌러야하는 패드 147
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
				number[i]="L";
				System.out.println("number["+i+"]=" +number[i]);
				//2.오른손으로 눌러야하는 패드 369
				}else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
					number[i]="R";
					System.out.println("number["+i+"]=" +number[i]);
				
				}else {//나머지값들
					System.out.println("나머지 : "+ i + "번째배열 값");
					//만약 numbers[i-1]번째 배열의 값이 -1 이거나 -3 이거나 +3 이면 "L" 
					int val = numbers[i-1];
					System.out.println("number["+i+"]의 값은 " + numbers[i]);
					System.out.println(i+"-1번째 배열의 값은"+val);
					if(val==numbers[i]-1){
						if(val==numbers[i]-3||val==numbers[i]+3) {
							number[i]="L";
							System.out.println("number["+i+"]=" +number[i]);
						}else {
							number[i]="R";
							System.out.println("number["+i+"]=" +number[i]);
						}
						
					}else if(val==numbers[i]+1) {
						if(val==numbers[i]-3||val==numbers[i]+3) {
							number[i]="R";
							System.out.println("number["+i+"]=" +number[i]);
						}else {
							number[i]="L";
							System.out.println("number["+i+"]=" +number[i]);
						}
						
					}else {
						number[i]=number[i-1];
					}
					
					//numbers[i-1]번째 배열의 값이 +1 이거나 -3 이거나 +3 이면 "R"
				}
		}
		
		
		

		//3.이전 배열에 있는 숫자가 +1,-1,+3,-3 이면 그 손으로. 
		
		//4.값이 같으면 오른손 잡이인지 왼손잡이인지 구분
		
		
		
		
		return null;
	}
	
	
	
	
	public static void main(String[] args) {
		Keypad.keypad(new int[] {1,3,4,5,8,2,1,4,5,9,5},"right");
		
		
	}
}
