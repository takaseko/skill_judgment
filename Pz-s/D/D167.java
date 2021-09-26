package D;
import java.util.Scanner;

public class D167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int N = sc.nextInt(); // nextInt()メソッドで数値として取得
        sc.nextLine(); // 行送り
        
        //結果を出力
        if (N >= 1000) {
          System.out.println(N + 3); 
        } else {
          System.out.println(N);
        }
    }
}