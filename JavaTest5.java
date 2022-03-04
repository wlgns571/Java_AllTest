package java_day11;

import java.util.Scanner;

public class JavaTest5 {
/*
 *  1~50 사이의 랜덤한 수를 5번 안에 맞춰야하는 업다운 게임을 만들어보세요.
	Run 실행 시 1~50 사이의 랜덤한 수가 생성되며, 사용자가 입력한 숫자에 대해 업, 다운을
	알려준다.
	5번의 기회 동안 사용자가 정답을 맞추지 못한다면 "실패하였습니다" 문구 출력 후
	프로그램이 종료, 사용자가 정답을 맞춘다면 "정답입니다" 문구 출력 후 프로그램이
	종료된다.
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean iNum = false;
		int rNum = (int) (Math.random() * 50 + 1);
		
		while ( true ) {
			for ( int i = 5; i >= 0; i--) {
				System.out.printf("숫자를 입력해주세요 : ");
				int Num = sc.nextInt();
				if ( rNum > Num ) {
					System.out.println("업!! " + "기회가 " + i + "번 남았습니다.");
					
				} else if ( rNum < Num ) {
					System.out.println("다운!! " + "기회가 " + i + "번 남았습니다.");
					
				} else if ( rNum == Num ) {
					System.out.println("정답입니다.");
					iNum = true;
					break;
				} 
			}
			if ( iNum == false ) {
					System.out.println("실패하였습니다. 정답은 " + rNum + "입니다.");
					break;
			}
		}
		sc.close();
	}
}