/* 参照：Piazaラーニング
Java入門編1：プログラミングを学ぶ

1 chapter01_Javaとは？

2 chapter02_Javaでプログラムを書いてみよう

public class Java_2 {
	public static void main(String[] args) {
		System.out.println("グッドモーニング")
	}
}

2_1 間違いやすいポイント
・末尾のセミコロン忘れ。
・カッコやダブルクォーテーションが全角文字になっている。
・メソッドが、全て半角小文字で記述されていない。（× Println、○ println）
・ただし、System.outの先頭は、大文字にする。

2_2 メソッドとは
Javaでは、この「println」のような命令を「メソッド」と呼んでいます。
プログラミングでは、「println」のようなメソッドで、コンピュータに対して動作を指示していきます。「println」と書くと、文字を表示するのだなとJavaが理解して、そのとおり動いてくれるのです。
プログラミング言語は、このようなメソッドをたくさん持っています。各メソッドがどのように動作をするか、プログラミング言語ごとに決まっています。*/

// 3 Chapter03_コメントでプログラムを見やすく！
// // コメントを入力する
// public class Main { //メインクラス
// 	public static void main(String[] args) {
// 		System.out.println("hello world1");//文字を表示
// 		/*System.out.println("hello world2");
// 		System.out.println("hello world3");*/
// 	}
// }

// 3_1 コメントアウトの方法
// ・Javaでは、「//」から行末までがコメントになる
// ・複数の行をコメントアウトするときは、コメント行の先頭に「/*」を、末尾に「*/」を記述 */

/*4 Chapter04_HTMLを表示してみよう 
4_1 文字データの呼び方
・プログラムでは、文字データのことを「テキスト」「文字列」(もじれつ)「String」(ストリング/ストリングス)と呼ぶことがある

4_2 
// HTMLを表示する
public class Main {
	public static void main(String[] args) {
			System.out.print("<h1>hello world</h1>");
			System.out.print("<p>世界の皆さん、");
			System.out.print("<b>こんにちは</b></p>");
	}
}*/

/*5 Chapter05_変数を使えるようになろう
 変数を使う
public class Main {
	public static void main(String[] args) {
	    String player = "勇者";
		System.out.println(player + "は、荒野を歩いていた");
		System.out.println(player + "は、モンスターと戦った");
		System.out.println(player + "は、モンスターをたおした");
	}
}

4_1 変数の名前のつけ方
・変数の名前は、次のルールに従って付けます。
・最初の1文字目：英文字または、「_」(アンダーバー)、「$」
・2文字目以降：英文字・数字「_」(アンダーバー) 、「$」
・変数名の例：○ player 1文字目が、英小文字
・◯ Player 1文字目が、英大文字
・○ _weapon 1文字目が、「_」(アンダーバー)
・○ player01 2文字目以降に数字
・× 1player 1文字目に数字は使えない
・また、Javaは、予約語(キーワード)と呼ばれる単語が決まっており、この予約語は変数名に利用できません。例えば、「public」や「class」といった単語が予約語になっています。

4_2 変数の宣言
・変数を使うとき、最初にデータの種類を指定して宣言する必要があります。
String player = "勇者"; // 文字列データの変数
int number = 3; // 整数データの変数
・Stringの頭文字は大文字にします。intは、すべて小文字です。
・2回目以降、変数にデータを代入する時には、データの種類の指定は不要です。

4_3 文字列と変数を連結する方法
変数と文字列は、「+」記号で連結できます。

player = "戦士"
print(player + "は、荒野を歩いていた")*/

/*6 Chapter06_サイコロを作ろう
// 数の表示とサイコロ
public class Main {
	public static void main(String[] args) {
		double rand = Math.random() * 100 + 1;
		//System.out.println(rand);
		int number = (int)rand;
		//System.out.println(number);
		System.out.println("スライムが" + number + "匹あらわれた");
	}
}

 6_1 メソッドとは
メソッドとは、Javaが持つ特別な機能を呼び出す方法です。
prinlnメソッドやrandomメソッドのように、便利なメソッドが多数用意されています。
メソッドの例：
・System.out.println(data) ：指定したデータを出力する（改行あり）
・System.out.print(data) ：指定したデータを出力する（改行なし）
・Math.random() ：0から1までのランダムな数値を出力する

6_2 double型とは
double型は、小数点以下の数値を扱うことのできるデータ型です。
int型と同様に、多くの場面で使用されています。

6_3 型変換とは
型変換はキャストとも呼ばれる、プログラミングにおけるテクニックの一つで、
例えばdouble型のデータをint型のデータにするときに使われます。
double型のデータをint型のデータにする際には小数点以下が切り捨てられます。
型変換の例：
(int)60.5 ：60.5というdouble型の値を、60というint型の値として取り出す。

6_4 引数とは
メソッドの引数(ひきすう)とは、メソッドに与えるデータです。引数は、メソッドに続くカッコの中に記述します。複数の引数がある場合は、「,」(コンマ)で区切ります。
引数の例：
System.out.println(data) ：dataを引き数として出力する（改行あり）

6_5 戻り値とは
メソッドの戻り値(もどりち)とは、メソッドの処理結果のデータのことです。返り値と呼ぶ場合もあります。
Math.random()というメソッドを呼び出すと、0から1の間のランダムな数値が戻り値となります。*/

 /* 7 Chapter07_演算子で計算してみよう
public class Main {
	public static void main(String[] args) {
		int number = 100;
		System.out.println((5 + 6) * number);
	}
}

7_1 基本的な算術演算子
+ 足し算 6 + 2 # 8
- 引き算 6 - 2 # 4
* 掛け算 6 * 2 # 12
/ 割り算 6 / 2 # 3
% 余り 6 % 4 # 2

7_2 計算の優先順位
優先順位1 ( )
優先順位2｜ * / %
優先順位3 低い + - */

/* 8 Chapter08_値段を計算してみよう
オンラインショッピングのように、単価と個数に応じて合計金額を計算するプログラムを作成
// 値段を計算する
public class Main {
	public static void main(String[] args) {
		int apple_price = (int)(Math.random() * 3 + 1) * 100; //リンゴの単価
		int apple_num = (int)(Math.random() * 10 + 1); //リンゴを買う数
		System.out.println("りんごの単価" + apple_price + "円");
	    System.out.println("りんごを買う数" + apple_num + "個");
	    int total = apple_price * apple_num;
	    System.out.println("合計金額" + total + "円");
	}
} */

/*9 Chapter09_データの型を覚えよう 
// データの種類
public class Main {
	public static void main(String[] args) {
		int number = 100 + 30;	// 数値
		String text = "ハロー" + "paiza";	// 文字列
		System.out.println(number); //数値
		System.out.println(text); //文字列
		System.out.println(number + text); //文字列（連結データに違っている場合、自動的にデータを変換する）
		System.out.println(number + 20); //数値
	}
}

9_1 種類
・String型：文字列
・int型：数値 */