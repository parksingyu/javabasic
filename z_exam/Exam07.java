package z_exam;
/*
7-1
7-2
7-14
7-18
7-21
7-22
7-23
7-25 부터 쭉 ~ 풀지 마세요.*/
public class Exam07 {
	public static void main(String[] args) {
		/*
		 * [7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
		    정답: 
		    정의 : 상위클래스에서 정의된 메소드를 자식클래스에서 재정의하는것.
		    필요성 : 상위클래스에서 받은 메소드를 그대로 사용하지 못할때 필요합니다.

		   [7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
		    a. 조상의 메서드와 이름이 같아야 한다.
			b. 매개변수의 수와 타입이 모두 같아야 한다.
			c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
			d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.
			
			e : 넓은 범위로 변경 해야 한다.
			d :  조상의 메서드보다 더 많은 수의 예외를 선언할 수 없다.
			정답 : d, e
			

			[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
				  위해서는 코드를 어떻게 바꾸어야 하는가?

			[연습문제]/ch7/Exercise7_5.java
			class Product
			{
			int price;	// 제품의 가격
			int bonusPoint;	// 제품구매 시 제공하는 보너스점수
			}

			Product(int price) {
			this.price = price;
			bonusPoint =(int)(price/10.0);
			}

			class Tv extends Product {
			Tv() {}
			}

			public String toString() {
			return "Tv";
			}

			class Exercise7_5 {
			public static void main(String[] args) {
			Tv t = new Tv();
			}
			}
			정답 : Product() { } or super(3000);

			[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?
			 정답: 상위 클래스에 정의된 인스턴스 변수들이 초기화 하기 위해서이다.

			[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.

			[연습문제]/ch7/Exercise7_7.java
			class Parent {
			int x=100;
			Parent() {
				this(200);
			}
			Parent(int x) {
				this.x = x;
				}
			}

			int getX() {
				return x;
				}
			}

			class Child extends Parent {
				int x = 3000;
				Child() {
					this(1000);
			}

			Child(int x) {
				this.x = x;
				}
			}

			class Exercise7_7 {
			public static void main(String[] args) {
			Child c = new Child();

			System.out.println("x="+c.getX());
				}
			}
			정답 : child() -> child(int x) -> parent() -> parent(int x) -> object()

			[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?
			a. public-protected-(default)-private
			b. public-(default)-protected-private
			c. (default)-public-protected-private
			d. private-protected-(default)-public
			정답 : a
			public : 제한 없음
			default : 패키지 내에서
			protected : 자식클래스 + 패키지
			private : 클래스 내에서만

			[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
			옳지 않은 것은? (모두 고르시오) 
			a. 지역변수 - 값을 변경할 수 없다.
			b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
			c. 메서드 - 오버로딩을 할 수 없다.
			d. 멤버변수 - 값을 변경할 수 없다.
			정답 : 오버로딩은 가능하고 오버라이딩이 불가능하다

			[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
			수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
			getter와 setter메서드를 추가하라.
			[연습문제]/ch7/Exercise7_10.java
			class MyTv2 {
			boolean isPowerOn;
			int	channel;
			int	volume;

			final int MAX_VOLUME = 100;
			final int MIN_VOLUME = 0 ;
			final int MAX_CHANNEL = 100;
			final int MIN_CHANNEL = 1 ;
			//(1) 알맞은 코드를 넣어 완성하시오.
			
			int setVolume(int a){
			volume = a;
			return a;
			}
	
			int getVolume(){
			return volume;
			}
	
			void setChannel(int a){
				channel = a;
			}
		
			int getChannel(){
				return channel;
			}
			} 
			class Exercise7_10 {
				public static void main(String args[]) {
					MyTv2 t = new MyTv2();

					t.setChannel(10);
					System.out.println("CH:"+t.getChannel());
					t.setVolume(20);
					System.out.println("VOL:"+t.getVolume());
				}
			}
			[실행결과]
			CH:10
			VOL:20
			
			[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
			기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
			[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.

			메서드명 : gotoPrevChannel
			기능 : 현재 채널을 이전 채널로 변경한다.
			반환타입 : 없음
			매개변수 : 없음

			[연습문제]/ch7/Exercise7_11.java
			class MyTv2 {
			
			//(1) 문제7-10의 MyTv2클래스에 gotoPrevChannel메서드를 추가하여 완성하시오.
			boolean isPowerOn;
			int	channel;
			int	volume;
			int prevChannel;
		
			final int MAX_VOLUME = 100;
			final int MIN_VOLUME = 0 ;
			final int MAX_CHANNEL = 100;
			final int MIN_CHANNEL = 1 ;
			//(1) 알맞은 코드를 넣어 완성하시오.
			int setVolume(int a){
				volume = a;
				return a;
			}
			
			int getVolume(){
				return volume;
			}
			
			void setChannel(int a){
				prevChannel = this.channel;
				channel = a;
			}
		
			int getChannel(){
				return channel;
			}
			
			void gotoPrevChannel(){
				
				setChannel(prevChannel);
			}
					 
			[실행결과]
			CH:10
			CH:20
			CH:10
			CH:20
			     
			[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a. public은 접근제한이 전혀 없는 접근 제어자이다. O
			b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다. O
			c. 지역변수에도 접근 제어자를 사용할 수 있다. 
			d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다. O
			e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다. O
			정답 : c
			
			[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
			정답 : Math클래스의 모든 메서드가 static메서드이고 인스턴스변수가 존재하지 않기
			       때문에 객체를 생성할 필요가 없어서.
			      
			[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? (모두 고르시오.)
			class Unit {}
			class AirUnit extends Unit {}
			class GroundUnit extends Unit {}
			class Tank extends GroundUnit {}
			class AirCraft extends AirUnit {}
			 
			Unit u = new GroundUnit();
			Tank t = new Tank();
			AirCraft ac = new AirCraft();
			
			a. u = (Unit)ac;
			b. u = ac;
			c. GroundUnit gu = (GroundUnit)u;
			d. AirUnit au = ac;
			e. t = (Tank)u;
			f. GroundUnit gu = t;
			정답 : e
			해설 : 조상 인스턴스를 자손타입으로 형변환 불가능
			
			[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
			class Car {}
			class FireEngine extends Car implements Movable {}
			class Ambulance extends Car {}
			FireEngine fe = new FireEngine();
			
			a. fe instanceof FireEngine
			b. fe instanceof Movable
			c. fe instanceof Object
			d. fe instanceof Car
			e. fe instanceof Ambulance
			정답 : e
			
			[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 
			클래스를 만들고, 이 클래스를 상속받도록 코드를 변경하시오.
			
			class Marine {	// 보병
			int x, y;	// 현재 위치
			void move(int x, int y) { 
			// 지정된 위치로 이동  
			}
			void stop()	{ 
			// 현재 위치에 정지 
			}
			void stimPack()	{ 
			// 스팀팩을 사용한다.
			}
			}
			class Tank {	// 탱크
			int x, y;	// 현재 위치
			void move(int x, int y) {  
			// 지정된 위치로 이동
			}
			void stop()	{ 
			// 현재 위치에 정지 
			}
			void changeMode()	{ 
			// 공격모드를 변환한다. 
			}
			}
			class Dropship {	// 수송선
			int x, y;	// 현재 위치
			void move(int x, int y) {
			//지정된 위치로 이동
			}
			void stop()	{
			//현재 위치에 정지
			}
			void load()	{
			//선택된 대상을 태운다
			}
			void unload()	{
			//선택된 대상을 내린다.
			}
			
			[7-19] 다음은 물건을 구입하는 사람을 정의한 Buyer클래스이다. 이 클래스는 멤버변수
			로 돈(money)과 장바구니(cart)를 가지고 있다. 제품을 구입하는 기능의 buy메서드와 장
			바구니에 구입한 물건을 추가하는 add메서드, 구입한 물건의 목록과 사용금액, 그리고 남
			은 금액을 출력하는 summary메서드를 완성하시오.
			1. 메서드명 : buy
			기능 : 지정된 물건을 구입한다. 가진 돈(money)에서 물건의 가격을 빼고,
			장바구니(cart)에 담는다.
			만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
			반환타입 : 없음
			매개변수 : Product p - 구입할 물건
			2. 메서드명 : add
			기능 : 지정된 물건을 장바구니에 담는다.
			만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음에 담는다.
			반환타입 : 없음
			매개변수 : Product p - 구입할 물건
			3. 메서드명 : summary
			기능 : 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
			반환타입 : 없음
			매개변수 : 없음
			
			[연습문제]/ch7/Exercise7_19.java
			class Exercise7_19 {
			public static void main(String args[]) {
			Buyer b = new Buyer();
			b.buy(new Tv());
			b.buy(new Computer());
			b.buy(new Tv());
			b.buy(new Audio());
			b.buy(new Computer());
			b.buy(new Computer());
			b.buy(new Computer());
			}
			}
			b.summary();
			 
			class Buyer {
			int money = 1000;
			Product[] cart = new Product[3];
			int i = 0;
			// 구입한 제품을 저장하기 위한 배열
			// Product배열 cart에 사용될 index

			void buy(Product p) {
			//(1) 아래의 로직에 맞게 코드를 작성하시오.
			//1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
			//1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
			//1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
			}
			}
 
			void add(Product p) {
			
			//(2) 아래의 로직에 맞게 코드를 작성하시오.
			//1.1 	i의 값이 장바구니의 크기보다 같거나 크면
			//1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
			//1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
			//1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
			//1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
			
			} // add(Product p)
			void summary() {
			
			//(3) 아래의 로직에 맞게 코드를 작성하시오.
			//1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
			//1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
			//1.3 물건을 사고 남은 금액(money)를 출력한다.
			
			} // summary()
			}
			 
			class Product {
			int price; // 제품의 가격
			 
			Product(int price) {
			this.price = price;
			}
			}
			 
			class Tv extends Product {
			Tv() { super(100); }
			}
			 
			public String toString() { return "Tv"; }
			class Computer extends Product {
			Computer() { super(200); }
			}
			 
			public String toString() { return "Computer";}
			class Audio extends Product {
			Audio() { super(50); }
			}
			 
			public String toString() { return "Audio"; }
			}
			 
			[실행결과]
			잔액이 부족하여 Computer을/를 살수 없습니다.
			구입한 물건:Tv,Computer,Tv,Audio,Computer,Computer,
			사용한 금액:850
			남은 금액:150
			
			[7-20] 다음의 코드를 실행한 결과를 적으시오.
			[연습문제]/ch7/Exercise7_20.java
			class Exercise7_20 {
			public static void main(String[] args) {
			Parent p = new Child();   /////////////////
			Child c = new Child();  ////////////////
			System.out.println("p.x = " + p.x);
			p.method();
			 
			System.out.println("c.x = " + c.x);
			c.method();
			}
			}
			 
			class Parent {
			int x = 100;  //////////////
			
			void method() {
			System.out.println("Parent Method");
			}
			}
			 
			class Child extends Parent {
			int x = 200; /////////////////
			 
			void method() {
			System.out.println("Child Method");
			}
			}
			
			[7-24] 다음 중 인터페이스의 장점이 아닌 것은?
			a. 표준화를 가능하게 해준다.
			b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
			c. 독립적인 프로그래밍이 가능하다.
			d. 다중상속을 가능하게 해준다.
			e. 패키지간의 연결을 도와준다.
			
			a : 기본틀을 인터페이스로 작성한 다음에 개발자들이 인터페이스를 구현하
			b : 아무런 관계도 없는 클래스들이 하나의 공통점이 있는 인터페이스를 구현할수 있다.
			c : 선언과 구현을 분리시킬수 있다.  
			d : 인터페이스 특징
			
		 	* << 인터페이스 >>
		 	* - 상수와 추상메서드만 멤버로 가질 수 있는 데이터 구조이다.
		 	* - interface 인터페이스명{}
		 	* - 모든 멤버변수의 제어자는 public static final 이며, 생략할 수 있다.
		 	* - 모든 메서드의 제어자는 public abstract 이며, 생략할 수 있다.

		 */
	}
}