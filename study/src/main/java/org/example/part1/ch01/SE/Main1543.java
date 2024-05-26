import java.util.Scanner;

public class Main1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String S2 = sc.nextLine();
        int size = S.length();
        int size2 = S2.length();

        S = S.replace(S2, "");
        System.out.println((size - S.length()) / size2);
        sc.close();
    }

}
