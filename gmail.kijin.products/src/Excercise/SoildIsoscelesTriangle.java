package Excercise;

public class SoildIsoscelesTriangle {
	
	public static void main(String[] args) {
		for(int i=0;i<5;i=i+1) {
			for(int j=0;;j=j+1) {
				if(j >= 4-i && j <= 4+i) {
					System.out.print("*");
				}else if(j==9) {
					System.out.println("");
					break;
				}else {
					System.out.print(" ");
				}
				
			}

		}
	}

}
