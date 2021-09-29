package D;
import java.util.Scanner;

public class D189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int N = sc.nextInt(); //最初の年N nextInt()メソッドで数値として取得する →変数Nへ代入 →値を1行読み取り
        int Y = sc.nextInt(); //確認する年Y nextInt()メソッドで数値として取得する →変数Nへ代入 →値を1行読み取り
        sc.nextLine(); 
        
        for (int i = 0; i < 1; i++) { // for文で繰り返し処理
        System.out.println(Y - N);  // 何周年の結果を出力
      }    
    }
}