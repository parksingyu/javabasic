package h_useful;

public class MathClass {

	public static void main(String[] args) {
		/*
		 * round()	: 반올림
		 * ceil()	: 올림
		 * floor()	: 내림
		 * abs()	: 절대값
		 * random()	: double 난수 발생(0.0 ~ 1.0 미만)
		 */

		double d1 = 0.5;
		double d2 = -0.5;

		System.out.println(Math.round(d1)); // 소수점이 0.5 이상일경우 올림(반올림), 정수타입 반환
		System.out.println(Math.round(d2));

		System.out.println(Math.ceil(d1));  //소수점이 0.5 미만이어도 증가시킴(올림), 더블타입 반환
		System.out.println(Math.ceil(d2));

		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d2));

		System.out.println(Math.abs(d1)); // 양수이면 그대로 출력 (절대값)
		System.out.println(Math.abs(d2)); // 음수이면 *(-1) 한 상태로 출력 (절대값)

		for(int i = 0 ; i < 20; i++){
			int random = getRandom(10, 5);
			System.out.print(random + " ");
		}



	}
	//랜덤변수를 편하게 사용하기 위한 메서드 생성
	private static int getRandom(int from, int to){
		return (int)(Math.random() * (Math.abs(to - from) +1)) + Math.min(from, to);
	}

}
