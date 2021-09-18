import java.util.Scanner;

// - D162 
public class D162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int N = sc.nextInt(); //米の重さN nextInt()メソッドで数値として取得する →変数Nへ代入 →値を1行読み取り
        sc.nextLine(); 
        
        for (int i = 0; i < 1; i++) { // for文で繰り返し処理
        System.out.println(N * 150);  // N号*150gでの米の重さの結果を出力
      }    
    }
}
