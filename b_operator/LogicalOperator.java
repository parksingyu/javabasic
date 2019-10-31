package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * << 논리 연산자 >>
		 * - &&(AND)   : 피연산자 둘다 true이면 true를 결과로 얻는다.
		 * - ||(OR)    : 피연산자 중 하나라도 true이면 true를 결과로 얻는다.
		 * - !(NOT)    : 피연산자가 true이면 false를 false이면 true를 결과로 얻는다.
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		boolean b;
		
		int a = 6;
		// a가 0초과이고 10이하인가?
		b = 0 < a && a <=10;
		// b = true && true;
		// b = true;
		System.out.println(b);
		
		//a가 2의배수이거나 3의 배수인가?
		b = (a % 2 == 0) || (a % 3 == 0);
		System.out.println(b);
		
		//a가 2의 배수이거나 3의 배수이고 10 이하인가?
		b = (a % 2 == 0 || a % 3 == 0) && a <=10;
		System.out.println(b);
		//&&의 우선순위가 높기때문에 우선순위를 바꾸기 위해 괄호를 사용해야 한다.
		
		char c = 'a';
		// c는 숫자인가?
		b = '0' <= c && c <= '9';
		System.out.println(b);
		
		//c는 영문소문자인가?
		//b = 97 <= c && c <= 122; 
		b = 'a' <= c && c <= 'z'; // b = 97 <= c && c <= 122;와 같다.
		System.out.println(b);
		
		//c는 영문자인가?
		b = ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z');
		System.out.println(b);
		
		//논리연산자는 효율적인 연산을 한다.
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		b = true && true;
		b = true && false;
		b = false && true;
		b = false && false;
		
		b = true || true;
		b = true || false;
		b = false || true;
		b = false || false;
		
		int d = 10;
		b = d < 10 && 0 < d++; //d++ 연산이 수행되지 않는다.
		System.out.println(d);
		
		b = !b; //b가 true이면 false를 false이면 true를 저장한다.
		b = !(10<20); //조건식의 결과를 반대로 저장한다.
		
		int x = 1, y = 2;
		b = x + 3 * y > y-2 || x < 3 && y >=5;
		// 산술연산자 > 비교연산자 > 논리연산자 순으로 실행이 된다.
		
		//다음의 문장들을 코드로 작성해주세요.
		//x가 2의 배수이고 10보다 작은가?
		b = (x % 2 ==0) && x < 10;
		
		
		//x가 2의 배수이거나 3의 배수이거나 5의 배수인가?
		b = (x % 2 ==0) || (x % 3 ==0) || (x % 3 ==0);
		
	}
}