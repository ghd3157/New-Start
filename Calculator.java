package second;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String z = scanner.nextLine(); //연산자
		float x = scanner.nextInt(); //첫번째 숫자
		float y = scanner.nextInt(); //두번째 숫자

		float result = 0;
		String plus = "+";
		String minus = "-";
		String devide = "/";
		String multiply = "*";
		
		if(z.equals("+")){
			result = x+y;
		}
		else if(z.equals("-")){
			result = x-y;
		}
		else if(z.equals("*")){
			result = x*y;
		}
		else if(z.equals("/")){
			result = x/y;
		}
		
		System.out.println("Result = "+result);
		
		
		
	}

}
