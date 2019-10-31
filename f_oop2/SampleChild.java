package f_oop2;

public class SampleChild extends SampleParent {
	
	int var;
	
	void test(double var){
		System.out.println(var); // 지역변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모클래스의 인스턴스 변수.
		//super : 부모클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될때
		//둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
	}
	
	SampleChild(){
		super(); //부모 클래스의 생성자를 호출하기 위해 사용된다.
	}
	
	void childMethod(){
		// 상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);    // 상속받은 변수
		int result = method(7, 13); // 상속받은 메서드
		System.out.println(result);
	}

	public static void main(String[] args) {
		//사용하려면 객체생성을 해서 메모리에 올려줘야 한다.
		SampleChild sc = new SampleChild();

		sc.childMethod();

		System.out.println(sc.var);
		int result = sc.method(7, 13);
		System.out.println(result);
		
		sc.test(10);
		
		SampleParent sp = new SampleChild();  // (SampleParent)new SampleChild(); <--이와 같이 SampleParent가 숨어있다고 생각하라. 
		System.out.println("sp.var : " + sp.var);
		System.out.println("sc.var : " + sc.var);
		System.out.println("sp.method() : " + sp.method(5, 10)); 
		System.out.println("sc.method() : " + sc.method(5, 10));
		//오버라이딩 하게 되면 부모 클래스의 메서드는 무시된다.
		SampleChild s = (SampleChild)sp;
		s.childMethod();
	}

	//상속받은 메서드를 변경하고 싶을때 오버라이딩 할 수 있다.

	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것.
	@Override // 어노테이션
	int method(int a, int b){ //리턴타입 메서드명 파라미터 모두 같아야 한다.
		return a * b;
	}
}