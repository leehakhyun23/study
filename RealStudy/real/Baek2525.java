package real;
import java.util.Scanner;

public class Baek2525 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();
		int finish = minute + time;
		if(finish >= 60) {
			hour = hour + finish/60; 
			finish %= 60;
			if(hour >= 24) {
				hour %= 24;       
			}
		}
		System.out.println(hour + " " + finish);
	}

}
