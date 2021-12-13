import java.util.Scanner;

public class weekendAndWeekDaysSwitch
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int day = scan.nextInt();
	      switch(day) {
        case 1 :
        case 2 :
        case 3 :
        case 4 :
        case 5 :
            System.out.println("Weekday");
            break;
        case 6:
        case 7:
            System.out.println("WeekEnd");
            break;
        }
	}
}
