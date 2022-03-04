package java_day11;

import java.util.Scanner;

public class JavaTest4 {
	/*
	 * 사용자로부터 현재신장(cm)과 현재체중(kg)을 입력받아 비만도를 표기 해주는 프로그램을
	작성하시오.
	
	표준체중(kg) = (현재신장 - 100) * 0.9
	비만도(%) = (현재체중 / 표준체중) * 100
	
	비만도가	80미만은 저체중
	비만도가	80이상 110미만은 정상체중
	비만도가	110이상 130미만은 과체중
	비만도가	130이상은 비만
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("현재 신장(cm)를 입력해주세요 : ");
		int height = sc.nextInt();
		System.out.printf("현재 체중(kg)를 입력해주세요 : ");
		int weight = sc.nextInt();
		
		double nHeight = (double) (height - 100.0) * 0.9;
		double nWeight = (double) (weight / nHeight) * 100.0;

		if (nWeight >= 130) {
			System.out.println("비만 입니다.");
		} else if (nWeight >= 110) {
			System.out.println("과체중 입니다.");
		} else if (nWeight >= 80) {
			System.out.println("정상체중 입니다.");
		} else if (nWeight < 80) {
		System.out.println("저체중 입니다.");
		}
		sc.close();
	}
}
