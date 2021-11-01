package Excercise;

public class Lotto_given {

	public static void main(String[] args) {
		//1 ~ 45 까지 6개의 숫자를 중복없이 저장하고 작은 것 부터 큰 것 순으로 출력
				//6개의 숫자는 키보드로부터 입력받기
				
				//데이터: 1 ~ 45 사이의 숫자 6개, 아직 숫자의 값은 결정되지 않음.
				//1. 1 ~ 45 까지의 숫자 6개를 저장할 수 있는 공간을 생성
				int [] lotto = new int[6];
				
				//인스턴스 생성
				java.util.Scanner val = new java.util.Scanner(System.in);
				
					//키보드로 부터 1~45까지의 숫자 6개를 입력받기! 주의! 중복이 되거나 주어진 범위를 벗어나는 경우 경고 메세지를 날리자!! 꼭! 다시 복습!! 순서도도 그려보자!!
					System.out.println("1 ~ 45까지의 정수를 임의로 6개 입력 해 주세요.");
					for(int i=0; i<6; i=i+1) {
						System.out.print((i+1)+"의 값: ");
						lotto[i] = val.nextInt();
						if(lotto[i]<1 || lotto[i]>45) {
							System.out.println("올바른 범위의 숫자를 다시 입력해 주세요.");
							i=i-1;
							continue;
						}
						boolean flag = true;
						for(int j=0; j<i;j=j+1) {
							if(lotto[i] == lotto[j]) {
								System.out.println("중복된 값이 존재합니다. 다른 값을 입력해주세요.");
								flag = false;
								break;
							}
						}
						//이부분!! 잘 생각해보자!!!
						if(flag == false) {
							i=i-1;
							continue;
						}
					}
					
					//selection sort algorithm 을 이용하여 보너스번호(6번째 값)을 제외하고 오름차순으로 정렬
					int d_void = 0;
					for(int i=0; i<4; i=i+1) {
						for(int j=i; j<4; j=j+1) {
							if(lotto[i]>lotto[j+1]) {
								d_void = lotto[i];
								lotto[i] = lotto[j+1];
								lotto[j+1] = d_void;
							}
						}
					}
					
					//최종 결과 출력
					System.out.println("축하합니다! 이번회차 1등 당첨번호는 다음과 같습니다.");
					System.out.print("[  ");
					for(int i=0; i<5; i=i+1) {
						System.out.print(lotto[i] + "  ");
					}
					System.out.println("]");
					System.out.println("보너스번호: " + lotto[5]);
				
				//인스턴스 닫기
				val.close();

	}

}
