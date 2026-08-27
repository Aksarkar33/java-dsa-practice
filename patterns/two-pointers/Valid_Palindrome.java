import java.util.Scanner;

public class Valid_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word = sc.nextLine();
        
        char[] letters = word.toCharArray();
        
      //  System.out.println(java.util.Arrays.toString(letters)); 
        
        int left=0;
        int right=letters.length-1;
        boolean isPalindrome = true;
        while(left<right){
            if (letters[left]!=letters[right]) {
                isPalindrome=false;
                break; 
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println('"' + word + '"' + " is a palindrome.");
        }else{
            System.out.println('"'+word+'"'+" is not palindrome");
        }
    }
}
