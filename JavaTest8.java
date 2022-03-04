package java_day11;

public class JavaTest8 {
/*
 *	다음 문자열을 중복된 숫자와 함께 출력하시오
	aaabbcdddaeefffffgg -> a3b2c1d3a1e2f5g2
	String example = "aaabbcdddaeefffffgg";
 */
	public static void main(String[] args) {
		String example = "aaabbcdddaeefffffgg";
		String anw = "";
		
		int cnt = 1;
		for ( int i  = 0; i < example.length() - 1; i++ ) {
			if ( example.charAt(i) == example.charAt(i + 1) ) {
				cnt++;
			} else {
				anw += example.charAt(i) + (cnt + "");
				cnt = 1;
			}
			
			if ( i == example.length() - 2 ) {
				anw += example.charAt(i) + (cnt + "");
			}
		} 
		System.out.println(anw);
	}
}

