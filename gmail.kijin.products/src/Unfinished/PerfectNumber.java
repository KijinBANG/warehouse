package Unfinished;

public class PerfectNumber {
	
	public static void main(String[] args) {
		//2부터 1000 까지 완전수의 개수 - 3개가 나와야 한다.
		System.out.println("오늘은 \'완전수\'에 대해서 알아보고자 합니다.");
		System.out.println("Today, we are going to study about the Perfect Number.");
		System.out.println("\'완전수\'란, 자신을 제외한 모든 약수들의 합이 자신과 같아지는 자연수를 말합니다.");
		System.out.println("\n무한히 완전수를 구하는 Algorithm을 구현해봅시다. 실행하고 자려하는데, 일어났을때, 몇번째 원전수까지 구해져 있을런지 궁금하네요.");
		
		//자연수 i 가 2에서부터 1000까지 변할 때, 그 값의 약수의 합을 구하자!
		int k=1;
		for(long i=2;; i=i+1) {
			int divisor_sum = 1;
			for(long j=2; j<(i/2+1); j=j+1) {
				if(i%j == 0) {
					divisor_sum += j;
				}
			}
			if(divisor_sum == i) {
				System.out.println(k+"번째 완전수는 "+i+"입니다.");
				k=k+1;
			}
		}
		
	}

}
