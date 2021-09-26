package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C020 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt(); // 仕入れた量 nextLineメソッドで1行分の入力を取得
    int p = sc.nextInt(); // 販売した量 nextLineメソッドで1行分の入力を取得
    int q = sc.nextInt(); // 売れ残りから販売した量 nextLineメソッドで1行分の入力を取得
    String line = sc.nextLine();

    double sold1 = (double) m * p * 0.01; //販売した量（変換後）
    double sold2 = (m - sold1) * q * 0.01; //売れ残りから販売した量（変換後）

    System.out.println(m - (sold1 + sold2)); //売れ残った量を出力
      
  }
}