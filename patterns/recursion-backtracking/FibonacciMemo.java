import java.util.HashMap;
import java.util.Scanner;

public class FibonacciMemo {

    static HashMap<Integer,Integer> memo=new HashMap<>();

    public static int fib(int n){
        if (n==0) {
            return 0;
        }

        if (n==1) {
            return 1;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result=fib(n-2)+fib(n-1);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        System.out.println("Fibonacci("+n+") = " + fib(n));

        sc.close();
    }

}
