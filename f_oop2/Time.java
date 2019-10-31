package f_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
		if (0 < hour && hour < 24){
			this.hour = hour;
		} else if ( 23 < hour){
			this.hour = 23;
		} else if ( hour < 0 ){
			this.hour = 0;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
		if (0 < minute && minute < 60){
			this.minute = minute;
		} else if ( minute < 0){
			this.minute = 0;
		} else if ( 59 < minute){
			this.minute = 59;
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		this.second = second;
		if (0 < second && second < 60){
			this.second = second;
		} else if ( second < 0 ){
			this.second = 0;
		} else if ( 59 < second ){                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			this.second = 59;
		}
	}
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}