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
        System.out.println(); // 受付確認

        List<List<String>> list = new ArrayList<>(); // 与えられた文字列のリスト
        for (int i = 0; i < H; i++) {
          String str = sc.nextLine();
          String array[] = str.split(" ");
          list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
        }
        // System.out.println(list); // 文字列の確認

        
        
        // while (ite.hasNext()) {
        //     if (vowels.contains(ite.next())) {
        //         ite.remove();
        //     }
        // }
        // // ↑strList.removeIf(vowels::contains); に書き換え可能
        
        // // 母音を覗いた文字列の出力
        // for (String str : strList) {
        //     System.out.print(str);
        // }

    }
}