
import java.util.Scanner;

public class Factorial {



    public static int fact(int n){
        if (n==0) {
            return 1;
        }
        if (n==1) {
            return 1;
        }
      

        int result=fact(n-1)*n;
     
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();

        System.out.println("Fatorial("+n+") = "+fact(n));

        sc.close();
    }
}
