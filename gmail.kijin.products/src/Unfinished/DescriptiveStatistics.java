package Unfinished;

public class DescriptiveStatistics {

	public static void main(String[] args) {
		//키보드로 입력받을 수 있는 변수 인스턴스 생성
		java.util.Scanner val = new java.util.Scanner(System.in);
		
		//'1)어떤 데이터'을 '2)몇개' 만들것인가? 데이터 입력받기
		System.out.print("데이터의 종류를 입력해주세요: ");
		String d_name = val.nextLine();
		System.out.print("총 몇개의 데이터를 입력하실지 입력해주세요: ");
		int d_number = val.nextInt();		
		int [] data = new int[d_number];
		
		//input
		int len = data.length;
		for(int i=0; i<len; i=i+1) {
			System.out.print((i+1)+"번째 값을 입력해주세요: ");
			data[i] = val.nextInt();
		}
		
//		//text! let's delete later!! 
//		for(int dd : data) {
//			System.out.println(dd);
//		}
		System.out.println("\n입력하신 "+d_name+"의 기술통계값은 다음과 같습니다.");
		//통계값 생성
			//sum
			double d_sum = 0;
			for(int i=0; i<len; i=i+1) {
				d_sum = d_sum + data[i];
			}
			System.out.println("sum:\t\t" + d_sum);
		
			//mean
			double d_mean = 0;
			if(data.length == 0) {
				System.out.println("데이터가 존재하지 않습니다.");
			}else {
				d_mean = d_sum / data.length;
			}
			System.out.println("mean:\t\t" + d_mean);
		
			//maximum
			double d_max = data[0];
//			//다음과 비교해보자!
//			for(int imsi : data)
//				if(d_max < imsi) {
//					d_max = imsi;
//			}
//			System.out.println("max:\t\t" + d_max);
			int k=0 ;
			for(int i=0; i<len; i=i+1) {
			if(d_max < data[i]) {
				d_max = data[i];
				k = i+1;
			}
		}
		System.out.println("max:\t\t" + d_max + " 이며, " + k + "번째 값입니다.");
		
			//minimum
			double d_min = data[0];
			int l=0;
			for(int i=0; i<len; i=i+1) {
				if(d_min > data[i]) {
					d_min = data[i];
					l = i+1;
				}
			}
			System.out.println("min:\t\t" + d_min + " 이며, " + l + "번째 값입니다.");
			
			//trimmed mean
			double d_t_mean = 0;
			if(data.length < 3) {
				System.out.println("절삭평균값이 존재하지 않습니다.");
			}else {
				d_t_mean = (d_sum - d_max - d_min) / (data.length - 2);
			}
			System.out.println("trimmed mean:\t" + d_t_mean);
		
			//variance
			//뭔가 이상한데? 다시 함 확인해보자!!!
			double d_v = 0;
			if(data.length == 0) {
				System.out.println("분산값이 존재하지 않습니다.");
			}else {
				for(int i=0; i<len; i=i+1) {
					d_v = (data[i]-d_mean)*(data[i]-d_mean);
				}
				d_v = d_v / data.length;
				System.out.println("variance:\t" + d_v);
			}
			
			//90점 이상인 데이터의 개수를 출력해보자.
			int cnt = 0;
			for(int temp : data) {
				if(temp >= 90) {
					cnt = cnt + 1;
				}
			}
			System.out.println("90이상의 데이터 수:\t" + cnt);
				
		
			//derivation?? 루트값 계산은?
		
		
		//생성한 인스턴스 닫기
		val.close();

	}

}
