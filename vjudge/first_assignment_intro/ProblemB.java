package vjudge.first_assignment_intro;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (word.length() > 10) {
                System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
