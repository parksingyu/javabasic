package e_oop;

import java.util.Scanner;

public class AirConditioner {

	public static void main(String[] args) {
		AirConditioner aircon = new AirConditioner();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하세요");
		System.out.println("1. 전원버튼 / 2. 온도 상승 / 3. 온도 다운 / 4. 바람세기 조절");
		
		int a = scanner.nextInt();
		
		if (a == 1){
			aircon.power();
		} else if(a == 2){
			aircon.temperatureUp();
		} else if(a == 3){
			aircon.temperatureDown();
		}else if(a == 4){
			aircon.airVolume();
		}
		
		aircon.temperatureUp();
		System.out.println(aircon.temperature);
		aircon.power();
		aircon.temperatureUp();
		System.out.println(aircon.temperature);
		aircon.temperatureDown();
		aircon.temperatureDown();
		System.out.println(aircon.temperature);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.temperatureUp();
		System.out.println(aircon.temperature);
		aircon.temperatureUp();
		System.out.println(aircon.temperature);
	}

	//온도가 18~30 까지만 변경할 수 있게 해주시고,
	//전원을 켰을때만 버튼들이 작동되도록 메서드를 변경

	boolean power;   // 전원
	int temperature; // 온도
	int airVolume;   //풍량

	AirConditioner(){
		power = false; 
		temperature = 24;
		airVolume = 1;
	}

	// 전원 버튼
	void power(){
		power = !power;  //전원이 켜져있을때는 꺼지고 꺼져있을때는 켜지고
	}

	//온도를 올리는 버튼
	void temperatureUp(){
		while(power){
			if (temperature < 30){ //30도가 되면 온도가 더이상 올라가지 않음
				temperature++;
			}
			break;
		}
		
	}
	
	

	//온도를 낮추는 버튼
	void temperatureDown(){
		if (power && temperature > 18){ //18도가 되면 온도가 더이상 내려가지 않음.
			temperature--;
		}
	}

	//풍량 버튼
	void airVolume(){
		if (power && 3 < ++airVolume){
			airVolume = 1;
		}
	}	
}







