package D;
import java.util.Scanner;

public class D136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        String s = sc.nextLine(); //nextLine()メソッドで文字列として取得
        
        //substringメソッドで左から3文字目までの文字列を切り出す
        // 開始位置および終了位置は文字列のインデックス、
        // インデックス0は1文字目のため、substring(0, 3)とすることで、1文字目から3文字目までを切り出すことが可能
        String result = s.substring(0, 3); 
        System.out.print(result);  // 結果を出力
    }
}