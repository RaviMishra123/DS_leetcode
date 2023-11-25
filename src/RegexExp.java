import java.util.Scanner;

public class RegexExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String patt = sc.next();

        boolean matchers = ismatch(str,patt);
        System.out.println(matchers);
    }

    static boolean ismatch(String str, String patt){
        if (!patt.contains(".") && !patt.contains("*")) {
            if(str.equals(patt))
                return true;
            return false;
        }
        //logic implementation in case of pattern contains . or *
        return true;
        }
}
