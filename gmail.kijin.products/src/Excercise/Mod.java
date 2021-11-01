package Excercise;

public class Mod {

	public static void main(String[] args) {
		int i = 0;
		//4가지 동작을 0.5초마다 번갈아 가면서 수행
		while(true) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
			//4으로 나눈 나머지 : 0, 1, 2, 3
			int mod = i % 4;
			if(mod == 0)	{System.out.println("Cyan");}	
			if(mod == 1)	{System.out.println("Magenta");}	
			if(mod == 2)	{System.out.println("Yellow");}
			if(mod == 3)	{System.out.println("Key");}	
			i++;
		}
	}
}			