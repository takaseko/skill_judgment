import java.util.Scanner;

public class D038 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int N = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得する→N変数へ代入
    sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り
    for (int i = 0; i < 1; i++) {
      System.out.println(N * (N - 1) / 2);  //自分自身から見た結果と、相手側から見た結果を出力
    }    
  }
}