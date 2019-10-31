package z_exam;

public class Exam02 {

	public static void main(String[] args) {
		
//		[연습문제]
//		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
//		종류\크기 1byte        2byte         4byte        8byte
//		논리형    boolean
//		문자형                     char
//		정수형    byte         short         int          long
//		실수형                                      float        double
		
//		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
//		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
//		초기화 하는 한 줄의 코드를 적으시오.
//		  -> int regNo = 920319;
		
		
//		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
//		int i = 100;
//		long l =100L;
//		final float PI = 3.14f;
//		
//		- 리터럴 : 100, 3.14f, 100L
//		- 변수 : i, l
//		- 키워드 : int, long, final, float
//		- 상수 : PI
		// 뜻 
		// 리터럴 -> 원래 27, 12.5, 'B'와 같은 값들을 상수라고 하는데, 프로그래밍에서는 상수를 값을 한 번 정하면 변경할 수 없는
		//         저장공간으로 정의하였기 때문에 이와 구분하기 위해 상수 대신 리터럴이라는 용어를 사용한다.
		// 변수 ->
		// 키워드 -> 자바에서 미리 잡혀있는 예약어
		// 상수 -> 한번 값을 저장하면 다른 값으로 변경할 수 없는 공간. 
		
//		[2-4] 다음 중 기본형(primitive type)이 아닌 것은? b
//		a. int
//		b. Byte  < -- 앞글자가 대문자면 클래스명이다.
//		c. double
//		d. boolean
		// 전부 기본형 같은데...

//		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
//		류’라고 적으시오.
//		System.out.println(“1” + “2”)    ->  (    12     )  
//		System.out.println(true + “”)    ->  (    true   )
//		System.out.println(‘A' + 'B')    ->  (    131    ) A = 65 , B = 66 이기 때문에.
//		System.out.println('1' + 2)      ->  (    51     ) 1 = 49, + 2 = 51이다.
//		System.out.println('1' + '2')    ->  (    99     ) 1 = 49, 2 = 50 -> 두개 더하면 99
//		System.out.println('J' + “ava”)  ->  (    Java   ) 
//		System.out.println(true + null)  ->  (    오류     ) -> 연산 불가능하다.

//		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오) b, c, d, e 
//		a. if <--
//		b. True
//		c. NULL
//		d. Class
//		e. System <--
//		int if;  
//		int True; 
//		int NULL; // 소문자 null은 예약어인데 대문자는 아님.
//		int Class; // 앞글자가 대문자면 클래스이다.
//		int System;

//		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오) a, d, e, g
//		a. $ystem
//		b. channel#5 <-- #사용 불가능
//		c. 7eleven <-- 숫자로 시작 불가능
//		d. If    
//		e. 자바   
//		f. new  <-- 예약어 사용 불가능
//		g. $MAX_NUM
//		h. hello@com  <--@ 사용 불가능
		
//		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
//		        르시오) a, d
//		a. int   <--- 
//		b. long
//		c. short
//		d. float <---
//		e. double
		 // 참조형 변수는 4byte인데 int, float이 4byte이다.
		
//		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오) d, e
//		byte b = 10;
//		char ch = 'A';
//		int i = 100;
//		long l = 1000L;
		
//		a. b = (byte)i;    b는 바이트 i는 int 즉, int가 더 크니까 생략 불가 
//		b. ch = (char)b; ch는 char(2) b는 byte(1) // 표현범위가 다르면 형변환 해야한다.    
//		c. short s = (short)ch; // 표현범위가 다르면 형변환 해야한다. 
//		d. float f = (float)l;   <-- long 타입 보다 float 타입이 더 표현 범위가 커서 생략 가능
//		e. i = (int)ch;          <-- ch는 char , i = int 니까 i가 더 크니까 생략 가능
		
//		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		//땡// 0~9 까지. 10이 넘어가면 두자리수이기 때문에 char에 넣을 수 없다.
		// 정답 : 65536 까지 표현 가능
		
//		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오) a, b, c, d
//		a. byte b = 256;    <-- 숫자 초과
//		b. char c = ''; <-- 반드시 하나의 문자를 초기화 해야한다.
//		c. char answer = 'no'; <-- 한글자만 가능
//		d. float f = 3.14 <-- 접미사 f가 누락 되었습니다.
//		e. double d = 1.4e3f;
//				
//		[2-12] 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오) a 
//		a. public static void main(String[] args) <--
//		b. public static void main(String args[])
//		c. public static void main(String[] arv)
//		d. public void static main(String[] args)
//		e. static public void main(String[] args)
//				
//		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오) c, e, f
//		a. boolean - false
//		b. char - '\u0000'
//		c. float - 0.0  <-- 0.0f
//		d. int - 0
//		e. long - 0 <-- 0L;
//		f. String - "" <--null
		/*
		 * 기본값!
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0.0f;
		_double = 0.0d;
		_char = '\u0000'; // ' '  <-- 실제로는 공백으로 표시된다.  
		_boolean = false;
		_String = null;
		*/
	}
}
