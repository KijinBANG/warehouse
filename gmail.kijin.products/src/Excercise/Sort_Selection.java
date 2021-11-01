package Excercise;

public class Sort_Selection {

	public static void main(String[] args) {
		//5개의 데이터를 입력받아 출력하고 선택정렬 알고리즘을 이용하여 오름차순으로 출력!
		java.util.Scanner val = new java.util.Scanner(System.in);
			//배열을 생성하여 그 값을 키보드로부터 입력받자!	
			System.out.println("5개의 정수값을 차례로 입력해주세요.");
			int [] data = new int[5];
			for(int i=0; i<5; i=i+1) {
				System.out.print((i+1)+"번째 값은?: ");
				data[i] = val.nextInt();
			}
			
			//입력받은 배열의 값의 출력
			System.out.println("\n입력하신 값들은 다음과 같습니다.");
			System.out.print("[  ");
			for(int temp : data) {
				System.out.print(temp + "  ");
			}
			System.out.println("]");
			
			//선택정렬의 알고리즘을 이용하여 오름차순으로 정렬
			int d_void = 0;
			for(int i=0; i<5-1; i=i+1) {
				for(int j=i; j<5-1;j=j+1) {
					if(data[i]>data[j+1]) {
						d_void = data[i];
						data[i] = data[j+1];
						data[j+1] = d_void;
					}
				}
			}
			
			//오름차순으로 정렬된 배열의 값의 출력
			System.out.println("\n입력하신 값들을 오름차순으로 정렬하면 다음과 같습니다.");
			System.out.print("[  ");
			for(int temp : data) {
				System.out.print(temp + "  ");
			}
			System.out.println("]");
			
			//선택정렬의 알고리즘을 이용하여 내림차순으로 정렬
			for(int i=0; i<5-1; i=i+1) {
				for(int j=i; j<5-1;j=j+1) {
					if(data[i]<data[j+1]) {
						d_void = data[i];
						data[i] = data[j+1];
						data[j+1] = d_void;
					}
				}
			}
			
			//내림차순으로 정렬된 배열의 값의 출력
			System.out.println("\n입력하신 값들을 내림차순으로 정렬하면 다음과 같습니다.");
			System.out.print("[  ");
			for(int temp : data) {
				System.out.print(temp + "  ");
			}
			System.out.println("]");
			
		val.close();

	}

}
