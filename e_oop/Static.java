package e_oop;

public class Static {

	public static void main(String[] args) {
		/* 
		 * << static >>
		 * - 객체 생성 없이 변수나 메서드를 사용하기 위해 붙인다.
		 * - 객체들간에 변수의 값을 공유하기 위해 붙인다.
		 * - static이 붙은 것 : 클래스 변수, 클래스 메서드
		 * - static이 붙지 않은 것 : 인스턴스 변수, 인스턴스 메서드
		 */
		
		//static이 붙은 메서드
		Math.random();
		System.out.println();
		
		System.out.println(ClassMember.ClassVariable);
		ClassMember.ClassMethod();
		
		ClassMember cm1 = new ClassMember();
		System.out.println(cm1.instanceVariable);
		cm1.instanceMethod();
		
		System.out.println(cm1.ClassVariable);
		cm1.ClassMethod();
		//객체를 통해서도 클래스 멤버에 접근할 수 있지만 좋은 방법은 아니다.
		
		ClassMember cm2 = new ClassMember();
		
		//변경 전
		System.out.println("cm1 : " + cm1.instanceVariable);
		System.out.println("cm2 : " + cm2.instanceVariable);

		cm2.instanceVariable = "변경한 값";
		
		//변경 후
		System.out.println("cm1 : " + cm1.instanceVariable);
		System.out.println("cm2 : " + cm2.instanceVariable);
		
		//변경 전
		System.out.println("cm1 : " + cm1.ClassVariable);
		System.out.println("cm2 : " + cm2.ClassVariable);
		
		cm2.ClassVariable = "변경한 값";
		//static 사용 이유
		//1. 객체생성 하지 않고 사용위해
		//2. 값을 공유하기 위해 두가지 이유로사용
		
		//변경 후
		System.out.println("cm1 : " + cm1.ClassVariable);
		System.out.println("cm2 : " + cm2.ClassVariable);
	}
}