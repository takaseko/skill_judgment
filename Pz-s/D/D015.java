package D;
import java.util.Scanner;

public class D015 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int n = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得する
    sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り

    
    for (int i = n; 1 <= i; i--) {
      System.out.println(i);  // 結果を出力
    }    
  }
}