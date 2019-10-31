package f_oop2;

public class SampleParent extends Object{  // 우리가 상속을 써주지 않는다면 Object클래스를 상속받고 있는것
										   // 즉, Object는 모든 클래스의 조상. 
	
	String var; 
	
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	SampleParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b){
		return a + b;
	}
}
