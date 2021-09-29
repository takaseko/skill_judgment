package D;
import java.util.Scanner;

public class D067 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int n = sc.nextInt(); //数値として取得
    sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り

      if (n % 2 == 0) {
        System.out.println("OFF");
      } else {
        System.out.println("ON");  //結果を出力 
      }
  }
}