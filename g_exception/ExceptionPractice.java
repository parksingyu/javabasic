package g_exception;

import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		ExceptionPractice Ex = new ExceptionPractice();
		Scanner sc = new Scanner(System.in);
		Ex.try1();

	}
	
	void try1(){
		Scanner sc = new Scanner(System.in);
		System.out.print ("숫자를 입력하세요 : ");
		try{
			int a = sc.nextInt();
			System.out.println("입력 받은 값 : " + a);
		} catch(Exception e){ //모든 예외의 부모클래스
			System.out.println("잘못된 값입니다. 숫자를 입력하세요");
			try1();
		}
		sc.close();
	}
}
