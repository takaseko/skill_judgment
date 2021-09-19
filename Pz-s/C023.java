import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C023 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String winN = sc.nextLine(); // 1行目：くじの当選番号
      int N = sc.nextInt(); // 2行目：自分が購入したくじの枚数
      sc.nextLine();

      List<String> winNumList = Arrays.asList(winN.split(" "));// クジの当選番号をリストにする
      List<List<String>> list = new ArrayList<>(); // 与えられた文字列のリスト
      for (int i = 0; i < N; i++) {
        String str = sc.nextLine();
        String array[] = str.split(" ");
        list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
      }

      // System.out.println(list);

      for (List<String> list2 : list) {
        int count = 0;
        for (String num : list2) { // 
          if (winNumList.contains(num)) {
            count++;
          }
        }
        System.out.println(count);
      }
//       sc.nextLine(); //改行 nextLine()メソッドで入力した値を1行読み取り

  }
}