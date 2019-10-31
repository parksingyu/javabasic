package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

	public static void main(String[] args) {
		//하나의 부모 클래스나 인터페이스를 상속받아 클래스를
		//선언함과 동시에 객체를 생성하는 클래스

		Button b = new Button();

		b.addActionListener( //----여기서부터
				new ActionListener(){
					//ActionListener를 상속받은 자식 클래스

					@Override
					public void actionPerformed(ActionEvent e){
						System.out.println("버튼 누르면 실행");
					}
				}
				); // ---여기까지 파라미터값
	}
}
