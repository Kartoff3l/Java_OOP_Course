import java.util.*;
class additionOfArrays {
    public static void main(String[] args){
        System.out.println("Enter the size of arrays: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        System.out.println("Enter "+n+" elements of array A: ");
        for(int i = 0; i < n; ++i){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter "+n+" elements of array B: ");
        for(int i = 0; i < n; ++i){
            B[i] = sc.nextInt();
        }

        for(int i = 0; i < n; ++i){
            C[i] = A[i] + B[i];
        }
        System.out.print("Array C: ");
        for(int i = 0; i < n; ++i){
            System.out.print(C[i] + " ");
        }
    }
}