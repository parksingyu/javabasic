package b_operator;

public class ArithmethicOperator {

	public static void main(String[] args) {
		/*
		 *  << 산술 연산자>>
		 *  - + : 더하기
		 *  - - : 빼기
		 *  - * : 곱하기
		 *  - / : 나누기
		 *  - % : 나머지
		 *  - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2 ;
		// 수학과 같이 *, /, % 연산자가 +, - 보다 연산의 우선순위가 높다.
		// 우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		
		System.out.println(a);
		
		a = (int) (10 + 20.3); // int + double -> double + double
		// 피연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형변환 후 연산이 수행된다.
		// 따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		System.out.println(a);
		
		byte b = 10;
		short c = 20;
		
		short d = (short) (c-b);
		// int보다 작은 정수타입은 int로 형변환 후 연산이 수행된다.
		// 이런 이유 때문에 웬만한 작은 수라도 int를 사용한다.
		
		long e1 = 100000 * 100000; // int와 int 의 연산 결과는 int이다.
		System.out.println(e1); //오버플로우 발생
		long e2 = 100000 * 100000L; 
		// 피연산자중 하나는 long이어야 결과로 long을 얻을 수 있다.
		System.out.println(e2);
		
		float f1 = 10 / 4; 
		System.out.println(f1); // 2.0
		// 의도한 값은 2.5가 되겠지만 10 / 4 모두 int 타입이기 때문에 소수점을 표현 불가능하다
		// 그렇기 때문에 둘 중 한개는 float이어야 결과로 float을 얻을 수 있다.
		
		float f2 = 10 / 4f; 
		System.out.println(f2); // 2.5
		
		int f3 = 10 % 4;
		System.out.println(f3); // 2
		
		// 정수는 0으로 나눌 수 없다.
//		int g1 = 10 / 0; //런타임 에러 발생
		float g2 = 10.0f /0;
		System.out.println(g2); // Infinity : 무한대
		// 실수는 0으로 나눌 수 있다.
		float g3 = 0 / 0f;
		System.out.println(g3); // NaN : Not a Number
		
		char h1 = 'A';
		char h2 = (char) (h1 + 1);
		System.out.println(h2);
		
		int h3 = 'D' - 'A'; // 68 - 65
		System.out.println(h3); //3
		
		int h4 = '5' - '0'; // 53 - 48 
		System.out.println(h4); // 5
		
		int i = 0;
		
		i = i + 1;
		i += 1;
		i += 2; // 복합연산자
		
		// 더하는 값이 1인 경우에는 더 줄일 수 있다.
		++i; // 전위형 : 변수가 참조되기 전 수행 
		i++; // 후위형 : 변수가 참조된 후 수행
		System.out.println(i);
		
		i = 0;
		System.out.println("++i = " + ++i);
		
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println("i = "+i);
		
		i = 0;
		i = i - 1;
		i -= 1;
		--i;
		i--;
		
		i = i * 2;
		i *= 2;
		
		i = i / 3;
		i /= 3;
		
		i = 1 % 4;
		i %= 4;
		
		//반올림
		//반올림을 하기 위해 0.5를 더하고 소수점을 없애기 위해 int로 형변환 한다.
		double round_ = 50.6;
		System.out.println((int)(round_ + 0.5));
		System.out.println(Math.round(round_)); // 소수점 첫째자리에서 반올림 가능.
		System.out.println("-----------");
		//소수점 두째자리에서 반올림 해주세요.
		
		double round = 50.55;
		System.out.println((int)(round *10 +0.5) / 10.0);
		
		System.out.println("--------------------------");
		
		//문제1. 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456+654321
		
		int ac = 123456 + 654321;
		System.out.println(ac); // 777777
		
		//2. 1번의 결과값 * 123456
		long ad;
		ad = ac * 123456L;
		System.out.println(ad); //96021237312
		
		//3. 2번의 결과값 / 123456
		long ae;
		ae = (long)ad / 123456;
		System.out.println(ae); // 777777
		
		//4. 3번의 결과값 - 654321
		long af;
		af = (long)ae - 654321;
		System.out.println(af); // 123456
		
		//5. 4번의 결과값 % 123456
		long ah;
		ah = (long)af % 123456;
		System.out.println(ah); // 0
		
		//정답:
		/*long result = 123456 + 654321;
		result = result * 123456;
		result /= 123456;
		result -= 654321;
		result %= 123456;
		System.out.println(result);
		*/
		
		//문제2. 3개의 int형 변수를 선언 및 초기화 후
		//합계와 평균을 구해주세요. (평균은 소수점 두째자리에서 반올림)
		int n1 = 17;
		int n2 = 21;
		int n3 = 23;
		double n4 = n1 + n2 + n3;
		System.out.println("합계 : " + (int)n4);
		
		//System.out.println( n4 / 3 );
		System.out.print("평균 : ");
		System.out.println((int)(( n4 / 3 ) * 10 +0.5) / 10.0);
		
		
		
		
		
		
		
//		double round = 50.56;
//		round = round * 10;
//		System.out.println(round);
//		System.out.println((int)(round+0.05));
//		
//		round = round / 10.0;
//		System.out.println(round);
//		
//		//System.out.println((int)(round + 0.5) / 10);
//		
		

	}
}