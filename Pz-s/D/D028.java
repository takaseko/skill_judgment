package D;
import java.util.Scanner;

public class D028 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int n = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得
    sc.nextLine();  //nextLine()メソッドで1行読み取り
    
    // valueOfメソッドで数値nを文字列へ変換、かつlengthメソッドで文字列の長さを出力して変数を定義
    int valLen = String.valueOf(n).length(); 
      System.out.println(valLen);  //結果を出力  
  }
}