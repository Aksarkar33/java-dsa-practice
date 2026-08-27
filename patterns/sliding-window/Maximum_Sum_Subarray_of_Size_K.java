import java.util.Scanner;

public class Maximum_Sum_Subarray_of_Size_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int windowSum = 0;
        for (int j = 0; j < k; j++) {
            windowSum += arr[j];
        }
        int max = windowSum;

        for (int i = 1; i < n - (k - 1); i++) {
            windowSum=windowSum-arr[i-1]+arr[i+k-1];
            if(windowSum>max){
                max=windowSum;
            }
        }

        System.out.println(max);
    }
}