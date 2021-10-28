package Chapter6;

public class RockPaperScissors {
	
	public static void main(String[] args) {
//		//3초마다 10번하기
//		for(int i=0;i<10;i++) {
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {}
//			if(i%2==0) {
//				System.out.println("on");
//			}else {
//				System.out.println("off");
//			}
//		}
//		
		//2가지 생태 번갈아 가면서 10번 수행하기
		boolean flag = true;
		for(int i=0;i<10;i=i+1) {
			if(flag == true) {
				System.out.println("깃발올려");
			}else {
				System.out.println("깃발내려");
			}
			flag = !flag;
		}
	}

}
