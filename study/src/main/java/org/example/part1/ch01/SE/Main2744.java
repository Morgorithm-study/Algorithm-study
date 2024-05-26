import java.util.Scanner;

public class Main2744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                System.out.print((char)('a' + ch - 'A'));
            else
                System.out.print((char)('A'+ch - 'a'));
        }
    }
}