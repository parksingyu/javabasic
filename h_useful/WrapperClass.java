package h_useful;

import java.util.Vector;

public class WrapperClass {
	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * 
		 * boolean  : Boolean
		 * char		: Character
		 * byte		: Byte
		 * short	: Short
		 * int		: Integer
		 * long		: Long
		 * float	: Float
		 * double	: Double
		 */
		
		int i = 10;
		Integer iw = new Integer(20);
		System.out.println(i + iw);
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);  //타입의 최소값과 최대값을 구할때 용이하다.
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		System.out.println(i + Integer.parseInt("20"));
		
		System.out.println(i + String.valueOf(20)); // 숫자인 타입을 문자열로 바꿔주는것
		
		System.out.println(i + Integer.valueOf("20")); // parseInt와 동일한 기능을 합니다.
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(10)); //객체만 저장할수 있음.
		
		v.add(100); 
		// 사실은 이렇게 리터럴도 저장 가능, 원래대로라면 컴파일에러가 발생을 해야겠지만 형변환이 숨어있어서 가능
		// 이거를 오토박싱이라고 함. 오토박싱 : 기본형 타입이 wrapper클래스로 자동 변환 
		
		Integer integer = v.get(0);
		int i2 = v.get(0); //언박싱 : wrapper클래스가 기본형타입으로 자동 변환
	}
}