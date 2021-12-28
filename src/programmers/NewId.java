package programmers;

public class NewId {
	public static String solution(String new_id) {
		String answer="";
		String new_id1 = "";
		String new_id2 = "";
		
		// 1) 아이디 길이는 3자이상 15자 이하
		
		// 2) 알파벳 소문자, 숫자, - , _ , . 만 사용가능
		
		// 모든 대문자를 소문자로 치환한다. 
		new_id1 = new_id.toLowerCase();
		
		// 알파벳 소문자, 숫자, -, _, . 를 제외한 모든 문자를 제거
		//https://kkh0977.tistory.com/1098 참고 링크 
		
		for(int i=0;i<new_id1.length();i++) {
			// new_id1의 각 문자가 "[]" 안의 문자들과 매치하면 new_id2 에 문자 추가 
			if(String.valueOf(new_id1.charAt(i)).matches("[a-z0-9 ㄱ-ㅎㅏ-ㅣ가-힣._-]")) { 
						new_id2 += new_id1.charAt(i);
			}
		}
		//마침표가 2번이상 반복되면 하나의 마침표로 치환	
		while(new_id2.indexOf("..")!=-1) { // '..' 가 있으면 
			new_id2 = new_id2.replace("..", ".");
		}
		//빈 문자열이면 a 를 대입
		new_id2 = new_id2.replace(" ", "a"); 
		
		// 이경우는 어떻게??????
		if(new_id2.equals(".")) {
			new_id2 = "a";
		}
		
		// .가 첫번째 문자라면 . 제거 
		while(String.valueOf(new_id2.charAt(0)).indexOf(".")!=-1) {
			new_id2 = new_id2.substring(1,new_id2.length()-1);
		}
		
		//문자가 16자 이상일때 자르기 
		if(new_id2.length()>=16) {
			new_id2 = new_id2.substring(0,15);
		}
		// .가 맨 마지막 문자라면 . 제거
		while((String.valueOf(new_id2.charAt(new_id2.length()-1))).indexOf(".") !=-1) {//맨마지막 문자가 .이면
			new_id2 = new_id2.substring(0,new_id2.length()-1); // 맨마지막 문자 제거 
		}
		
		//길이가 2자 이하면  ab 면 abb 이렇게 길이가 3이 될때까지 반복해서 끝에 붙인다.
		while(new_id2.length()<=2) {
			new_id2 += new_id2.charAt(new_id2.length()-1);
		}
		
		System.out.println(new_id2);
		System.out.println("========");
		answer = new_id2;
		return answer;
	} 
	
	public static void main(String[] args) {
		solution("...!@BaT#*..y.abcdefghijklm");
		solution("z-+.^.");
		solution("=.=");
		solution("123_.def");
		solution("abcdefghijklmn.p");
	}
}
