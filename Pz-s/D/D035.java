package D;
import java.util.Scanner;

public class D035 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int y = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得
    int m = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得
    int d = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得
    sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り
      
    System.out.println(y + "/" + m + "/" + d);  // 結果を出力 
  }
}