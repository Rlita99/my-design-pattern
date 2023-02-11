package codingtest;

// 단어 s의 가운데 글자를 반환하는 함수  solution만들기.
// 단어의 길이가 짝수라면 가운데 두글자 반환

public class Solution {
	public String solution(String s) {
		String answer = "";
		int wordLength = s.length();
		// 단어 길이가 짝수 일때
		if(wordLength % 2 == 0 ) {
		 // 가운데 글자 두개 반환	
			// abcdef -> cd 
			int evenIndexSecond = wordLength / 2;
			int evenIndexFisrt = evenIndexSecond - 1;
			char tmpAnswer1 = s.charAt(evenIndexSecond);
			char tmpAnswer2 = s.charAt(evenIndexFisrt);
			answer = Character.toString(tmpAnswer2) + Character.toString(tmpAnswer1);
			
			
		 // 단어 길이가 홀수 일떄	
		} else {
		 // 가운데 글자 반환
		// abcde -> c  : 2
	    // abcdefg -> d  : 3
			int oddIndex = wordLength / 2;
			char tmpAnswer = s.charAt(oddIndex);
			answer = Character.toString(tmpAnswer);
		}
		return answer;
	}

	public static void main(String args[]) {
		
		Solution s = new Solution();
		System.out.println(s.solution("asdfd"));
		System.out.println(s.solution("asdfdf"));
		
	}
	
	
}
