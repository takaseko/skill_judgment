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

// 1 C016
package com.pza;
​
import java.util.*;
​
public class C016 {
    public static void main(String[] args) {
        // replace
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
​
        line = line.replace("A", "4");
        line = line.replace("E", "3");
        line = line.replace("G", "6");
        line = line.replace("I", "1");
        line = line.replace("O", "0");
        line = line.replace("S", "5");
        line = line.replace("Z", "2");
​
        System.out.println(line);
​
        // Map
//        Map<String, String> map = new HashMap<>();
//        map.put("A", "4");
//        map.put("E", "3");
//        map.put("G", "6");
//        map.put("I", "1");
//        map.put("O", "0");
//        map.put("S", "5");
//        map.put("Z", "2");
//
//        Scanner sc = new Scanner(System.in);
//        String[] line = sc.nextLine().split("");
//
//        List<String> result = new ArrayList<>();
//        for (String s : line) {
//            if (map.containsKey(s)) {
//                result.add(map.get(s));
//            } else {
//                result.add(s);
//            }
//        }
//        System.out.println(String.join("", result));
    }
}
