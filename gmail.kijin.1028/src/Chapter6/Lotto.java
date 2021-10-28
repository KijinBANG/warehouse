package Chapter6;

public class Lotto {
	
	public static void main(String[] args) {
		System.out.println("<로또번호 생성기>");
		int num = 0;
		int number = 0;	
		for(int i=1;i<7;i++) {
			if(i!=6) {
				num = (int)(Math.random()*45);
				number = num + 1;						
				System.out.println(number);
			}else {
				num = (int)(Math.random()*45);
				number = num + 1;
				System.out.println("보너스 번호: " + number);
			}
		}
		//중복되는 숫자가 나오는 경우를 어떻게 배제할 것인가?
	}
}
