// <!-- 参照：TechAcademyマガジン
// 【初心者向け】Javaの習得に欠かせないクラスとは！ -->

// <!-- 1 クラスとは
// ・クラスはデータと処理をひとつにまとめたもの。データを「フィールド」、処理を「メソッド」。
// ・classというのはJavaのプログラムを書く上での土台のようなもの。
// classには「publicクラス」と「privateクラス」が存在します。
// ・記のような宣言を修飾子と言います。 そのあとにある「sample」はクラスの名前です。 上記サンプルコードでは中身がないclassが出来上がっていますが、これに中身を付属させていくことでプログラムを組み立てます。

// 上で説明した「public」と「private」の違いは利用できる場所の違い。
// ・「public」は外部から利用できる場所のことで、「private」とついている場所は外部からの利用ができない範囲。 -->

// 2 オブジェクトの書き方
// クラス 変数 = new クラス();
// と書き、これでオブジェクトが生成されます。 
// そしてこれをインスタンスと呼びます。 インスタンスとはクラスごとのメモリの確保を指します。
// ・クラスはそのままでは利用できないので、それを元にしてオブジェクトというものを生成する
// ・オブジェクトを作ることで使えるようになる
// ・この実体化することをインスタンス化と呼ぶ

// 3_1 実際にクラスを書く
// （register.java）
// public class register{
//   /*レジに入っているお金*/
//   int total = 0;
//   /*レジにお金を登録*/
//   void regist(int money)
//   {
//     total = total + money;
//     System.out.println(money+"registered.");
//   }
//   int finalmoney()
//   {
//     return total;
//   }
//   public static void main(String[] args)
//   {
//     /*regiのオブジェクト、インスタンスを生成*/
//     register regi = new register();
//     regi.regist(1000);
//     regi.regist(500);
//     int total = regi.finalmoney();
//     System.out.println("now,"+total+":registered.");
//   }
// }

// 3_2 2つのオブジェクトを生成。
// public class register
// {
//   /*レジに入っているお金*/
//   int total = 0;
//   /*レジにお金を登録*/
//   void regist(int money)
//   {
//     total = total + money;
//     System.out.println(money+"registered.");
//   }
//   int finalmoney()
//   {
//     return total;
//   }
//   public static void main(String[] args)
//   {
//     /*regi1，regi2のオブジェクト、インスタンスを生成*/
//     register regi1 = new register();
//     register regi2 = new register();
//     regi1.regist(1000);
//     regi2.regist(500);
//     int total1 = regi1.finalmoney();
//     int total2 = regi2.finalmoney();
//     System.out.println("now,regi1:"+total1+":registered.");
//     System.out.println("now,regi2:"+total2+":registered.");
//   }
// }

// 3_3 上記オブジェクトを2つ使用したソースコードの説明
// ・上記2つのソースコードはレジの登録システムを模したもの
// ・「main」内部で、最初に行っている部分がインスタンス
// ・2のソースコードでは「regi1」と「regi2」の2つのオブジェクトを生成。それによって、2種類のものができている。
// ・newによって、オブジェクトが生成される
// ・