import java.util.Scanner;
import java.time.DayOfWeek;
class validWeekday {
    public static void main(String[] args){
        System.out.println("What is the date today?: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        DayOfWeek day = DayOfWeek.of(x - 1);
        System.out.println(day);
    }
}