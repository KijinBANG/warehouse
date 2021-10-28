package Chapter6;

public class FibonacciSequence {

	public static void main(String[] args) {
		//키보드로 입력받을 수 있는 인스턴스 생성
		java.util.Scanner val = new java.util.Scanner(System.in);
		
//		//문자열 입력받기
//		System.out.print("이름을 입력하세요:");
//		String name = val.nextLine();
//		System.out.println("이름: "+ name);
		
		//정수 입력받기
		System.out.print("몇 번째 피보나치 수열의 값을 알고 싶은지 입력해주세요:");
		int number = val.nextInt();
//		System.out.println(number + "번째 피보나치 수열을 값을 알고싶으시군요?"); //이름.nextLine() 을 왜 한번 더 넣을지 알아보기 위한 문장!
		
//		//숫자 입력을 받고 문자열을 입력받을 때는 nextLine을 추가
//		System.out.println("별명을 입력하세요:");
//		val.nextLine();//이것이 없으면 입력이 되지 않으니 주의!
//		String nick = val.nextLine();
//		System.out.println("별명:"+nick);
		
		//닫아주지 않으면 리소스를 계속 사용! 안해도 오류는 아니지만, 해 주는 것이 좋다.
		val.close();
		
		//로직 구현
		int a = 1;
		int b = 0;
		int c = 1;
		for(int i=1;i<number;i=i+1) {
			a = b;
			b = c;
			c = a + b;
			/*코딩 과정 상 오류를 검토하기 위한 구문
			System.out.println(i);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			*/	
		}
		System.out.println("피보나치 수열의 "+number+"번째 수는 "+c+"입니다.");
	}

}