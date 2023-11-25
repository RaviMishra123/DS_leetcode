import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordBeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<String> dict = new HashSet<>() {{
             add("leet");
             add("code");
            }};
        System.out.println(wordBreak(str,dict));
    }
    public static boolean wordBreak(String str, Set<String> dict){
        int count = 0;
        for(String s : dict){
            if(str.contains(s)){
                count++;
            }
        }
        if(dict.size() == count){
            return true;
        }
        else {
            return false;
        }
    }
}
