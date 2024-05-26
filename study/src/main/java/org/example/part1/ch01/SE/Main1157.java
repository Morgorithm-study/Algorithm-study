import java.util.Scanner;

public class Main1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        boolean flag = false;
        int maxValue = 0;
        int maxIndex = 0;

        int[] alphabetArr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            alphabetArr[str.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            int compare = alphabetArr[i] - maxValue;
            if (compare > 0) {
                maxValue = alphabetArr[i];
                flag = false;
                maxIndex = i;
            } else if (compare == 0) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("?");
        } else {
            System.out.println((char) (maxIndex + 'A'));
        }

    }
}
