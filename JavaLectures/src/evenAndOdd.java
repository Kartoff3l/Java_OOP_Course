import java.util.Arrays;
import java.util.Scanner;
class evenAndOdd {
    public static void main(String[] args){
        System.out.print("Input an integer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //Even numbers array
        int evenCount = (n + 1) / 2;
        int oddCount = n / 2;

        int[] evens = new int[evenCount];
        int[] odds = new int[oddCount];

        int evenIndex = 0;
        int oddIndex = 0;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                evens[evenIndex++] = i;
            }
            else{
                odds[oddIndex++] = i;
            }
        }
        System.out.println("Even: "+Arrays.toString(evens));
        System.out.println("Odd: "+Arrays.toString(odds));
    }
}