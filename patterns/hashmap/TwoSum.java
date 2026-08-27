import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complement = tar - arr[i];

            if (seen.containsKey(complement)) {
                System.out.println("[" + seen.get(complement) + ", " + i + "]");
            }seen.put(arr[i], i);
        }
    }
}
