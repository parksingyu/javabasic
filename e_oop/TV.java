package e_oop;

import java.util.Scanner;

public class TV {

	public static void main(String[] args) {
		
		TV ttv = new TV();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			System.out.println("입력하세요");
			System.out.println("1. 전원상태 변경 / 2. 채널 up / 3. 채널 down / 4. 볼륨 up / 5. 볼륨 down ");
			int a = scanner.nextInt();
			if ( a == 1 ){
				System.out.println("전원상태를 변경합니다.");
				ttv.power();
			} else if(a==2){
				ttv.channelUp();
				System.out.print("전원상태 : " + ttv.power+" / ");
				System.out.print("현재 채널"+ ttv.channel+" / ");
				System.out.println("현재 볼륨"+ ttv.volume);
			} else if(a==3){
				ttv.channelDown();
				System.out.print("전원상태 : " + ttv.power+" / ");
				System.out.print("현재 채널"+ ttv.channel+" / ");
				System.out.println("현재 볼륨"+ ttv.volume);
			} else if(a==4){
				ttv.volumeUp();
				System.out.print("전원상태 : " + ttv.power+" / ");
				System.out.print("현재 채널"+ ttv.channel+" / ");
				System.out.println("현재 볼륨"+ ttv.volume);
			} else if(a==5){
				ttv.volumeDown();
				System.out.print("전원상태 : " + ttv.power+" / ");
				System.out.print("현재 채널"+ ttv.channel+" / ");
				System.out.println("현재 볼륨"+ ttv.volume);
			} else if (a==0){
				break;
			}
		}
	}

	//TV를 대상으로 가능한 TV와 비슷하게 TV 클래스를 만들어주세요.
	boolean power;
	int channel;
	int volume;

	TV(){
		power = false;
		channel = 11;
		volume = 10;
	}
	void power(){
		power = !power;  //전원이 켜져있을때는 꺼지고 꺼져있을때는 켜지고
		//System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}

	void channelUp(){
		if (power && channel < 100){
			channel++;
		}
	}
	
	void channelDown(){
		if (power && channel > 1){
			channel--;
		}
	}
	
	void volumeUp(){
		if (power && volume < 100){
			volume++;
		}
	}
	
	void volumeDown(){
		if (power && volume > 0){
			volume--;
		}
	}
}