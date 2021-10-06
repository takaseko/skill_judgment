package D;
import java.util.Scanner;

public class D088 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int t = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得
    int u = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得
    sc.nextLine();  //nextLine()メソッドで1行読み取り
    
    System.out.println(t- u);  //結果を出力  
  }
}