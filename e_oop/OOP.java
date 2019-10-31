package e_oop;
import java.util.Scanner;
public class OOP {
	public static void main(String[] args) {
		
		/*
		 * << 객체지향 프로그래밍 >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 
		 *   객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이다하.
		 * 
		 * << 객체 생성(인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리(heap영역)에 올려놓은 것.
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환.
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고,
		 *   여러개의 객체가 동시에 존재할 수 있다.
		 */
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(10);
		
		sc.method3();
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		//int returnInt = sc.method4(7, 15);
		sc.method4(7, 15);
		System.out.println(sc.method4(7, 15));
		System.out.println("");
		//sc.test1();
		
		ClassMaker cm = new ClassMaker(); // 이 변수를 통해 메소드에 접근이 가능해진 것.
		cm.a();  
		System.out.println(cm.b()); //파라미터 없고 int타입의 리턴타입이 있음.
		cm.c("이게 c입니다.");
		cm.d(7, 12); // 계산만.
		System.out.println(cm.d(7, 12));
		// 오늘 내용은 클래스와 메소드를 만들고 호출 할 수 있으면 되는것.
		
		//문제1. 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		/* Calculator.java
		Calculator cc = new Calculator();
		System.out.println("덧셈 : "+cc.plus(123456,654321));
		long result = cc.plus(123456, 654321);
		System.out.println("곱셈 : "+cc.multiple(result, 123456));
		result = cc.multiple(result, 123456);
		System.out.println("나눗셈 : "+cc.divide(result,123456));
		result = cc.divide(result, 123456);
		System.out.println("뺄셈 : "+cc.minus(result,654321));
		result = cc.minus(result, 654321);
		System.out.println("나머지 : "+cc.remain(result,123456));
		System.out.println();
		*/
		/* SimLiTest.java
		SimLiTest st = new SimLiTest();
		st.method1();
	 	*/
		
		ClassMaker2 cm2 = new ClassMaker2();
		
	}
}