package Chapter6;

public class PrimeNumber {

	public static void main(String[] args) {
		//'for'를 사용하여 세 자릿수 이하의 소수를 모두 구하시오.
		for(int i=1, j=1;i<1000;i++) {
			if(i==1) {
			}else if(i%2 == 0) {
				if(i==2) {
					System.out.println(j+" => " + i);
					j++;
				}	
			}else if (i%3 == 0) {
				if(i==3) {
					System.out.println(j+" => " + i);
					j++;
				}
			}else if (i%5 == 0) {
				if(i==5) {
					System.out.println(j+" => " + i);
					j++;
				}
			}else if (i%7 == 0) {
				if(i==7) {
					System.out.println(j+" => " + i);
					j++;
				}
			}else if (i%11 == 0) {
				if(i==11) {
					System.out.println(j+" => " + i);
					j++;
				}
			}else if (i%13 == 0) {
				if(i==13) {
					System.out.println(j+" => " + i);
					j++;
				}
			}else if (i%17 == 0) {
				if(i==17) {
					System.out.println(j+" => " + i);
					j++;
				}
			}else if (i%19 == 0) {
				if(i==19) {
					System.out.println(j+" => " + i);
					j++;
				}
			}else if (i%23 == 0) {
				if(i==23) {
					System.out.println(j+" => " + i);
					j++;
				}
			}else if (i%29 == 0) {
				if(i==29) {
					System.out.println(j+" => " + i);
					j++;
				}
			}else if (i%31 == 0) {
				if(i==31) {
					System.out.println(j+" => " + i);
					j++;
				}	
			}else {
				System.out.println(j+" => "+ i);
				j++;
			}
			
		}
		
	}

}
