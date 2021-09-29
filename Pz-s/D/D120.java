package D;
import java.util.Scanner;

public class D120 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //値を変数listへ格納
    int n = sc.nextInt(); //list全てに対して処理を繰り返す
    sc.nextLine();   //N変数にlist取得結果を代入
    System.out.println(n * 12);  //Nに1ダース12本掛ける
    }
}