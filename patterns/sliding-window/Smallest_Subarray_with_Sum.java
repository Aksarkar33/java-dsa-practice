import java.util.Scanner;

public class Smallest_Subarray_with_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left=0;
        int right=0;
        int target=sc.nextInt();
        int currentSum=0;
        int currentLenght=0;
        while (right<arr.length) {
            
            currentSum=currentSum+arr[right];

            while (currentSum>=target) {
                int windowLenght= right-left+1;
                if (currentLenght==0 || windowLenght<currentLenght) {
                    currentLenght=windowLenght;
                }
            
                currentSum=currentSum-arr[left];
                left=left+1;
            }
            right=right+1;
        }
        System.out.println("Smallest lenght is "+currentLenght);
    }
}
