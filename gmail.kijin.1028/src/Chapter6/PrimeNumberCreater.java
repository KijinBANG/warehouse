package Chapter6;

import java.util.Scanner;

public class PrimeNumberCreater {

	public static void main(String[] args) {
		//입력한 갯수만큼의 소수를 생성하는 프로그램
		System.out.println("몇개의 소수를 만들까요? 가장 작은 소수부터 생성합니다.");
		System.out.println("How many prime number do you want to create? (They are created from the minumun)");

		Scanner num = new Scanner(System.in);
		int number = num.nextInt();

//		System.out.println("입력하신 수는 "+number+"입니다.");
		
		int k=1;
			for(int j=2;;j=j+1) {
			
				boolean flag=true;
				for(int i=2;i<j/2+1;i=i+1) {
					if(j%i==0) {
						flag=false;
						break;
					}
				}
				if(flag==true) {
					System.out.println(k+"번째 소수는 "+j+"입니다.");
					if(k == number) {
						break;
					}else {
						k=k+1;
					}	
				}else {
					
				}
			}
	}
}