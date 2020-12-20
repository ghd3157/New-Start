package second;

import java.util.Scanner;


public class ProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner를 가져오기 위한 부분
		Scanner scanner = new Scanner(System.in);

		//변수 선언 부분
		double result = 0; 
		float pie = 3.14F; 
		String selected = "";
		int num = 0;
		
		System.out.println("어떤 공식을 사용하시겠어요?");
		System.out.println("1. 원의 둘레 계산   2. 피타고라스의 정리 계산   3. 특정 수의 루트 값 계산");
		selected = scanner.next();
		
		
		
		if(selected.equals("1")){
			System.out.print("원의 반지름을 입력하세요 : ");
			float x = scanner.nextInt();
			
			result = x * 2 * pie;
			
			String final_result = "";
			final_result = String.format("%.3f", result);
			System.out.println("원의 둘레는 " +final_result+ "입니다!" );
		}else if(selected.equals("2")){
			int a = 0;
			int b = 0;
			double c = 0;
			System.out.println("직각 삼각형의 두 변의 길이를 입력해주세요");
			System.out.print("a : ");
			a = scanner.nextInt();
			
			System.out.print("b : ");
			b = scanner.nextInt();
			
			c = Math.sqrt(a*a+b*b);
			System.out.println("남은 한 변의 길이는" +c+ "입니다!" );
		}else if(selected.equals("3")){
			System.out.print("제곱근을 구할 수를 입력해 주세요 : ");
			num = scanner.nextInt();
			result = Math.sqrt(num);
			System.out.println(num+"의 제곱근은 "+result+"입니다!");
		}else{
			System.out.print("입력 똑바로해!");
		}

		
	}

}
