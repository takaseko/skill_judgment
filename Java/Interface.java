// 参照：Potepan Style
// 【Java】インターフェースの使い方をわかりやすく解説！【継承】

// 1 インターフェース(interface)とは？
// ・インターフェースとは、クラス内にあるメソッドの具体的な処理は書かずに「変数」または「メソッドの型」を記述したもの

// 1_1 インターフェイス使用の条件
// ・すべてのメソッドが抽象メソッドであること
// ・基本的にフィールドを1つも持っていないこと

// 2 インターフェースの宣言
// アクセス修飾子 interface インターフェース名 {
//   ・
//   ・
//   ・
// }

// 3 インターフェースの実装・使い方
// ・インターフェースを継承して子クラスを定義する際は「implements」を使用します。これを「インターフェースを実装する」と言うので覚えておきましょう。
// （例：インターフェースを実装するための記述）
// アクセス修飾子 class クラス名 implements インターフェース名 {
//   ・
//   ・
//   ・
// }
// (例：インターフェイス宣言から実装まで)
// // インターフェースの宣言
// interface Name {
//   String name1 = "ポテパン";
//   String name2 = "インターフェース";

//   void call();
// }

// // インターフェースの実装
// // 登録した名前で文章を作成するクラス
// class Link implements Name {
//   public void call(){
//       System.out.println(name1 + "で" + name2 + "を学ぼう!");
//   }
// }

// // インターフェースの実装
// // 登録した名前の文字数を数えるクラス
// class Count implements Name {
//   public void call() {
//       int num1 = name1.length();
//       int num2 = name2.length();
//       System.out.println("「" + name1 + "」は" + num1 + "文字");
//       System.out.println("「" + name2 + "」は" + num2 + "文字");
//   }
// }

// // 実装したクラスを実行
// public class Main {
//   public static void main(String args[]) {
//       Link link = new Link();
//       link.call();

//       Count count = new Count();
//       count.call();
//   }
// }
// （実行結果）
// ポテパンでインターフェースを学ぼう!
// 「ポテパン」は4文字
// 「インターフェース」は8文字
// ・このプログラムでは、NameインターフェースのcallメソッドをLinkクラスとCountクラスの両方で実装しています。
// ・実装の処理内容は決められていないので、LinkクラスとCountクラスでそれぞれ異なった動作をしているのです。
// ・Linkクラスでは、2つの文字列を組み合わせた文章を表示します。Countクラスでは、それぞれの文字の文字数を数えて表示します。
// ・このように、メソッドは用意するけど中身（処理）までは決めない場合にインターフェースは有効といえる。


// public class Interface {
  
// }
