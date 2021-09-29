package D;
import java.util.Scanner;

public class D154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int N = sc.nextInt(); //N nextInt()メソッドで数値として取得する
        int M = sc.nextInt(); //M nextInt()メソッドで数値として取得する
        sc.nextLine(); // 行送り
        
        System.out.println(N * N - M);  // 結果を出力
    }
}