package Unfinished;

public class TowerOfHanoi {

	public static void main(String[] args) {
		java.util.Scanner val = new java.util.Scanner(System.in);
			System.out.print("하노이의 탑에 있는 원판의 개수를 입력해주세요: ");
			long num = val.nextLong();
		val.close();
			
			long hanoi = 1;
			if(num == 1) {
				System.out.println("원판이 1개인 하노이의 탑의 모든 원판을 다른 기둥으로 규칙에 맞게 옮기기 위해서는 원판을 1번 옮겨야 합니다.");
			}else {
				for(int i=2; i<=num; i=i+1 ) {
					hanoi = hanoi*2 + 1;
				}
				System.out.println("원판이 " + num + "개인 하노이의 탑의 모든 원판을,");
				System.out.println("다른 기둥으로 규칙에 맞게 옮기기 위해서는, 원판을 " + hanoi + "번 옮겨야 합니다.");
				
				//1초에 한번씩 옮기면 얼마나 걸리는 출력해보자!
			}
			

	}

}
