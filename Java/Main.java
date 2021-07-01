// 参照：Potepan Style
// 【Java】初心者必見！クラスについてわかりやすく解説。

// 1 カプセル化とは
// ・カプセル化とはブロックで囲むこと
// ・ブロックとは｛｝であり、このブロックで囲まれた内部の変数やメソッドは決められた一定の範囲で使いまわすことが出来る
// ・ブロックで囲む事自体はJavaでは当たり前の作業ですが、単純にブロックで囲んだだけではカプセル化とは言えない
// ・カプセル化とはあくまでも使いまわしの出来るように成形されたクラス群
// ・カプセル化をマスターすることでプログラムを再編する場合にも非常に管理しやすくなる。abstract

// 2 クラスの書き方
// ・Javaにおけるクラスとはプログラムをまとめたインスタンスを指す
// ・このクラスの中でメンバ変数を定義したり処理を実行させるメソッドを定義し、これらをいくつも組み合わせることでプログラムを実行させるというのが一般的な使い方
// （例：クラスの書き方）
// class クラス名 {
// 	メンバ変数・・・
// 	メソッド・・・
// }
// ※メンバ変数とはクラス内で使用する変数のこと
// ※メンバ変数を定義する場合には、必ずメソッドの外に記述するというルールがある

// 3 クラスの呼び出し
// ・クラスを呼び出すためには、呼び出すクラスのインスタンスを生成する必要が有る
// ・インスタンスを生成することで、そのクラス内に記述されたメンバ変数やメソッドを呼び出すことが出来るようになる
// （例：基本となる書き方）
// Main.java
// public class Main {
//   public static void main(String[] args) {
		
//     //クラスのインスタンスを生成
// 		SampleClass sample = new SampleClass();
		
// 		//SampleClass内メソッド「SampleMethod」の呼び出し
// 		sample.SampleMethod();
// 	} 
// }
 
// // SampleClass.java
// class SampleClass {
 
// 	// メンバ変数
// 	private int myAge = 30;
	
// 	// メソッド
// 	public void SampleMethod(){
 
// 		System.out.println("年齢：" + myAge + "歳");
 
// 	}
 
// }
// （実行結果）
// 年齢：30歳
// ・上記コードでは外部ファイルのSampleClass.javaに記述してあるSampleClassをMain.javaでインスタンス化し、クラス内メソッドである”SampleMethod”を呼び出している
// （例：staticを使った呼び出し方）
// ・static修飾子を使うことでインスタンスを生成することなくメンバ変数やメソッドの呼び出しが出来るようになる
//Main.java
// public class Main {
 
// 	public static void main(String[] args) {
		
// 		//SampleClass内メソッド「SampleMethod」を呼び出し
// 		SampleClass.SampleMethod();
		
// 	}
 
// }
 
// // SampleClass.java
// class SampleClass {
 
// 	// メンバ変数
// 	private static int myAge = 30;
	
// 	// メソッド
// 	public static void SampleMethod(){
 
// 		System.out.println("年齢：" + myAge + "歳");
 
// 	}
 
// }
// （実行結果）
// 年齢：30歳
// ・static修飾子を使うことで、Main.javaでインスタンス化していた部分を削除し、スッキリとしたコードになっています。
// ※staticを使ったコードの中で、メンバ変数にもstaticがついている
// ※static修飾子を使用したメソッドを利用する場合には、その中で使われる変数にもstaticを割り当てる必要が有りますので忘れないようにすること

// 4 インナークラス
// ・内部クラスと呼ばれるもので、簡単に言うとクラスの中でネストされたクラスを指す
// ・特に変わった点はありませんが、注意点としてはstaticを使用したインナークラスからは非staticな外部クラスにアクセス出来る。もっとわかりやすく言い換えるなら実質的に通常クラスと同等の扱いということになる。
// （例：インナークラスの書き方）
// class クラス名A {
//   class クラス名B {
//       実行処理...
//   {
// }
 
// 5 クラスの継承
// ・クラスの継承をすることで、継承元クラス内で定義しているメンバをそのまま他のクラスで使えるようになる
// ・継承元クラスは「スーパークラス」「親クラス」などと呼ばれ、逆に継承先クラスは「サブクラス」「子クラス」と呼ばれる
// ・継承する場合には”extends”で継承元を指定して使用
// class 親クラス名 {
//   実行処理...
// }
// class 子クラス名 extends 親クラス名 {
//   実行処理...
// }
// ※メンバとは？
// ※メンバとは、クラスで宣言されたフィールドとメソッドを指します。
// ※コンストラクタもメソッドと似たような作りですがこちらはメンバには含まれません

// 6 final修飾子
// ・クラスに”final”修飾子を使用すると、そのクラスは継承不可となる
// ・final修飾子はスーパークラスのフィールドやメソッドを変更されたくない場合に用いることで安全性を高める効果がある
// final class クラス名 {
//   実行処理...
// }

// 7 抽象クラス
// ・“abstract”修飾子がつくクラスを抽象クラスと呼びます。抽象クラスには一つ以上の中小メソッドを保持させる必要が有る
// ・抽象クラスを使う利点は、オーバーライドを強制させることが出来る点
// ・抽象クラスを継承した子クラスは抽象メソッドをオーバーライドした上で処理させる内容を記述しなければならない
// （例：抽象クラスの書き方）
// abstract class クラス名 {
//   abstract 戻り値の型名 メソッド名(引数);
// }
// （例：抽象クラスは”extends”で継承させる必要が有る為、実際のコードは以下のように記述）
// public class Main extends AbstractClass {
 
// 	public static void main(String[] args) {
// 		Main main = new Main();
// 		main.abstractMethod(1, "A");
// 	}
	
// 	public void abstractMethod(int num, String str) {
// 		System.out.println("引数int num = " + num + " / 引数String str = "+ str);
// 	}
 
//   7_1 コンストラクタ
// ・抽象クラスのコンストラクタは子クラスで”super”を使って継承する必要がある
// ・抽象クラスは直接インスタンス化することはできませんが子クラスはインスタンス化出来るため、この法則を使って子クラスをインスタンス化し抽象クラスのコンストラクタを利用する
// （例：コンストラクタの書き方）
// abstract class AbstractClass {
 
//   // 抽象クラスのコンストラクタ
//   public AbstractClass(int num, String str) {
//       System.out.println("引数int num = " + num + " / 引数String str = "+ str);
//   }
  
//   abstract void abstractMethod(int num, String str);
  
// }

// class SubClass extends AbstractClass {
//   // 子クラスのコンストラクタから抽象クラスのコンストラクタを呼び出し
//   public SubClass(int num, String str) {
//       super(num, str);
//   }
  
//   public void abstractMethod(int num, String str) {
//       System.out.println("引数int num = " + num + " / 引数String str = "+ str);
//   }
// }

// public class Main {

//   public static void main(String[] args) {
//       SubClass sc = new SubClass(1, "A");
//   }
  
// }

// 8 まとめ
// ・クラスは大規模開発に限らず、Javaを扱うためには必ず必要となってくる基本的な部分でもあるため必須で学ぶ

