package Game;

public class HelloSolarSystem {

	public static void main(String[] args) {
		//게임의 시작을 알리는 글귀
		System.out.println("이 게임을 하면 태양계를 더 많이 알 수 있을 거에요~^^*");
		System.out.println("When you play this game you will know better about \'THE SOLAR SYSTEM\'!\n");
		
		//점수를 저정할 변수를 생성
		int score = 0;
		
		//인스턴스 생성
		java.util.Scanner val = new java.util.Scanner(System.in);
		java.util.Random ran = new java.util.Random();
		
		//태양계 행성 정보를 담을 Array 생성
		String [][] solar_s = {
				{"태양", "수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성"},
				{"sun", "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}};
		
//		//지울것!
//		for(int i=0; i<2; i=i+1) {
//			for(int j=0; j<solar_s[i].length; j=j+1) {
//				System.out.println(solar_s[i][j]);
//			}
//		}
//		System.out.println("태양" == solar_s[0][0]);
//		System.out.println("sun" == solar_s[1][0]);
//		String han = val.nextLine();
//		System.out.println(han);
//		System.out.println(han.equals(solar_s[0][0]));

		
		//첫번째 게임:숫자가 주어지면 해당하는 행성의 이름을 한글과 영어로 각각 입력!
		System.out.println("첫번째 게임: 숫자에 해당하는 행성의 이름은?");
		System.out.println("First GAME: What's the name of the planet that corresponds to the number?\n");
		System.out.println("\n\t\t\t== 게임하는 방법 ==");
		System.out.println("\t 1) 렌덤으로 주어지는 숫자에 해당하는 행성의 이름을 떠올립니다.");
		System.out.println("\t 2) 질문이 한글과 영어로 각각 한번씩 총 두면 주어집니다.");
		System.out.println("\t 3) 질문이 한글이면 한글로, 영어면 영문으로 각각 입력하세요.");
		System.out.println("\t 4) 모두 틀리면 0점, 하나만 정답이면 2점, 그리고 모두 정답이면 5점을 얻습니다.");
		System.out.println("\t 5) 총 4세트, 최대 20점까지 득점가능하니 도전해봅시다.");
		
		System.out.println("\n\t\t\t== How to play ==");
		System.out.println("\t 1) Think of the name of the planet that corresponds to the name given randomly.");
		System.out.println("\t 2) You will be asked a total of 2 questions each in Korean and English.");
		System.out.println("\t 3) If the question is Korean, type it in Korean, and the same in case of English.");
		System.out.println("\t 4) If you're all wrong, you get 0 point. If you're collect only one question, you get 2 points. If you're all correct, you get 5 points.");
		System.out.println("\t 5) You can score up to 20 points in 4 sets. Let's try.");
		for(int i=0 ; i<4; i=i+1) {
			System.out.println("\n[Q#1-"+(i+1)+"]");
			int x = ran.nextInt(8);
			System.out.print("태양에서 "+(x+1)+"번째 위치하는 행성의 이름은? := ");
			String han = val.nextLine();
			System.out.print("What is the name of the planet that corresponds to the number " + (x+1) +"? := ");
			String eng = val.nextLine();
			
//			//지울것
//			System.out.println(solar_s[0][x+1] + han);
//			System.out.println(solar_s[1][x+1] + eng);
			
			if(han.equals(solar_s[0][x+1]) && eng.equals(solar_s[1][x+1])) {
				System.out.println("굉장해요! 모두 정답입니다. 5점을 얻었습니다.");
				System.out.println("E");
				score = score + 5;
			}else if(han.equals(solar_s[0][x+1]) && !(eng.equals(solar_s[1][x+1]))) {
				System.out.println("아까워요! 한글이름은 맞았지만, 영어이름이 틀렸네요. 2점을 얻었습니다.");
				System.out.println("E");
				score = score +2;
			}else if(!(han.equals(solar_s[0][x+1])) && eng.equals(solar_s[1][x+1])) {
				System.out.println("아까워요! 영어이름은 맞았지만, 한글이름이 틀렸네요. 2점을 얻었습니다.");
				System.out.println("E");
				score = score +2;
			}else {
				System.out.println("모두 틀렸습니다. 좀 더 집중하세요.^^*");
				System.out.println("It's all wrong. Please focus a bit more.^^*");
			}
		}
		System.out.println("\n첫번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
		
		//두번째 게임:바꿔!
		System.out.println("\n두번째 게임: 바꾸자! 바꿔!!");
		System.out.println("Second GAME: Let's tranlate!");
		System.out.println("\n\t\t\t== 게임하는 방법 ==");
		System.out.println("\t 1) 렌덤으로 주어진 행성의 이름을 확인한다.");
		System.out.println("\t 2) 한글로 주어졌다면 영어로, 영어로 주어졌다면 한글로 바꾸어 입력하세요.");
		System.out.println("\t 3) 질문이 한글이면 한글로, 영어면 영문으로 각각 입력하세요.");
		System.out.println("\t 4) 총 5세트, 최대 20정 득점할 수 있습니다.");
				
		System.out.println("\n\t\t\t== How to play ==");
		System.out.println("\t 1) E");
		System.out.println("\t 2) E");
		System.out.println("\t 3) E");
		System.out.println("\t 4) E"); 
		int num_c=0;
		for(int i=0; i<5; i=i+1) {
			int x = ran.nextInt(2);
			int y = ran.nextInt(9);
			System.out.print("\n[Q#2-"+(i+1)+"] \'"+solar_s[x][y]+"\' := ");
			String name = val.nextLine();
			int z;
			z = (x+1)%2;
			if(name.equals(solar_s[z][y])) {
				System.out.println("정답! 계속 이렇게만 하세요.");
				num_c = num_c + 1;
			}else {
				System.out.println("아닌데... 좀 더 집중하세요!");
			}	
		}
		System.out.println("");
		switch(num_c) {
		case 0:
			System.out.println("빵점!");
			System.out.println("\n두번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 1:
			System.out.println("하나만 정답! 1점을 얻었습니다.");
			score = score + 1;
			System.out.println("\n두번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 2:
			System.out.println("총 두 문제 맞추었습니다! 3점을 얻었습니다.");
			score = score + 3;
			System.out.println("\n두번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 3:
			System.out.println("총 세 문제 맞추었습니다! 6점을 얻었습니다.");
			score = score + 6;
			System.out.println("\n두번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 4:
			System.out.println("총 두 문제 맞추었습니다! 10점을 얻었습니다.");
			score = score + 10;
			System.out.println("\n두번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		default:
			System.out.println("엄청나군요! 모두 맞추었습니다! 20점을 얻었습니다.");
			score = score + 20;
			System.out.println("\n두번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		}
		
		//세번째 게임:더해!
		System.out.println("\n세번째 게임: 더하자! 더해!!");
		System.out.println("Third GAME: Let's add!");
		System.out.println("\n\t\t\t== 게임하는 방법 ==");
		System.out.println("\t 1) 렌덤으로 주어진 4개의 행성의 이름을 확인한다.");
		System.out.println("\t 2) 앞의 두행성과 뒤의 두행성을 각각 두자리수의 정수로 바꾸어 더한다.");
		System.out.println("\t 3) 예를 들어, \'태양, mercury\' + \'venus, 지구\'가 주어졌다면, 01+23 이 되어 답은 24가 된다.");
		System.out.println("\t 4) 총 5세트, 최대 20점 득점할 수 있습니다.");
				
		System.out.println("\n\t\t\t== How to play ==");
		System.out.println("\t 1) E");
		System.out.println("\t 2) E");
		System.out.println("\t 3) E");
		System.out.println("\t 4) E");
		
		num_c=0;
		for(int i=0; i<5; i=i+1) {
			int x1 = ran.nextInt(2);
			int y1 = ran.nextInt(9);
			int x2 = ran.nextInt(2);
			int y2 = ran.nextInt(9);
			int x3 = ran.nextInt(2);
			int y3 = ran.nextInt(9);
			int x4 = ran.nextInt(2);
			int y4 = ran.nextInt(9);
			System.out.print("\n[Q#3-"+(i+1)+"] \'"
					+solar_s[x1][y1]+", "
					+solar_s[x2][y2]+"\' + \'"
					+solar_s[x3][y3]+", "
					+solar_s[x4][y4]+"\' := ");
			int val_add = val.nextInt();
			int result_add = (y1 * 10 + y2) + (y3 * 10 + y4);
			if(val_add == result_add) {
				System.out.println("정답! 계속 이렇게만 하세요.");
				num_c = num_c + 1;
			}else {
				System.out.println("아닌데... 좀 더 집중하세요!");
			}
		}
		System.out.println("");
		switch(num_c) {
		case 0:
			System.out.println("빵점!");
			System.out.println("\n세번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 1:
			System.out.println("하나만 정답! 1점을 얻었습니다.");
			score = score + 1;
			System.out.println("\n세번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 2:
			System.out.println("총 두 문제 맞추었습니다! 3점을 얻었습니다.");
			score = score + 3;
			System.out.println("\n세번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 3:
			System.out.println("총 세 문제 맞추었습니다! 6점을 얻었습니다.");
			score = score + 6;
			System.out.println("\n세번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 4:
			System.out.println("총 네 문제 맞추었습니다! 10점을 얻었습니다.");
			score = score + 10;
			System.out.println("\n세번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		default:
			System.out.println("엄청나군요! 모두 맞추었습니다! 20점을 얻었습니다.");
			score = score + 20;
			System.out.println("\n세번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		}
		
		//네번째 게임:빼!
		System.out.println("\n네번째 게임: 빼자! 빼!!");
		System.out.println("Third GAME: Let's subtract!");
		System.out.println("\n\t\t\t== 게임하는 방법 ==");
		System.out.println("\t 1) 렌덤으로 주어진 4개의 행성의 이름을 확인한다.");
		System.out.println("\t 2) 앞의 두행성과 뒤의 두행성을 각각 두자리수의 정수로 바꾸어 뺀다.");
		System.out.println("\t 3) 예를 들어, \'태양, mercury\' + \'venus, 지구\'가 주어졌다면, 01-23 이 되어 답은 -22가 된다.");
		System.out.println("\t 4) 총 5세트, 최대 20정 득점할 수 있습니다.");
				
		System.out.println("\n\t\t\t== How to play ==");
		System.out.println("\t 1) E");
		System.out.println("\t 2) E");
		System.out.println("\t 3) E");
		System.out.println("\t 4) E");
		
		num_c=0;
		for(int i=0; i<5; i=i+1) {
			int x1 = ran.nextInt(2);
			int y1 = ran.nextInt(9);
			int x2 = ran.nextInt(2);
			int y2 = ran.nextInt(9);
			int x3 = ran.nextInt(2);
			int y3 = ran.nextInt(9);
			int x4 = ran.nextInt(2);
			int y4 = ran.nextInt(9);
			System.out.print("\n[Q#4-"+(i+1)+"] \'"
					+solar_s[x1][y1]+", "
					+solar_s[x2][y2]+"\' - \'"
					+solar_s[x3][y3]+", "
					+solar_s[x4][y4]+"\' := ");
			int val_sub = val.nextInt();
			int result_sub = (y1 * 10 + y2) - (y3 * 10 + y4);
			if(val_sub == result_sub) {
				System.out.println("정답! 계속 이렇게만 하세요.");
				num_c = num_c + 1;
			}else {
				System.out.println("아닌데... 좀 더 집중하세요!");
			}	
		}
		System.out.println("");
		switch(num_c) {
		case 0:
			System.out.println("빵점!");
			System.out.println("\n네번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 1:
			System.out.println("하나만 정답! 1점을 얻었습니다.");
			score = score + 1;
			System.out.println("\n네번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 2:
			System.out.println("총 두 문제 맞추었습니다! 3점을 얻었습니다.");
			score = score + 3;
			System.out.println("\n네번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 3:
			System.out.println("총 세 문제 맞추었습니다! 6점을 얻었습니다.");
			score = score + 6;
			System.out.println("\n네번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		case 4:
			System.out.println("총 네 문제 맞추었습니다! 10점을 얻었습니다.");
			score = score + 10;
			System.out.println("\n네번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		default:
			System.out.println("엄청나군요! 모두 맞추었습니다! 20점을 얻었습니다.");
			score = score + 20;
			System.out.println("\n네번째 게임이 끝났습니다. 총 " + score + "점을 얻었습니다.");
			break;
		}
		
		//다섯번째 게임:곱해!
		System.out.println("\n마지막 게임: 곱하자! 곱해!!");
		System.out.println("The last GAME: Let's multiply!");
		System.out.println("\n\t\t\t== 게임하는 방법 ==");
		System.out.println("\t 1) 렌덤으로 주어진 3개의 행성의 이름을 확인한다.");
		System.out.println("\t 2) 앞의 두행성과 마지막 하나의 행성을 각각 두자리수와 한자리의 정수로 바꾸어 곱한다.");
		System.out.println("\t 3) 예를 들어, \'태양, mercury\' × \'venus\'가 주어졌다면, 01×2 이 되어 답은 2가 된다.");
		System.out.println("\t 4) 총 5세트, 최대 20정 득점할 수 있습니다.");
				
		System.out.println("\n\t\t\t== How to play ==");
		System.out.println("\t 1) E");
		System.out.println("\t 2) E");
		System.out.println("\t 3) E");
		System.out.println("\t 4) E");
		
		num_c=0;
		for(int i=0; i<5; i=i+1) {
			int x1 = ran.nextInt(2);
			int y1 = ran.nextInt(9);
			int x2 = ran.nextInt(2);
			int y2 = ran.nextInt(9);
			int x3 = ran.nextInt(2);
			int y3 = ran.nextInt(8);
			System.out.print("\n[Q#5-"+(i+1)+"] \'"
					+solar_s[x1][y1]+", "
					+solar_s[x2][y2]+"\' × \'"
					+solar_s[x3][y3+1]+"\' := ");
			int val_mul = val.nextInt();
			int result_mul = (y1 * 10 + y2) * (y3 + 1);
			if(val_mul == result_mul) {
				System.out.println("정답! 계속 이렇게만 하세요.");
				num_c = num_c + 1;
			}else {
				System.out.println("아닌데... 좀 더 집중하세요!");
			}	
		}
		System.out.println("");
		switch(num_c) {
		case 0:
			System.out.println("빵점!");
			System.out.println("\n게임이 모두 끝났습니다. 100점 만점에 총 " + score + "점을 얻었습니다.");
			break;
		case 1:
			System.out.println("하나만 정답! 1점을 얻었습니다.");
			score = score + 1;
			System.out.println("\n게임이 모두 끝났습니다. 100점 만점에 총 " + score + "점을 얻었습니다.");
			break;
		case 2:
			System.out.println("총 두 문제 맞추었습니다! 3점을 얻었습니다.");
			score = score + 3;
			System.out.println("\n게임이 모두 끝났습니다. 100점 만점에 총 " + score + "점을 얻었습니다.");
			break;
		case 3:
			System.out.println("총 세 문제 맞추었습니다! 6점을 얻었습니다.");
			score = score + 6;
			System.out.println("\n게임이 모두 끝났습니다. 100점 만점에 총 " + score + "점을 얻었습니다.");
			break;
		case 4:
			System.out.println("총 네 문제 맞추었습니다! 10점을 얻었습니다.");
			score = score + 10;
			System.out.println("\n게임이 모두 끝났습니다. 100점 만점에 총 " + score + "점을 얻었습니다.");
			break;
		default:
			System.out.println("엄청나군요! 모두 맞추었습니다! 20점을 얻었습니다.");
			score = score + 20;
			System.out.println("\n게임이 모두 끝났습니다. 100점 만점에 총 " + score + "점을 얻었습니다.");
			break;
		}
		
	}

}