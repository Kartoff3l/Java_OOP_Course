import java.util.Scanner;
class leapYearCheck {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check: ");
        year = scanner.nextInt();

        boolean isLeap = isLeapYear(year);
        System.out.println("Is "+year+" leap year ?");
        System.out.println(isLeap);
    }

    public static boolean isLeapYear(int year){
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        if(year % 4 == 0) return true;
        return false;
    }
}