package Chapter6;

public class Ex1 {

	public static void main(String[] args) {
		//image1.png, image2.png, image3.png 를 'for'를 이용하여 출력
		for(int i=1;i<4;i++) {
			System.out.println("image"+i+".png");
		}
		
		System.out.println("");
		
		//같은 작업을 'while' 과 'do~while'을 이용!
		int i=1;
		while(i<4) {
			System.out.println("image"+i+".png");
			i++;
		}
		
		System.out.println("");
		
		i=1;
		do {
			System.out.println("image"+i+".png");
			i++;
		}while(i<4);
				

	}

}
