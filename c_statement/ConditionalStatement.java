package c_statement;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 *  << if문 >>
		 *  - if     : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 *  - else if: 다수의 조건이 필요할때 if 뒤에 추가한다.
		 *  - else   : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */
		
		int a = 10;
		if(a < 100){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		if (a < 10){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		int regNo = 1; //주민등록번호 첫자리
		String gender = null; //성별
		
		if(regNo == 1) {
			gender = "남자";
		} else if (regNo ==2){
			gender = "여자";
		} else if (regNo ==3){
			gender = "남자";
		} else if (regNo ==4) {			
			gender = "여자";
		} else{ //true인 조건식이 하나도 없을때 수행된다.
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		//수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
		if (regNo == 1 || regNo == 3){
			gender = "남자";
		} else if (regNo == 2 || regNo == 4)
			gender = "여자"; // 실행 하고 싶은 문장이 한 문장일 경우 블럭 생략 가능
		else  // 수행할 내용이 한문장일 경우 블럭을 생략할 수 있다.
			gender = "확인불가";
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		// 성적에 등급을 부여하는 프로그램을 만들어보자.
		int score = 89;
		String grade = null;
		
		if(90 <= score){
			grade = "A";
		} else if ( 80 <= score && score < 90 ){
			grade = "B";			
		} else if ( 70 <= score && score < 80){
			grade = "C";			
		} else if ( 60 <= score && score < 70){
			grade = "D";			
		} else if ( score < 60){
			grade = "F";			
		} else {
			grade = "확인불가";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		
		//등급 안에서 +와 -를 나누어 보자
		score = 99;
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
			} else if(score <= 93){
				grade += "-";
			}
		} else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			} else if(score <= 83){
				grade += "-";
			}
		} else if(70 <= score){
			grade = "C";
			if(77 <= score){
				grade += "+";
			} else if(score <= 73){
				grade += "-";
			}
		} else if(60 <= score){
			grade = "D";
			if(67 <= score){
				grade += "+";
			} else if(score <= 63){
				grade += "-";
			}
		} else if(50 <= score){
			grade = "F";
		} 
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");

		/*
		 * << switch 문 >>
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 */
		
		regNo = 3;
		gender = null;
		switch(regNo){ //조건식의 연산결과는 정수와 문자열만 허용한다.
		case 1 : 
		case 3 : //조건식과 일치하는 case문 이후의 문장을 수행한다.
			gender = "남자";
			break; //break를 만나면 switch문을 빠져나간다
		case 2 : 
		case 4 : 
			gender = "여자";
			break;
		default : //if문의 else와 같은 역할을 한다.
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		score = 100;
		switch(score / 10){
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade = "F";
			break;
		default :
			grade =	"확인불가";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		
		
		//문제 1. 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요: ");
//		//int input2 = s.nextInt();
//		int input = Integer.parseInt(s.nextLine());
//
//		if ( input == 0){
//			System.out.println("입력한 숫자는 0 입니다");
//		} else {
//			System.out.println("입력한 숫자는 0 이 아닙니다. ");
//		}
//
//		switch (input){
//		case 0 :
//			System.out.println("입력한 숫자는 0 입니다. ");
//			break;
//		default :
//			System.out.println("입력한 숫자는 0 이 아닙니다. ");
//			break;
//		}
		
		//문제2. 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
//		if (input % 2 == 1){
//			System.out.println("입력한 값은 홀수입니다.");
//		} else if ( input % 2 == 0){
//			System.out.println("입력한 값은 짝수입니다.");
//		} else {
//			System.out.println("확인불가");
//		}
//		
//		switch( input % 2) {
//		case 1:
//			System.out.println("입력한 값은 홀수입니다.");
//		default:
//			System.out.println("입력한 값은 짝수입니다.");
//		}
		
		//문제3. 정수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		System.out.print("1번 숫자를 입력하세요: ");
		int input1 = Integer.parseInt(s1.nextLine());
		
		System.out.print("2번 숫자를 입력하세요: ");
		int input2 = Integer.parseInt(s2.nextLine());
		
		System.out.print("3번 숫자를 입력하세요: ");
		int input3 = Integer.parseInt(s3.nextLine());
		
		int sum = input1 + input2 + input3;
		double avg = (int) (sum / 3.0 * 10 + 0.5) / 10.0;
		String grade1 = null;
		
		if ( avg >= 90 ){
			grade1 = "A";
		} else if ( avg >= 80){
			grade1 = "B";
		} else if ( avg >= 70){
			grade1 = "C";
		} else if ( avg >= 60){
			grade1 = "D";
		} else {
			grade1 = "F";
		}
		System.out.println("총점 : " + sum );
		System.out.println("평균 : " + avg );
		System.out.println("등급 : " + grade1 );
		
	}
}