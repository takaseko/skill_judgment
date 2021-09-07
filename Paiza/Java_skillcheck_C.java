// 参照：Pzaラーニング

// 1 C084
package com.pza;

import java.util.Scanner;

public class C084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        // 与えられた文字列の長さ
        int charLength = line.split("").length;

        StringBuilder sb = new StringBuilder();
        // 上段、下段に出力する枠の生成←文字列+2
        for(int i = 0; i < charLength + 2; i++) {
            sb.append("+");
        }

        // 上段
        System.out.println(sb.toString());
        // 中断 与えられた文字列の先頭と末尾に+を足す
        System.out.println("+" + line + "+");
        // 下段
        System.out.println(sb.toString());
    }
}