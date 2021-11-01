package Excercise;

public class Logical {

	public static void main(String[] args) {
		System.out.println(10>3);

		int year = 2020;
		//year 가 윤년인지 판별
		//year 가 4의 배수이고 100의 배수가 아니면 윤년
		//또는 400의 배수인 경우
		boolean a = (year%4) == 0;
		boolean b = (year%100) != 0;
		boolean c = (year%400) == 0;
		System.out.println("올해는 " + year + "년 입니다.");
		System.out.print("올해는 윤년인가요? ");
		
		if ((a && b)||c == true) {
			System.out.println("올해는 윤년입니다.");
		}else {
		    System.out.println("올해는 윤년이 아닙니다.");
		}
		
		//1~100까지의 자연수 중 3의 배수이거나 4의 배수인 데이터의 개수를 확인
		int cnt = 0;
		for(int i=1; i<=100; i++) {
			if(i%4==0 && i%3==0) {
				cnt++;
			}
		}
		System.out.println("100이하의 자연수 중 3의 배수이면서 4의 배수인 수의 개수는 " + cnt + "입니다.");
		
		//다음의 결과값을 예측할 수 있는지?
		int x=10;
		boolean r = x > 5 && x++ > 10;
		System.out.println(x);
		
		x=10;
		r = x < 5 && x++ > 10;
		System.out.println(x);
	}

}
