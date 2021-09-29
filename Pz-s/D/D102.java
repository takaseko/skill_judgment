package D;
import java.util.Scanner;

public class D102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int N = sc.nextInt(); //区間数N nextInt()メソッドで数値として取得する →変数nへ代入
        sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り
          
        for (int i = 0; i < 1; i++) {
        System.out.println(100 + (N * 10));  //初乗り100円 + 区間数Nの結果を出力
      }    
    }
  }