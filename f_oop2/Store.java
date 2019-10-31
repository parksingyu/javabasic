package f_oop2;

public class Store {

	public static void main(String[] args) {
		//상속을 이용한 간단한 상점 만들기
		Customer c = new Customer();
		
		Product p = new Desktop();  //Upcasting 객체는 자식 타입, 
		p.info();
		c.buy(p);
		
		p = new TV();
		p.info();
		c.buy(p);
		
		p = new Notebook();
		p.info();
		c.buy(p);
		
		c.showItem();
		// Product타입의 변수 p가 Desktop도 될 수 있고, TV도 될 수 있다.
		// 이렇게 여러가지 형태를 가지는 특징을 다형성이라고 한다.
	}
}

class Product{
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info(){
		System.out.println("-----------------------");
		System.out.println("상품명 : " + name);
		System.out.println("금  액 : " + price + "원");
		System.out.println("-----------------------");
	}
}

class Desktop extends Product{
	Desktop(){
		super("삼성 컴퓨터", 500000); //부모 클래스(Product)의 생성자 호출
	}
}

class TV extends Product{
	TV(){
		super("LG TV", 1000000);
	}
}

class Notebook extends Product{
	Notebook(){
		super("hansung 노트북", 500000);
	}
	
}

class Customer{
	int money = 2000000000;
	Product[] item = new Product[10]; //장바구니
	
	void buy(Product p){
		if ( money < p.price){
			System.out.println("돈이 부족하다.");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0 ; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매 했다.");
	}
	
	void showItem(){
		System.out.println("------- 장바구니 -------");
		for(int i = 0; i < item.length; i++){
			if(item[i] != null){
				System.out.println(i+1 + ". " + item[i].name);
			}
		}
		System.out.println("----------------------");
	}
}











