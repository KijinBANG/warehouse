package Algorithm;

public class FibonacciSequence {

	public static void main(String[] args) {
		//키보드로 입력받을 수 있는 인스턴스 생성
		java.util.Scanner val = new java.util.Scanner(System.in);
		
		//정수 입력받기
		System.out.print("몇 번째 피보나치 수열의 값을 알고 싶은지 입력해주세요: ");
		int number = val.nextInt();
		
		//입력받의 값의 적정성 검사하는 소스를 추가해보자.
		
		//닫아주지 않으면 리소스를 계속 사용! 안해도 오류는 아니지만, 해 주는 것이 좋다.
		val.close();
		
		//로직 구현
		int a = 1;
		int b = 0;
		int Fibonacci = 0;
		for(int i=1;i<number+1;i=i+1) {
			Fibonacci = a + b;
			a = b;
			b = Fibonacci;	
		}
		System.out.println("피보나치 수열의 "+number+"번째 수는 "+Fibonacci+"입니다.");
	}

}