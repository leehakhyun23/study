package real;
import java.util.Scanner;
public class Baek2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int money;
        if(a==b && b==c){
            money = a*1000+10000;
        }
        else if(a==b || a==c || b==c){
           if(a==b){
               money = a*100+1000;
           }
           else if( a==c){
               money = a*100+1000;
           }
           else{
               money = b*100+1000;
           }
        }
        else{
            if(a>b&&a>c){
                money = a*100;
            }
            else if(b>a && b>c){
                money = b*100;
            }
            else {
                money = c*100;
            }
        }
        System.out.println(money);

	}

}
