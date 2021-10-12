package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class C074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int H = sc.nextInt(); // 高さ（変更前）
        int W = sc.nextInt(); // 横幅（変更前）
        int X = sc.nextInt(); // 横幅（変更後）
        sc.nextLine(); // 改行
        // System.out.println(); // 受付確認

        // 与えられた文字列のリスト
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            String[] input = sc.nextLine().split("");
            List<String> tmpList = new ArrayList<>(Arrays.asList(input)); //配列をリストへ変換したものをadd（追加）する
            strList.addAll(tmpList); // リストへ格納した複数行の文字列を、1つの文字列へ変換
            // System.out.println(strList); リストの確認
        }

        // 変更後の横幅(X)で繰り返し改行されて結果を表示
        int count = 0;
        for (String s : strList) {
            System.out.print(s);
            count++;
            if (count == X) {
                System.out.println();
                count = 0;
            }
        }
    }
}

        // 自分
        // List<List<String>> list = new ArrayList<>(); // 与えられた文字列のリスト
        // for (int i = 0; i < H; i++) {
        //   String str = sc.nextLine();
        //   String array[] = str.split(" ");
        //   list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
        // }
        // System.out.println(list); // 文字列の確認
//     }
// }