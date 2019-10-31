package e_oop;

public class ClassMaker {
	int a = 10;
	
	void a() {  //리턴 타입 없을때 void
		System.out.println(a);
	}
	int b(){ //파라미터가 없으면 괄호 안에 아무것도 들어가지 않는다.
		return a;
	}
	void c(String str){
		System.out.println(str);
	}
	int d(int a, int b){
		return a * b;
	}
}