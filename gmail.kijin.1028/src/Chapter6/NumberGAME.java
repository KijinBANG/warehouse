package Chapter6;

import java.util.Scanner;

public class NumberGAME {	
	
	public static void main(String[] args) {
		System.out.println("<숫자 맞추기 게임>을 시작합니다~^^*");
		System.out.println("3자리 이하의 자연수를 맞추는 게임입니다. 정확한 숫자를 맞추어 보세요~^ㅁ^/");
		int number = (int)(Math.random()*1000);
//		int hint = number%10;
//		System.out.println("힌트! 일의 자리의 값은"+hint+"랍니다^^ 홧팅!");
		
		for(int i=1; ;i++) {
			Scanner scan = new Scanner(System.in);		
			int score = scan.nextInt();
			if(score > number) {
				System.out.println("좀 더 작은 값을 입력하세요~↓");
			}else if(score < number) {
				System.out.println("좀 더 큰 값을 입력하세요~↑");
			}else {
				System.out.println("정답!축하합니다~ " +i+"번 만에 맞추셨어요^^*");
				break;
			}
		}
		
		
	}
}
