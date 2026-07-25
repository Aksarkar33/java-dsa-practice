import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> see=new HashMap<>();

        for(int i=0;i<n;i++){
            int now=arr[i];
            if (see.containsKey(now)) {
                see.get(now);
                System.out.println("true"+" "+arr[i]+" apeared multiple time");
            }see.put(now, i);
        }

    }
}
