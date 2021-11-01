package Game;

import java.util.Scanner;

public class RockPaperScissor {
	
	public static void main(String[] args) {
		//가위바위보 게임 만들기!
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("가위=0, 바위=1, 보=2 입니다. 적당한 값을 입력해주세요. 이길때 까지 끝나지 않습니다.");
		
		for(int i=1;;i++) {
			int com = (int)(Math.random()*3);
			
//			System.out.println(com);
//			if(com == 0) {
//				System.out.println("컴퓨터는 가위를 냈습니다.");
//			}else if(com == 1) {
//				System.out.println("컴퓨터는 바위를 냈습니다.");
//			}else {
//				System.out.println("컴퓨터는 보를 냈습니다.");
//			}
			
			Scanner scan = new Scanner(System.in);
			int user = scan.nextInt();
			
			if(user == (com+1) || user == (com-2)) {
				System.out.println("아쉽네요! 졌어요ㅜ,.ㅠ 다시!");
			}else if(user == com) {
				System.out.println("비겼어요! 다시!");
			}else {
				System.out.println("승리! 축해해요~ "+i+"번 만에 이겼어요~ ㅊㅋㅊㅋ");
				break;
			}
		}
	}

}
