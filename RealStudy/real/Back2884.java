package real;
import java.util.Scanner;
public class Back2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int alarm = 45;

        if(minute < 45 ) {
            hour -= 1;
            minute += 60;
            minute -= alarm;
            if(hour < 0){
                hour = 23;
            }
        }
        else{
            minute -= alarm;
        }
        System.out.println(hour +" " +minute);

	}

}
