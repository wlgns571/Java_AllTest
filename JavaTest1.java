package java_day11;

public class JavaTest1 {
/*
 *  1. 정수(int), 실수(double), 문자열(String) 타입의 변수들을 선언하여 각각 출력하시오.
		(변수명은 자유롭게 사용하시면 됩니다)
	2. 위에서 선언한 변수들의 값을 교체하시오.
	3. 위에서 선언한 정수형 타입의 변수를 실수로 형변환하여 출력하시오.
	4. 위에서 선언한 실수형 타입의 변수를 정수로 형변환하여 출력하시오.
	5. 위에서 선언한 정수형 타입의 변수를 문자열로 형변환하여 출력하시오.
	6. 정수로 이루어진 문자열 타입의 변수를 정수로 형변환하여 출력하시오.
	7. 정수(int), 실수(double), 문자열(String) 타입의 상수들을 선언한 후 콘솔창에 각각
		출력하시오.
 */
	public static void main(String[] args) {
	
	// 변수 선언
	int intNum = 0;
	double douNum = 0.1;
	String strNum = "1";
	
	System.out.println(intNum);
	System.out.println(douNum);
	System.out.println(strNum);
	
	// 변수값 교체
	intNum = 1;
	douNum = 0.2;
	strNum = "2";
	
	// 형변환
	double douNum2 = (double) intNum;
	System.out.println(douNum2);
	
	int intNum2 = (int) douNum;
	System.out.println(intNum2);
	
	int strNum2 = Integer.parseInt(strNum);
	System.out.println(strNum2);
	
	// 상수 선언
	final int fintNum = 0;
	System.out.println(fintNum);
	final double fdouNum = 0.1;
	System.out.println(fdouNum);
	final String fstrNum = "1";
	System.out.println(fstrNum);
	
	}
}
