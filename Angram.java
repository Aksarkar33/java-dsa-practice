import java.util.HashMap;

public class Angram {
    public static void main(String[] args) {
    System.out.println(isAnagram("listen", "silent"));  // expect true
    System.out.println(isAnagram("rat", "car"));         // expect false
}
    public static boolean isAnagram(String s,String t){
        if (s.length()!=t.length()) {
            return false;
        }
        HashMap <Character,Integer> count=new HashMap<>();
        for(char c : s.toCharArray()){
            if (count.containsKey(c)) {
                count.put(c,count.get(c)+1);
            }else{
                count.put(c, 1);
            }
        }
        for(char c : t.toCharArray()){
            if (!count.containsKey(c)||count.get(c)==0) {
                return false;

            }else{
                count.put(c,count.get(c)-1);
            }
        }
        return true;
    }
}
