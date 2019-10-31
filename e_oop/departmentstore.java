package e_oop;

import java.util.Scanner;
import java.util.ArrayList;

public class departmentstore {

	public static void main(String[] args) {
		departmentstore dp = new departmentstore();
		dp.floor1();
	}
	
	Scanner scanner = new Scanner(System.in);
	String T;
	String pants;

	int receipt;
	int receiptfloor;
	int floor;

	ArrayList<String> name = new ArrayList<String>();
	ArrayList<String> brand = new ArrayList<String>();
	ArrayList<String> cloth = new ArrayList<String>();
	ArrayList<Integer> size = new ArrayList<Integer>();
	ArrayList<Integer> price = new ArrayList<Integer>();
	
	departmentstore(){
		floor = 1;
	}

	void floorUp(){
		if ( floor < 5){
			floor++;
		}
		if (this.floor == 1){
			floor1();
		} else if ( this.floor == 2){
			floor2();
		} else if ( this.floor == 3){
			floor3();
		} else if ( this.floor == 4){
			floor4();
		} else if ( this.floor == 5){
			floor5();
		} 
	}

	void floorDown(){
		if(floor > 1){
			floor--;
		}
		if (this.floor == 1){
			floor1();
		} else if ( this.floor == 2){
			floor2();
		} else if ( this.floor == 3){
			floor3();
		} else if ( this.floor == 4){
			floor4();
		} else if ( this.floor == 5){
			floor5();
		} 
	}

	void receipt(){
		System.out.println("번호\t브랜드\t종류\t이름\t사이즈\t가격");
		int sum = 0;
		for (int i = 0; i<price.size(); i++){
			sum = sum + price.get(i);
		}
		for (int i =0; i<name.size(); i++){
			System.out.print(i+1 + "\t");
			System.out.print(brand.get(i) + "\t");
			System.out.print(cloth.get(i) + "\t");
			System.out.print(name.get(i) + "\t");
			System.out.print(size.get(i) + "\t");
			System.out.println(price.get(i));
		}
		System.out.println("합계 금액 : " + sum);
		if ( 200000 <= sum && sum<= 400000){
			System.out.println("합계 금액 20만원 이상이므로 상품권 1만원 교환 가능합니다.");
		} else if (400000 <= sum && sum<= 600000){
			System.out.println("합계 금액 40만원 이상이므로 상품권 2만원 교환 가능합니다.");
		} else if (600000 <= sum && sum<= 1000000){
			System.out.println("합계 금액 60만원 이상이므로 상품권 3만원 교환 가능합니다.");
		} else if (1000000 <= sum){
			System.out.println("합계 금액 100만원 이상이므로 상품권 5만원 교환 가능합니다.");
		}

		System.out.println("쇼핑을 계속 하시겠습니까?");
		System.out.println(" 1. 예   2. 아니오");
		int a = scanner.nextInt();
		if (a == 1 ){
			if (receiptfloor == 1){
				floor1();
			} else if (receiptfloor == 2){
				floor2();
			} else if (receiptfloor == 3){
				floor3();
			} else if (receiptfloor == 4){
				floor4();
			} else if (receiptfloor == 5){
				floor5();
			} 
		} else if ( a==2){
			shoppingstop();
		}
	}

	void floor1(){
		receiptfloor = 1;
		System.out.println("1층입니다. 이곳에서는 화장품을 구매 할 수 있습니다. 어떤 행동을 하시겠습니까?");
		System.out.println("1. 구매              2. 윗층으로               3. 아래층으로");
		System.out.println("4. 영수증 출력       5. 백화점 정보            6. 쇼핑 종료 ");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1 ){
			System.out.println("화장품을 구매할 마음이 없습니다.");
			System.out.println("2층으로 올라갑니다.");
			floorUp();
		} else if ( a == 2 ){
			floorUp();
		} else if ( a == 3){
			floorDown();
		} else if ( a == 4){
			receipt();
		} else if ( a == 5) {
			information();
		} else if ( a == 6 ){
			shoppingstop();
		}
	}

	void floor2(){
		receiptfloor = 2;
		System.out.println("2층입니다. 이곳에서는 신발을 구매할 수 있습니다.");
		System.out.println("1. 구매                2. 윗층으로               3. 아래층으로");
		System.out.println("4. 영수증 출력         5. 백화점 정보            6. 쇼핑 종료 ");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1){
			shoes();
		} else if ( a == 2 ){
			floorUp();
		} else if ( a == 3){
			floorDown();
		}  else if ( a == 4 ){
			receipt();
		} else if ( a == 5) {
			information();
		}
	}

	void floor3(){
		receiptfloor = 3;
		System.out.println("3층입니다. 이곳에서는 상의를 구매할 수 있습니다.");
		System.out.println("1. 구매              2. 윗층으로               3. 아래층으로");
		System.out.println("4. 영수증 출력       5. 백화점 정보            6. 쇼핑 종료 ");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1){
			shirts();
		} else if ( a == 2 ){
			floorUp();
		} else if ( a == 3){
			floorDown();
		}  else if ( a == 4){
			receipt();
		} else if ( a== 5) {
			information();
		} 
	}

	void floor4(){
		receiptfloor = 4;
		System.out.println("4층입니다. 이곳 주차장입니다. 지나가세요");
		System.out.println("1. 구매              2. 윗층으로               3. 아래층으로");
		System.out.println("4. 영수증 출력       5. 백화점 정보            6. 쇼핑 종료 ");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1 ){
			System.out.println("이곳은 주차장입니다.");
			floor4();
		} else if ( a == 2 ){
			floorUp();
		} else if ( a == 3 ){
			floorDown();
		}  else if ( a == 4){
			receipt();
		} else if ( a== 5) {
			information();
		}

	}

	void floor5(){
		receiptfloor = 5;
		System.out.println("5층입니다. 이곳에서는 하의를 구매 할 수 있습니다.");
		System.out.println("1. 구매              2. 윗층으로               3. 아래층으로");
		System.out.println("4. 영수증 출력       5. 백화점 정보            6. 쇼핑 종료 ");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1 ){
			pants();
		} else if ( a == 2 ){
			floorUp();
		} else if ( a == 3){
			floorDown();
		}  else if ( a == 4){
			receipt();
		} else if ( a == 5) {
			information();
		}
	}

	void shoppingstop(){
		System.out.println("쇼핑을 종료합니다.");
		System.exit(0);
	}
	
	void information(){
		System.out.println("1. 구매              2. 윗층으로               3. 아래층으로");
		System.out.println();
		System.out.println("백화점 정보입니다.");
		System.out.println("1층 화장품");
		System.out.println("2층 신발");
		System.out.println("3층 상의");
		System.out.println("4층 주차장");
		System.out.println("5층 하의");
		System.out.println();
		if (receiptfloor == 1){
			floor1();
		} else if (receiptfloor == 2){
			floor2();
		} else if (receiptfloor == 3){
			floor3();
		} else if (receiptfloor == 4){
			floor4();
		} else if (receiptfloor == 5){
			floor5();
		} 
	}

	void shoes(){
		System.out.println("어떤 매장을 가시겠습니까?");
		System.out.println("1. 나이키 / 2. 아디다스 / 3. 구매 안함.");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1){
			nike();
		} else if ( a == 2 ){
			adidas();
		} else {
			floor2();
		}
	}
	
	int shoessize(int b){
			System.out.println("저희 매장은 5단위 사이즈만 판매하고 있으며");
			System.out.println("사이즈는 210부터 320까지만 가능합니다.");
			System.out.println("발 사이즈를 입력하세요.");
			System.out.print("입력 : ");
			b = scanner.nextInt();
			if ( b % 5 != 0 || 210 > b || b > 320){
				shoessize(b);
			}
			return b;
	}

	void nike(){
		int b;
		System.out.println("나이키 입니다. 어떤 신발을 구매하시겠습니까?");
		System.out.println("1. 에어맥스 / 2. 스니커즈 / 3. 런닝화 / 4. 구매 안함");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1 ){
			System.out.println("발 사이즈를 입력하세요.");
			System.out.print("입력 : ");
			b = scanner.nextInt();
//			if ( b % 5 != 0 || 210 > b || b > 320){
//				shoessize(b);
//			}
			
			System.out.println("사이즈 : " + b + " 에어맥스의 가격은 99,000원 입니다.");
			System.out.println(" 에어맥스의 가격은 99,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("나이키");  
				cloth.add("신발"); 
				name.add("에어맥스");
				size.add(b);
				price.add(99000);
				System.out.println("구매 완료 하였습니다.");
				floor2();
			} else if ( c == 2 ){
				floor2();
			}
		} else if ( a == 2 ){
			System.out.println("발 사이즈를 입력하세요.");
			System.out.print("입력 : ");
			b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 스니커즈의 가격은 89,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("나이키");
				cloth.add("신발");
				name.add("스니커즈");
				size.add(b);
				price.add(89000);
				System.out.println("구매 완료 하였습니다.");
				floor2();
			} else if ( c == 2 ){
				floor2();
			}

		} else if ( a == 3 ){
			System.out.println("발 사이즈를 입력하세요.");
			System.out.print("입력 : ");
			b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 런닝화의 가격은 129,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("나이키");
				cloth.add("신발");
				name.add("런닝화");
				size.add(b);
				price.add(129000);
				System.out.println("구매 완료 하였습니다.");
				floor2();
			} else if ( c == 2 ){
				floor2();
			}
		} else {
			floor2();
		}
	}

	void adidas(){
		System.out.println("아디다스 입니다. 어떤 신발을 구매하시겠습니까?");
		System.out.println("1. 오리지널 / 2. 팔콘 / 3. 삼선 슬리퍼 / 4. 구매 안함");
		int a = scanner.nextInt();
		if ( a == 1 ){
			System.out.println("발 사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 오리지널의 가격은 109,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("아디다스");
				cloth.add("신발");
				name.add("오리지널");
				size.add(b);
				price.add(109000);
				System.out.println("구매 완료 하였습니다.");
				floor2();
			} else if ( c == 2 ){
				floor2();
			}

		} else if ( a == 2 ){
			System.out.println("발 사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 팔콘의 가격은 69,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("아디다스");
				cloth.add("신발");
				name.add("팔콘");
				size.add(b);
				price.add(69000);
				System.out.println("구매 완료 하였습니다.");
				floor2();
			} else if ( c == 2 ){
				floor2();
			}

		} else if ( a == 3 ){
			System.out.println("발 사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 삼선슬리퍼의 가격은 29,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("아디다스");
				cloth.add("신발");
				name.add("삼선");
				size.add(b);
				price.add(29000);
				System.out.println("구매 완료 하였습니다.");
				floor2();
			} else if ( c == 2 ){
				floor2();
			}
		} else {
			floor2();
		}
	}

	void shirts(){
		System.out.println("어떤 매장을 가시겠습니까?");
		System.out.println("1. 지오다노 / 2. 유니클로 / 3. 구매 안함.");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1 ){
			giodano();
		} else if ( a == 2 ){
			uniqlo();
		} else {
			floor3();
		}
	}

	void giodano(){
		System.out.println("지오다노 매장입니다. 어떤 옷을 구매하시겠습니까?");
		System.out.println("1. 맨투맨 / 2. 니트 / 3. 스웨터 / 4. 구매 안함");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1 ){
			System.out.println("사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 맨투맨의 가격은 29,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("지오다노");
				cloth.add("상의");
				name.add("맨투맨");
				size.add(b);
				price.add(29000);
				System.out.println("구매 완료 하였습니다.");
				floor3();
			} else if ( c == 2 ){
				floor3();
			}

		} else if ( a == 2 ){
			System.out.println("사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 니트의 가격은 39,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("지오다노");
				cloth.add("상의");
				name.add("니트");
				size.add(b);
				price.add(39000);
				System.out.println("구매 완료 하였습니다.");
				floor3();
			} else if ( c == 2 ){
				floor3();
			}

		} else if ( a == 3 ){
			System.out.println("사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 스웨터의 가격은 59,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("지오다노");
				cloth.add("상의");
				name.add("스웨터");
				size.add(b);
				price.add(59000);
				System.out.println("구매 완료 하였습니다.");
				floor3();
			} else if ( c == 2 ){
				floor3();
			}
		} else {
			floor3();
		}
	}

	void uniqlo(){
		System.out.println("유니클로 매장입니다. 어떤 옷을 구매하시겠습니까?");
		System.out.println("1. 후리스 / 2. 히트텍 / 3. 경량패딩 / 4. 구매 안함");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1 ){
			System.out.println("사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 후리스의 가격은 49,900원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("유니클로");
				cloth.add("상의");
				name.add("후리스");
				size.add(b);
				price.add(49900);
				System.out.println("구매 완료 하였습니다.");
				floor3();
			} else if ( c == 2 ){
				floor3();
			}

		} else if ( a == 2 ){
			System.out.println("사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 히트텍의 가격은 19,900원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("유니클로");
				cloth.add("상의");
				name.add("히트텍");
				size.add(b);
				price.add(19900);
				System.out.println("구매 완료 하였습니다.");
				floor3();
			} else if ( c == 2 ){
				floor3();
			}

		} else if ( a == 3 ){
			System.out.println("사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 경량패딩 의 가격은 69,900원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("유니클로");
				cloth.add("상의");
				name.add("경량패딩");
				size.add(b);
				price.add(69900);
				System.out.println("구매 완료 하였습니다.");
				floor3();
			} else if ( c == 2 ){
				floor3();
			}

		} else {
			floor3();
		}

	}

	void pants(){
		System.out.println("어떤 매장을 가시겠습니까?");
		System.out.println("1. 리바이스 / 2. 게스 / 3. 구매 안함.");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1){
			revice();
		} else if ( a == 2 ){
			guess();
		} else {
			floor5();
		}
	}

	void revice(){
		System.out.println("리바이스 매장입니다. 어떤 바지를 구입하시겠습니까?");
		System.out.println("1. 511 / 2. 기모 / 3. 밴딩 / 4. 구매 안함");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1 ){
			System.out.println("사이즈를 입력하세요.");
			System.out.print("입력 : ");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 511의 가격은 88,900원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("리바이스");
				cloth.add("하의");
				name.add("511");
				size.add(b);
				price.add(88900);
				System.out.println("구매 완료 하였습니다.");
				floor5();
			} else if ( c == 2 ){
				floor5();
			}

		} else if ( a == 2 ){
			System.out.println("사이즈를 입력하세요.");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 기모의 가격은 109,900원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("리바이스");
				cloth.add("하의");
				name.add("기모");
				size.add(b);
				price.add(109900);
				System.out.println("구매 완료 하였습니다.");
				floor5();
			} else if ( c == 2 ){
				floor5();
			}

		} else if ( a == 3 ){
			System.out.println("사이즈를 입력하세요.");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 밴딩의 가격은 79,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("리바이스");
				cloth.add("하의");
				name.add("밴딩");
				size.add(b);
				price.add(79000);
				System.out.println("구매 완료 하였습니다.");
				floor5();
			} else if ( c == 2 ){
				floor5();
			}

		} else {
			floor5();
		}
	}

	void guess(){
		System.out.println("게스 매장입니다. 어떤 바지를 구입하시겠습니까?");
		System.out.println("1. 슬림핏 / 2. 데님 / 3. 스키니 / 4. 구매 안함");
		System.out.print("입력 : ");
		int a = scanner.nextInt();
		if ( a == 1 ){

			System.out.println("사이즈를 입력하세요.");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 슬림핏의 가격은 119,900원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("게스");
				cloth.add("하의");
				name.add("슬림핏");
				size.add(b);
				price.add(119900);
				System.out.println("구매 완료 하였습니다.");
				floor5();
			} else if ( c == 2 ){
				floor5();
			}

		} else if ( a == 2 ){
			System.out.println("사이즈를 입력하세요.");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 데님의 가격은 115,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			System.out.print("입력 : ");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("게스");
				cloth.add("하의");
				name.add("데님");
				size.add(b);
				price.add(115000);
				System.out.println("구매 완료 하였습니다.");
				floor5();
			} else if ( c == 2 ){
				floor5();
			}

		} else if ( a == 3 ){
			System.out.println("사이즈를 입력하세요.");
			int b = scanner.nextInt();
			System.out.println("사이즈 : " + b + " 스키니의 가격은 99,000원 입니다.");
			System.out.println("구매 하시겠습니까?");
			System.out.println("1. 예 / 2. 아니오");
			int c = scanner.nextInt();
			if ( c == 1 ){
				brand.add("게스");
				cloth.add("하의");
				name.add("스키니");
				size.add(b);
				price.add(99000);
				System.out.println("구매 완료 하였습니다.");
				floor5();
			} else if ( c == 2 ){
				floor5();
			}
		} else {
			floor5();
		}
	}
}