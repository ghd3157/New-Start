package second;

public class ByeBye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;//숫자
		int num2 = 2;
		int result = num1 + num2;
		// + - * /
		System.out.println("결과 = "+result+" 정답입니다~");
		
		String a = ""; //문자
		String b = "sample";
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		String c = a+b;
		System.out.println("c = "+c);
		
		String d = "1";
		String e = "2";
		System.out.println("d = " +d);
		System.out.println("e = " +e );
		String f = d+e;
		System.out.println("f = " +f);
		
		System.out.println("d = " +Integer.parseInt(d)); //강제형변환
		System.out.println("e = " +Integer.parseInt(e));
		int result2 = Integer.parseInt(d) + Integer.parseInt(e);
		System.out.println("result =" +result2);
		
	}

}
