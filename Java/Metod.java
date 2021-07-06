// 参照：Potepan Style
// 【Java】 メソッドを徹底解説！定義から呼び出し、戻り値、引数まとめ

// 1-1 メソッドとは？
// ・メソッドとは、複数の文をまとめて、それを1つの”処理”として名前を付けたもの。クラスがもっている機能を定義した、ひとかたまりの文章とも言えます。

// 1-2 メソッドのメリット
// ・プログラム全体の見通しが良くなる
// ・機能単位に分かれているので、修正が簡単
// ・同じ処理を1つのメソッドにまとめると、作業効率が上がる
// （例）以下のようにmainメソッドではメソッドの呼び出しだけ行い、別ファイルで分割したメソッドを定義しておけば、プログラム全体の見通しが良くなる
// public class Main {
//   public static void main(String[] args){
//     calculate(); // 計算するメソッド
//     check(); // 確認するメソッド
//     print(); // 印刷するメソッド
//   }
// }
// public static void calculate() {
//   // 計算処理
// }
 
// public static void check() {
//   // 確認処理
// }
 
// public static void print() {
//   // 印刷処理
// }
// ※処理が意図しないものであれば、メソッドが定義されているファイルだけを確認すれば良いため、管理も楽になる。
// ※メソッドで一度定義すれば、同じ処理を何度も書く必要がなくなるので作業効率も上がる。

// 2 メソッドの定義方法
// メソッドを作成することを、メソッドの定義と言う
// （例：メソッドの定義の記述）
// public static[装飾子] 戻り値の型 メソッド名(引数リスト) {
//   // メソッドが呼び出された時に実行される具体的な処理
// }
// public static void hello() {
//   System.out.println("Hello World!");
// }

// 3 メソッドの呼び出し方法
// （例：メソッドの呼び出し記述）
// メソッド名(引数リスト);
// （例：先ほどの、helloメソッドを実際に呼び出す）
// public class Main {
//   public static void main(String[] args) {
//       hello();
//   }
  
//   public static void hello() {
//       System.out.println("Hello World!");
//   }
// }
// （実行結果）
// Hello World!

4 メソッドに引数を渡す方法
・メソッドを呼び出す時に、呼び出し元から使いたい値を渡せます。この時に渡される値のことを「引数」
・呼び出されたメソッドでは、渡された値を使って処理に使うことが可能
・引数には、数値や文字列などが指定でき、値や型、引数の数を自由に決められる
（例：helloメソッドを、名前を渡して呼び出すプログラムに書き換える）
public class Main {
  public static void main(String[] args) {
      hello("Potepan");
  }
  
  public static void hello(String name) {
      System.out.println(name + " Hello World!");
  }
}
（実行結果）
Potepan Hello World!

4_1 メソッドに複数の引数を渡す方法
・メソッドに複数の引数を渡す場合は、値をカンマ(,)で区切って書く
	メソッド名(引数1, 引数2, 引数3,・・・);
（例：calculateメソッドに、2つの値を渡して掛け算をするプログラムを作る）
public class Main {
  public static void main(String[] args) {
      calculate(25, 85);
  }
  
  public static void calculate(int x, int y) {
      int ans = x * y;
      System.out.println(x + "*" + y + "=" + ans + " です");
  }
}
（実行結果）
25*85=2125 です

4_2 実引数と仮引数
・一般的に、メソッドに渡す値、受け取る変数をともに「引数」と言う
・この引数は厳密に言い分けると、渡す値を「実引数」、受け取る変数を「仮引数」と言う

5 メソッドの戻り値を使う方法
・呼び出されたメソッドから、呼び出し元へ値を返すことを「値を戻す(返す)」と言い、この時戻される値を「戻り値」と呼ぶ
（例：値を戻す構文での記述）
public static 戻り値の型 メソッド名(引数リスト・・・) {
  // メソッドが実行された時に動く処理
  return 戻り値;
}
（例：calculateメソッドを戻り値を使って書き換える）
public class Main {
  public static void main(String[] args) {
      int x = 25, y = 85;
      int ans = calculate(x, y);
      System.out.println(x + "*" + y + "=" + ans + " です");
  }
  
  public static int calculate(int x, int y) {
      return x * y;
  }
}
（実行結果）
25*85=2125 です

6 メソッドのオーバーロードの利用
・Javaで同じ名前のメソッドを定義することを「オーバーロード(多重継承)」と言う
・オーバーロードは、以下のように仮引数の型が異なっていたり、仮引数の個数が異なっている場合に利用可能
（例：calculateメソッドを戻り値を使って書き換える）
public class Main {
  public static void main(String[] args) {
      System.out.println(calculate(25, 85));
      System.out.println(calculate(25.0, 85.0));
      System.out.println(calculate(25, 85, 17));
  }
  
  public static int calculate(int x, int y) {
      return x * y;
  }

  public static double calculate(double x, double y) {
      return x * y;
  }

  public static int calculate(int x, int y, int z) {
      return x * y * z;
  }
}
（実行結果）
2125
2125.0
36125
※似た言葉に「オーバーライド」がありますが、全く異なるものなので混同しないように注意

7 まとめ
プログラムを組む上で、メソッドを使わないことはほとんどなく、必須の知識と言える。
メソッドはコードを読みやすくしたり、修正や変更が簡単に済むなどメリットも豊富。メソッドを覚えて使いこなすことが大事。