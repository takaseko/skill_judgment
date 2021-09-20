import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 1行目
        sc.nextLine();
        String str = sc.nextLine(); // ai

        // 与えられた文字列のリスト
        List<String> givenStrList = new ArrayList<>(); // [pizza, paiza, aizu, ai, sai]
        for (int i = 0; i < n; i++) {
            givenStrList.add(sc.nextLine());
        }

        int count = 0;
        for (String s : givenStrList) {
            if (s.contains(str)) {
                System.out.println(s);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("None");
        }
    }
}
