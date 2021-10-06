package D;
import java.util.Scanner;

public class D027 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int n = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得
    sc.nextLine();  //nextLine()メソッドで1行読み取り
    
    int sum = 0; // 合計

    // for分で処理をn回数繰り返して足す
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println(sum);  //結果を出力  
  }
}