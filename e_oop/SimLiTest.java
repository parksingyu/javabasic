package e_oop;
import java.util.Scanner;

public class SimLiTest {
	
	//9개의 질문을 9개의 메서드로 만들어주세요.
	Scanner s = new Scanner(System.in);
	
	String question = "1. 네 / 2. 아니오 -> " ;
	
	 void method1(){
		 System.out.println("나는 금사빠다.");
		 System.out.print(question);
		 int a = Integer.parseInt(s.nextLine());
		 if (a==1){
			 method2();
		 } else if ( a== 2 ){
			 method4();
		 } else {
			 System.out.println("잘못된 값입니다. 처음부터 다시 입력하세요.\n");
			 method1();
		 }
	 }
	 void method2(){
		 System.out.println("연애할 때 끌려다니는 타입이다");
		 System.out.print(question);
		 int a = Integer.parseInt(s.nextLine());
		 if (a==1){
			 method5();
		 } else if ( a== 2 ){
			 method3();
		 } else {
			 System.out.println("잘못된 값입니다. 처음부터 다시 입력하세요.\n");
			 method1();
		 }
	 }
	 void method3(){
		 System.out.println("데이트 코스는 미리 짜는게 편하다");
		 System.out.print(question);
		 int a = Integer.parseInt(s.nextLine());
		 if (a==1){
			 method6();
		 } else if ( a== 2 ){
			 method5();
		 } else {
			 System.out.println("잘못된 값입니다. 처음부터 다시 입력하세요.\n");
			 method1();
		 }
	 }
	 
	 void method4(){
		 System.out.println("감정기복이 크지 않다.");
		 System.out.print(question);
		 int a = Integer.parseInt(s.nextLine());
		 if (a==1){
			 method7();
		 } else if ( a== 2 ){
			 method5();
		 } else {
			 System.out.println("잘못된 값입니다. 처음부터 다시 입력하세요.\n");
			 method1();
		 }
	 }
	 
	 void method5(){
		 System.out.println("감정 표현에 솔직한 편이다.");
		 System.out.print(question);
		 int a = Integer.parseInt(s.nextLine());
		 if (a==1){
			 method8();
		 } else if ( a== 2 ){
			 method6();
		 } else {
			 System.out.println("잘못된 값입니다. 처음부터 다시 입력하세요.\n");
			 method1();
		 }
	 }
	 
	 void method6(){
		 System.out.println("활동적인 데이트가 좋다");
		 System.out.print(question);
		 int a = Integer.parseInt(s.nextLine());
		 if (a==1){
			 method8();
		 } else if ( a== 2 ){
			 method9();
		 } else {
			 System.out.println("잘못된 값입니다. 처음부터 다시 입력하세요.\n");
			 method1();
		 }
	 }
	 
	 void method7(){
		 System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		 System.out.print(question);
		 int a = Integer.parseInt(s.nextLine());
		 if (a==1){
			 System.out.println("A타입 입니다.");
		 } else if ( a== 2 ){
			 method8();
		 } else {
			 System.out.println("잘못된 값입니다. 처음부터 다시 입력하세요.\n");
			 method1();
		 }
	 }
	 
	 void method8(){
		 System.out.println("이성친구는 존재할 수 없다");
		 System.out.print(question);
		 int a = Integer.parseInt(s.nextLine());
		 if (a==1){
			 method9();
		 } else if ( a== 2 ){
			 System.out.println("B타입 입니다.");
		 } else {
			 System.out.println("잘못된 값입니다. 처음부터 다시 입력하세요.\n");
			 method1();
		 }
	 }
	 
	 void method9(){
		 System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		 System.out.print(question);
		 int a = Integer.parseInt(s.nextLine());
		 if (a==1){
			 System.out.println("D타입 입니다.");
		 } else if ( a== 2 ){
			 System.out.println("C타입 입니다.");
		 } else {
			 System.out.println("잘못된 값입니다. 처음부터 다시 입력하세요.\n");
			 method1();
		 }
	 }
}
