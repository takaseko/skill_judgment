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

// 9 Chapter09 整数を受け取る
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String text = scan.next();
//         System.out.println(text);
//         int number = scan.nextInt();
//         System.out.println(number * 10);
//         System.out.println("おこづかい"+ number + "円");
//     }
// }

// 9_1 整数データを受け取る
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         System.out.println(number);    // 120 -> 120
//     }
// }

// 9_2 受け取っったデータで計算する
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         System.out.println(number * 10);    // 120 -> 1200
//     }
// }

// 9_3 文字列と整数データを連結する
// ・文字列と整数をプラス記号で結ぶと、整数データを文字列に自動的に変換してから、連結する。
// public class Main {
//   public static void main(String[] args) {
//       int number = 120;
//       System.out.println("おこづかい" + number + "円");    // おこづかい：120円
//   }
// }

/* 10 Chapter10 標準入力と標準出力
・標準入力と標準出力は、多くの OS やプログラム実行環境が持っている機能
・プログラムは、標準入力からデータを受け取って、標準出力にデータを渡します。
・標準入力と標準出力は、この受け渡し先をプログラムの実行時に指定できる */

/* 11 Chapter11 条件に一致したら処理を実行する
import java.util.*;
public class Java_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);
        if (number == 10){
            System.out.println("Welcome");
        }
    }
}

11_1 ポイント
・条件を表す「==」のような記号のことを「関係演算子」と呼びます

11_2 ifの基本形
・受け取った整数データが 10 だったら、Welcome と表示します。
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);

        if (number == 10) {
            System.out.println("Welcome");
        }
    }
}

11_3 等しいか等しくないか判定
文字列・数値が一致しているか判定する関係演算子
==  等しい。代入と区別する    a == b
!=  等しくない  a != b

11_4 数値の大小を比較する
・数値を大小を判定するる関係演算子
> 大なり    a > b   aはbより大きい。範囲にbを含まない
< 小なり    a < b   aはbより小さい。範囲にbを含まない
>= 以上     a >= b  aはb以上。範囲にbを含める
<= 以下     a <= b  aはb以下。範囲にbを含める
18歳より大きい：    18歳は含まれない
18歳以上：    18歳も含まれる */

/* 12 Chapter12 条件に合わせて処理を変える
・if を使って、さらに複雑な処理をおこないます。
・if のコードに、条件が成立しなかった場合のコードを追加。
・複数の条件を追加
import java.util.*;
public class Java_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);
        if (number == 10) {
            System.out.println("Welcome");
        } else if (number > 10) {
          System.out.println("Good morning");
        } else {
          System.out.println("Goodbye");
        }
    }
}

12_1 elseの基本形
・条件が成立しなかった場合に、「Goodbye」と表示します
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);
        if (number == 10) {
            System.out.println("Welcome");
        } else {
            System.out.println("Goodbye");
        }
    }

12_2 else if を追加する
・さらに、変数 number が 10 より大きい場合、「Good morning」と表示します
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);
        if (number == 10) {
            System.out.println("Welcome");
        } else if (number > 10) {
            System.out.println("Good morning");
        } else {
            System.out.println("Goodbye");
        }
    }
<<<<<<< HEAD:Paiza/Java_1.java
} */ 

/* 13 Chapter13 文字列の一致を判定する
・受け取った文字データが、指定の文字列と一致しているかどうか、if で判定するプログラムを作成。
・文字列を条件にするときは、equals メソッドを使います。

13_1 文字列が一致しているか判定する
・受け取った文字列が Java だったら、Welcome と表示する
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
        if (name.equals("Java")) {
            System.out.println("Welcome");
        }
    }
}

13_2 else ifとelseを追加する
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
        if (name.equals("Java")) {
            System.out.println("Welcome");
        } else if (name.equals("JAVA")) {
            System.out.println("Good morning");
        } else {
            System.out.println("Goodbye");
        }
    }
} */

14 Chapter14 同じ処理を何度も繰り返す
public class Java_1 {
    public static void main(String[] args) {
        String greeting = "Hello paiza";
        
        for (int i = 0; i < 5; i++) {
            System.out.println(greeting + ":" + i);
        } 
    }
}

14_1 forの基本形
・初期値 i = 0;
・繰り返し条件 i < 5;
・変化分 i++
public class Main {
    public static void main(String[] args) {
        String greeting = "Hello paiza";
        for (int i = 0; i < 5; i++) {
            System.out.println(greeting);
        }
    }
}

14_2 カウンタ変数を表示する
public class Main {
    public static void main(String[] args) {
        String greeting = "Hello paiza";

        for (int i = 0; i < 5; i++) {
            System.out.println(greeting + ":" + i);
        }
    }
}