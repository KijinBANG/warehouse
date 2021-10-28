package Chapter6;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*
		su가 소수인지 확인하기
		소수란?2부터 자신의 절반이 되는 수자까지 나누어서 한번도 나누어 떨어지지 않는 수
		 */
		System.out.println("MACHINE of \'Prime Numer\' or not?");
		System.out.println("Input arbitrary natural number.");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		
		if(number == 0) {
			System.out.println("This is not a natural Number.");
		}else if(number == 1) {
			System.out.println("This is not a Prime Number.");
		}else if (number == 2) {
			System.out.println("Yes!" + number + " is one of the Prime Numbers.");
		}else {
			int i=2;
			while(i<(number/2)+1) {
				if((number%i) == 0) {
					System.out.println("This is not a Prime Number.");
					break;
				}else {
					i++;
					continue;
				}
			}
//			System.out.println(i);
			if(i == (number/2)+1) {
				System.out.println("Yes!" + number + " is one of the Prime Numbers.");
			}else {				
			}
			
		}
		
		//소수가 아닌경우
		//강제로 종료시키기 전 까지 계속 입력할 수 있도록 수정해보자!

	}

}
