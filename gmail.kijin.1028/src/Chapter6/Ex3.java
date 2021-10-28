package Chapter6;

public class Ex3 {

	public static void main(String[] args) {
		//1-12단 까지의 구구단 작성
		System.out.println("<구구단>");
		for(int i = 1; i < 13; i =i + 1) {
			System.out.println("\n["+i+"]단 입니다.");
			for(int j=1; j<13; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}

	}

}
