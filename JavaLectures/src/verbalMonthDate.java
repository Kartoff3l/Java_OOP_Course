import java.util.Scanner;
import java.time.Month;
class verbalMonthDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day and month: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();

        String[] ordinals = {
                "", "first", "second", "third", "fourth", "fifth", "sixth", "seventh",
                "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth",
                "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth",
                "nineteenth", "twentieth", "twenty-first", "twenty-second", "twenty-third",
                "twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh",
                "twenty-eighth", "twenty-ninth", "thirtieth", "thirty-first"
        };

        if (month >= 1 && month <= 12) {
            Month monthObj = Month.of(month);
            int maxDaysInMonth = monthObj.length(false);

            if (day >= 1 && day <= maxDaysInMonth) {
                String monthName = monthObj.name().charAt(0) +
                        monthObj.name().substring(1);

                System.out.println("The " + ordinals[day] + " of " + monthName);
            } else {
                System.out.println("Invalid day for " + monthObj.name().toLowerCase());
            }
        } else {
            System.out.println("Invalid date input");
        }
    }
}