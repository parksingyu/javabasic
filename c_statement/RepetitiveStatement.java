package c_statement;

import java.util.Scanner;  // ctrl + shift + o


public class RepetitiveStatement {

	public static void main(String[] args) {
		
		/*
		 * << for 문 >>
		 * - for (int i = 1; i<=10; i++){ }
		 * - for (1부터 10까지 1씩 증가하면서 반복) { }
		 */
		
		for(int i = 1; i<=10; i++){
			//for(초기화; 조건식; 증강식){}
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한ㄷ.
			//증감식 : 변수를 증가/감소 시켜서 반복문을 제어한다.
			System.out.println(i + "번째 반복"); 
			//초기화한 변수를 블럭 안에서 사용할 수 있다.
		}
		
		int sum = 0; //1부터 10까지 합계를 저장
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		
		System.out.println(sum);
		
		sum = 0;
		// 반복문을 사용하면 규칙이 있는 반복되는 작업을 짧게 표현할 수 있다.
		for(int i = 1; i<=10; i++){
			//sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		//100부터 1까지 1씩 감소하면서 반복한다.
		for(int i = 100; i>=1; i--){
			sum += i;
		}
		System.out.println(sum);
		
		//1부터 100까지 짝수의 합을 구해보자
		sum = 0;
		for(int i = 0; i <= 100; i += 2){
			sum += i;
		}
		System.out.println(sum);
		
		// 짝수의 합
		sum = 0;
		for (int i = 1; i<=100; i++){
			if( i % 2 == 0){
				sum += i;
			}
		}
		System.out.println(sum);

		//1부터 100까지 홀수의 합을 구해주세요.
		sum = 0;
		for (int i = 1; i<=100; i++){
			if( i % 2 == 1){
				sum += i;
			}
		}
		System.out.println(sum);
		
		//구구단을 출력해보자.
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * ....
		 */
		
		for ( int i = 1; i<=9; i++){
			System.out.println("2 * " + i + " = " + i * 2);
		}
		
		System.out.println("");
		
		for ( int i = 1; i<=9; i++){
			System.out.println("7 * " + i + " = " + i * 7);
		}
		
		System.out.println("");
		
		// 2단부터 9단까지 만들기
		for ( int j = 2; j<=9; j++){
			for ( int i = 1; i<=9; i++){
				System.out.println( j + " * " + i + " = " + i*j);
			}
		} 		// for 문 안에 있는 int i는 지역변수로 사용된다. 그렇기 때문에 블럭을 벗어 나면 없는것
		
		System.out.println("");
		//구구단 전체의 짝수단의 홀수줄만 출력해주세요.
		// 방법 1.
		for (int i = 2; i<=9; i += 2){
			for (int j = 1; j<=9; j += 2){
				System.out.println( i + " * " + j + " = " + i*j);
			}
		}
		
		System.out.println("");
		
		// 방법 2.
		for (int i = 2; i<=9; i++){
			if ( i % 2 ==0){
				for (int j = 1; j<=9; j++){
					if ( j % 2 ==1){
						System.out.println( i + " * " + j + " = " + i*j);
					}
				}
			}
		}

		// 구구단 전체를 가로로 출력해주세요.
		/*
		 * 2 * 1 = 2    3 * 1 = 3    4 * 1 = 4    ...
		 * 2 * 2 = 4    3 * 2 = 6    4 * 2 = 8    ...
		 */
		System.out.println("");
		// 내 방법
		for (int i = 1; i<=9; i++){
			for(int j = 2; j<=9; j++){
				System.out.print( j + " * " + i + " = " + i * j + "    " + "\t");  // \t가 합쳐지면 tab이다.
				if ( j == 9){
					System.out.println("");
				}
			}
		}
		
		
		// 선생님 방법
//		for (int j = 1; j<=9; j++){
//			for (int i = 2; i<=9; i++){
//				System.out.print(i + " * " + j + " = " + i * j + "\t");
//			}
//			System.out.println();
//			
//		}
		
		/*
		 * << while 문 >>
		 * - while(조건식) {  }
		 * - 조건식의 결과가 true인 동안 계속해서 반복
		 * - 반복횟수를 알 수 없을때 사용한다.
		 */
		
		Scanner s = new Scanner(System.in);
		
//		while (true){
//			System.out.println("몇단을 출력할까요?(0 : 종료)");
//			int dan = Integer.parseInt(s.nextLine());
//			
//			if (dan == 0){
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			
//			for (int i = 1; i<=9; i++){
//				System.out.println(dan + " * " + i + " = " + dan * i);
//			}
//		}
		
		System.out.println("");
		
		/* << do-while 문
		 * - do{ }while(조건식);
		 * - 최소한 한번의 수행을 보장한다.
		 */
		
		// 숫자 맞추기 게임을 만들어 보자.
//		int answer = (int) (Math.random() * 100) + 1;  // 1~100까지 랜덤으로 나오게 하는 명령어. 1~10 으로 하고 싶으면 *100을 * 10으로
//		//1~100 사이의 랜덤수를 발생시킨다.
//		int input = 0;
//		
//		do{
//			System.out.println("1 ~ 100 사이의 수를 입력해주세요>");
//			input = Integer.parseInt(s.nextLine());
//			
//			if ( answer < input) {
//				System.out.println(input + " 보다 작습니다.");
//			} else if ( input < answer){
//				System.out.println(input + " 보다 큽니다.");
//			} else {
//				System.out.println("정답입니다!!");
//			}
//		} while(input != answer);
		
		//이름붙은 반복문
		outer : for (int i =2; i<=9; i++){
			for (int j = 1; j<= 9; j++){
				if ( j == 5 ) {
//					break; //가장 가까운 반복문 하나를 빠져나간다.
//					break outer; // outer라는 이름의 반복문을 빠져나간다.
//					continue; // 가장 가까운 반복문의 현재 반복회차를 빠져나간다. 쉽게 말해, 컨티뉴를 만나면 증감식으로 간다.
//					continue outer; // outer라는 이름의 현재 반복회차를 빠져나간다.
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		/* 야구게임!
		 * 123 이라면
		 * 
		 * 135 1S 1B 1O
		 * 126 2S 0B 1O
		 * 219 0S 2B 1O
		 * 
		 * 136 0S 1B 2O  // 셋중 자리수 맞지않는 숫자 하나 있음
		 * 217 1S 1B 1O  // 가운데는 1이네 그리고 2와 7중에 하나가 들어 있네
		 * 123 0S 1B 2O  // 가운데가 1 이고 2와 3 안들어감 *12   -> 4 5 6 9 
		 * 318 1S 0B 2O  // 3 과 8 안들어감
		 * 517 1S 2B 2O  // 715 !
		 * 
		 */
		int ss = 0; 
		int bb = 0;
		int oo = 0;
		int answer1 = (int) (Math.random() * 9) + 1;
		int answer2 = (int) (Math.random() * 9) + 1;  
		int answer3 = (int) (Math.random() * 9) + 1;
		
		System.out.print(answer1);  // 첫번째 값 입력
		
		while (true){
			if (answer1 == answer2){
				answer2 = (int) (Math.random() * 9) + 1;
			} else if ( answer1 != answer2){
				break;
			}
		}
		System.out.print(answer2); // 두번째 값 입력
		
		while (true){
			if (answer1 == answer3 || answer2 == answer3 ){
				answer3 = (int) (Math.random() * 9) + 1;
			} else {
				break;
			}
		}
		System.out.println(answer3); // 세번째 값 입력
		
		System.out.println("3자리 숫자를 입력해주세요.");
		int dan = Integer.parseInt(s.nextLine());
		
		
		if ( dan / 100 == answer1){
			ss = ss+1;
		} else if ( (dan / 10) % 10 == answer1){
			bb = bb + 1 ;
		} else if ( (dan % 10) == answer1){
			bb = bb + 1;
		} else {
			oo = oo + 1;
		}
		
		if ( dan / 100 == answer2){
			bb = bb + 1 ;
		} else if ( (dan / 10) % 10 == answer2){
			ss = ss+1;
		} else if ( (dan % 10) == answer2){
			bb = bb + 1;
		} else {
			oo = oo + 1;
		}
		
		if ( dan / 100 == answer3){
			bb = bb + 1 ;
		} else if ( (dan / 10) % 10 == answer3){
			bb = bb + 1;
		} else if ( (dan % 10) == answer3){
			ss = ss+1;
		} else {
			oo = oo + 1;
		}
		
		System.out.println(ss+" 스트라이크");
		System.out.println(bb+" 볼");
		System.out.println(oo+" 아웃");
		
	}
}