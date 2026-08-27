import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       char[] chars=s.toCharArray();
       System.out.println(new String(chars));
       int left=0;
       int rigth=s.length()-1;
       while (left<rigth) {
        char temp=chars[left];
        chars[left]=chars[rigth];
        chars[rigth]=temp;
        left++;
        rigth--;
       }
       System.out.println(new String(chars));
    }
}
