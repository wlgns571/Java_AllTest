package java_day11;

public class JavaTest3 {
	/*
	 * 주어진 문자열을 이용하여, 명함을 만들어보세요. 꼭 제 이름이 아니여도 좋습니다.
	split 사용
	String info = "정찬웅, 010-7398-7332, akow283@gmail.com";
*/
	public static void main(String[] args) {
		String info = "정찬웅, 010-7398-7332, akow283@gmail.com";
		
		String[] infoArr = info.split(",");
		System.out.println("==============================");
		System.out.println("이름     :  " + infoArr[0]);
		System.out.println("연락처   : " + infoArr[1]);
		System.out.println("이메일   : " + infoArr[2]);
		System.out.println("==============================");
	}
}
