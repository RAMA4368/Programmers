package programmers;

import java.sql.Array;

public class Change {

	public static int changesomething(String s) {
		
		String[] Snum = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int result;
		//숫자가 입력되면 숫자가 있는지 확인한다
		for(int i =0;i<Snum.length;i++) {
			s=s.replaceAll(Snum[i], s.valueOf(i));
		}
		System.out.println(Integer.parseInt(s));
		return Integer.parseInt(s);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Change.changesomething("one4seveneight");
	}
	
}
