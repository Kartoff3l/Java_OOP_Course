import java.util.*;
public class CharDeme {
    public static void main(String[] args) {
        char myLittleChar;
        System.out.print("Enter a character:");
        Scanner scanner = new Scanner(System.in);
        myLittleChar = scanner.next().charAt(0);
        char myBigChar = Character.toUpperCase(myLittleChar);

        System.out.println(myBigChar);
    }
}