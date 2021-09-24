package D;
import java.util.Scanner;

public class D055 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    String s12 = sc.nextLine(); //nextLine()メソッドで文字列として取得する→N変数へ代入
    // sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り
    for (int i = 0; i < 1; i++) {
      System.out.println("Best in" + " " + s12);  //キャッチコピー結果を出力
    }    
  }
}