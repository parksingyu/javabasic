package e_oop;

public class ClassMember {
	
	static String ClassVariable = "클래스 변수 입니다.";
	String instanceVariable = "인스턴스 변수 입니다.";
	
	static void ClassMethod(){
		System.out.println("클래스 메서드 입니다.");
	}
	
	void instanceMethod(){
		System.out.println("인스턴스 메서드 입니다.");
	}
	
}
