package f_oop2;

public class AccessModifier {
	//접근제어자 (public, protected, default, private)
	//default는 생략했을때가 default.
	// - public : 접근에 제한이 없다.
	// - protected : 같은 패키지, 그리고 상속받은 클래스에서 접근이 가능하다.
	// - default : 같은 패키지에서만 접근이 가능하다.
	// - private : 클래스 내에서만 접근이 가능하다.

	public String publicVar = "public : 접근제한이 없음";
	protected String protectedVar = "protected : 같은 패키지 + " + "상속받은 클래스에서 접근가능";
	String defaultVar = "default : 같은 패키지에서만 접근 가능";
	private String privateVar = "private : 클래스 내에서만 접근 가능";

	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
}