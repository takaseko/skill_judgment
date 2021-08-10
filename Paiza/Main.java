// 参照：Piazaラーニング
// Java体験編1：Javaをはじめよう

// 1_1 Chapter01 プログラミングとは
// ・プログラムとはコンピュータを制御するプログラムを作ること
// ・ソースコード：プログラミングの記述内容
// ・プログラミング言語：ソースコードを記述する専用言語

// 1_2 Javaの特徴
// ・オブジェクト指向プログラミング言語
// ・高品質で大規模なプログラムを開発に向く
// ・スマートフォンアプリから企業システムまで、幅広い環境で利用
// ・ライブラリや学習教材が充実している
// ・プログラムの動作に合わせた多数のおまじないが登場
// ・はじめのうちは、分かるところだけ書き換える

// 2_1 Chapter02 はじめてのプログラミング
// public class Java_1 {
//   public static void main(String[] args) {
//       System.out.println("Good morining");
//       System.out.println("良い天気");
//   }
// }

// 2_2 ソースコード解説
// ・{}の下のコードは字下げしている→字下げのことをインデントと呼ぶ
// ・プログラムでは、命令を使って、コンピュータに動作を指示します
// ・System.out.println は、データを表示する命令です。この命令をメソッドと呼びます
// ・カッコで指定するデータを「引数」と呼びます
// ・表示する文字データをダブルクォーテーションで囲みます
// ・メッセージを変える場合は""の中の記述を変える
// ・メッセージを2行表示したい場合は、System.out.println("◯◯◯");を2行記述する（優先順位は上から表示）
// ・メッセージを日本語に変えることも可能
// ・Javaでは表示するメッセージのことを"文字列"と呼びます（文字が繋がって列になっているため）

// 3 Chapter03 間違いやすいポイント
// public class Java_1 {
//   public static void main(String[] args) {
//       System.out.println("Hello world");
//       System.out.println("Hello world");
//   }
// }
// 3_1 間違えを見つけるヒント
// ・エラー文にヒントの記述がある
// ・ソースコード内の色が通常の色と変わっている
// ・セミコロンを忘れている（Javaでは文の区切りを行末のセミコロン「;」で判断しているため）
// ・セミコロンとコロンを間違える
// ・文字列のダブルクオーテーションを忘れる「" "」
// ・記合の間違い（{}、[]、()）など
// ・半角、全角間違い（特にスペースは視覚的に分かりづらいので注意）
// ・ダブルクオーテーション内では全角は使用できるが、それ以外で使えないので注意

/* 4 Chapter04 コメントを書く
Javaで練習
  ここまでコメント
public class Java_1 {
  public static void main(String[] args) {
      System.out.println("Hello world"); //表示する
      // System.out.println("Hello paiza"); 
  }
} */

/* 4_1 ポイント
・先頭にコメント：コードの前に「//」
・複数行にまたがったコメント：文の先頭に"/*"、文の最後に"*/
// ・うしろにコメント：コードの後ろに「//」
// ・コメントアウト：コードの前に「//」
// ※「" "」ダブルクオーテーションの間に「//」を入れても、文字列として認識されてしまうため注意
// ※コメントは自分たちがどのような記述をしたのかを書いておくために必要 */

/* 5 Chapter05 数値と文字列の違い 
public class Java_1 {
  public static void main(String[] args) {
      System.out.println("Hello world"); 
      System.out.println("100 + 30"); 
  }
}

5_1 ポイント
・printlnは数値も表示できる
・ダブルクオーテーションなしで記述すると、数値として扱われ、計算することができる
・プログラミングでは、ダブルクォーテーションのあり無しで、文字列か数値か判断します。計算式をダブルクォーテーションで囲むと、文字列として扱います。*/

/* 6 Chapter06 プログラムで計算する
public class Java_1 {
  public static void main(String[] args) {
    System.out.println((100 + 30) * 2);
  }  
}

6_1 ポイント
・「+：足し算」、「-：引き算」、「*：掛け算」、「/：割り算」
・式は、複数の演算子を使うことができます。複数の演算子がある場合は、左から順番に計算していきます。
・掛け算や割り算は、足し算や引き算より先に計算。
・カッコがあると、その中を先に計算。 */

/* 7 Chapter07 変数にデータを入れる
public class Java_1 {
  public static void main(String[] args) {
    System.out.println("Hello world");
  }  
}

7_1 ポイント
・変数：データの入れ物
・変数名：入れ物の名前
・変数名でデータを操作できる
・Java では、データ型(データの種類)ごとに変数を定義する
・変数にテキストを代入して表示
・変数で何度でもデータを利用できる
・文字列を変えると、すべての出力が変わる
・整数を扱う変数
・1 文字目 ：アルファベット、アンダーバー
・2 文字目以降 ：アルファベット、アンダーバー、数字
・大文字と小文字を区別する
・println などの命令をあらわすキーワードは使用できない
・慣習として、日本語(全角)で書かない
・まずは、すべて小文字で変数名を付けよう */

/* 8 Chapter08 文字列を受け取る
※1行目でデータを受けとる機能をプログラムの中で簡単に扱えるようにしている
import java.util.*;
  public class Java_1 {
      public static void main(String[] args) {
          ※変数scanで、データを受けとる機能を割り当てている
          Scanner scan = new Scanner(System.in);
          ※scanが持っているnextという入力データを読み込むメソッドを呼びだしている
          String text = scan.next();
          ※入力タブの文字列データを受け取って、文字列型の変数textに代入している
          System.out.println("Hello" + text);
      }
  }

8_1 入力タブから文字列データを受け取る
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        System.out.println(text);
    }
}

8_2 文字列同士を連結する
public class Main {
  public static void main(String[] args) {
      String text = "paiza";
      System.out.println("Hello " + text);    // Hello paiza
  }
} */