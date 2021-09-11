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

// 1 C086
import java.util.*;
​
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine(); //変換する前の値
      
      List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"); // 母音のリスト
      List<String> strList = new ArrayList<>(Arrays.asList(s.split(""))); // 与えられた文字列をArrayListに変換
      Iterator<String> ite = strList.iterator(); // iteratorに変換
      
      while (ite.hasNext()) {
          if (vowels.contains(ite.next())) {
              ite.remove();
          }
      }
      // ↑strList.removeIf(vowels::contains); に書き換え可能
      
      // 母音を覗いた文字列の出力
      for (String str : strList) {
          System.out.print(str);
      }
    }
}

// 1 C056_1

public class C056 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); // 学生の人数
          int m = sc.nextInt(); // 合格点
          sc.nextLine(); // 改行

          List<List<Integer>> list = new ArrayList<>(); // 入力を一時的に保持するList
          // 学生の人数の数だけ処理を繰り返す。
          for (int i = 0; i < n; i++) {
              String[] array = sc.nextLine().split(" "); // 入力例: 80 11 → {"80", "11"}に変換
              // 配列の中身はString型なので、intに変換してListに格納する。
              List<Integer> tmpList = new ArrayList<>(); 
              tmpList.add(Integer.parseInt(array[0])); // テストの点数
              tmpList.add(Integer.parseInt(array[1])); // 欠席回数
              list.add(tmpList);
          }
          
          // 結果の出力
          // 入力を一時的に保持するList全件に対して処理を繰り返す。
          for (int i = 0; i < list.size(); i++) {
              int score = list.get(i).get(0); // テストの点数
              int absenceCount = list.get(i).get(1); // 欠席回数
              int finalScore = score - (absenceCount * 5); // 最終的な点数 テストの点数 - (欠席回数 * 5)
              if (finalScore < 0) {
                  // 最終的な点数が0未満(マイナス)の場合は0点とする。
                  finalScore = 0;
              }
              // 最終的な点数が合格点m 以上の場合
              boolean isPassed = m <= finalScore;
              if (isPassed) {
                  // 学籍番号を出力する(index + 1)
                  System.out.println(i + 1);
              }
          }
      }
}

C056_2 List<Data>みたいな形でclassに格納された状態で処理する方法

package com.paiza.paiza_c;
​
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
​
class Data {
    Integer id;
    Integer score;
    Integer absenceCount;
​
    public Integer getId() {
        return id;
    }
​
    public void setId(Integer id) {
        this.id = id;
    }
​
    public Integer getScore() {
        return score;
    }
​
    public void setScore(Integer score) {
        this.score = score;
    }
​
    public Integer getAbsenceCount() {
        return absenceCount;
    }
​
    public void setAbsenceCount(Integer absenceCount) {
        this.absenceCount = absenceCount;
    }
}
​
public class C056_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
​
        List<Data> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] array = sc.nextLine().split(" ");
            Data tempData = new Data();
            tempData.setId(i + 1);
            tempData.setScore(Integer.parseInt(array[0]));
            tempData.setAbsenceCount(Integer.parseInt(array[1]));
            list.add(tempData);
        }
​
        for (Data data : list) {
            int score = data.getScore();
            int absenceCount = data.getAbsenceCount();
            int finalScore = score - (absenceCount * 5);
            if (finalScore < 0) {
                finalScore = 0;
            }
            boolean isPassed = m <= finalScore;
            if (isPassed) {
                System.out.println(data.getId());
            }
        }
    }
}

C019（完全数とほぼ完全数）
package com.paiza.paiza_c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();

        // 与えられた整数のリスト
        List<Integer> givenNumList = new ArrayList<>(); // ← [28, 16, 777]
        for (int i = 0; i < q; i++) {
            givenNumList.add(Integer.parseInt(sc.nextLine()));
        }

        for (Integer givenNum : givenNumList) {
            getResult(givenNum);
        }
    }

    private static void getResult(Integer num) {
        // 与えられた整数の約数を格納するリスト ← 確認用
        List<Integer> divisor = new ArrayList<>();
        // 自身を除いたものの和
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            // 与えられた整数 割る i の余りが0の場合
            if (num % i == 0) {
                divisor.add(i);
                if (i != num) {
                    sum += i;
                }
            }
        }

        if (sum - num == 0) {
            // 自身を除いたものの和 - 与えられた整数 = 0 の場合
            System.out.println("perfect");
        } else if (sum - num == -1) {
            // 自身を除いたものの和 - 与えられた整数 = -1 の場合
            System.out.println("nearly");
        } else {
            // それ以外
            System.out.println("neither");
        }
    }
}