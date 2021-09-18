// // 参照：侍エンジニア塾
// // 【Java入門】MapとListの相互変換まとめ(key、valueのList化)

// // 1 MapとListの違い
// // 1_1 特長の違い
// // Map：インデックスとなるkeyとそのデータとなるvalueの両方を定義することができる。abstract
// // ・keyには整数値のほかにString型などの変数なども指定することができる。keyに指定した変数から、valueを呼び出すことができる
// // ・Mapのキーは重複させることはできない。
// // ・keyと関連付けて値を保持する必要がある場合はMapが適しています。
// // List：Listは要素を格納した順に自動的に整数値のインデックスが生成され、値と紐づけされる
// // ・Listの要素はインデックス番号を指定して、値を呼び出します。
// // ・classまた、Listは要素の値で並び順を替えるソートができますが、Mapはそのままではできません。
// // ・要素の順番が必要となる場合はListが適しています。
// // ・MapのkeyやvalueをListや配列に変換する必要がある

// // 1_2 定義の違い(HashMapとArrayList)
// // ・MapやListはインターフェースですので、インスタンスを生成するには別のクラスを使用する必要がある
// // ・Mapの場合はHashMapクラスを、Listの場合はArrayListクラスなど、インターフェースを実装したクラスを使用する
// // （例：定義の方法）
// // Map<String, Integer> map = new HashMap<>();
// // List<String> list = new ArrayList<>();
// // MapもListもインターフェースで、インスタンスを生成することはできませんが、オブジェクトは宣言できます。それぞれのインターフェースを実装したクラスのインスタンスをオブジェクトに格納しています。
// // なお、この例ではMapのkeyはString型、valueはInteger型で指定されています。型の指定はクラス型で行います。
// // int型などのプリミティブ型は使用できないので注意

// // 2_1 MapからListへ変換
// // ・Mapのkey(キー)をListに変換するにはkeySetメソッドを使用
// // （例：MapのキーをListに変換する方法を記述）
// // import java.util.ArrayList;
// // import java.util.HashMap;
// // import java.util.List;
// // import java.util.Map;
 
// // public class Main {
 
// //     public static void main(String[] args) {
// //         //Mapの宣言
// //         Map<String, Integer> map = new HashMap<>();
// //         map.put("apple", 1);
// //         map.put("orange", 2);
// //         map.put("melon", 3);
        
// //         //Listを宣言し、keySetメソッドを使用してキーの値を取得する
// //         List<String> list = new ArrayList<>(map.keySet());
// //         System.out.println(list);
// //     }
 
// // }
// // （実行結果）
// // [apple, melon, orange]
// // ・サンプルではMapクラスを宣言し、変数mapにputメソッドを使用して、キーと値をそれぞれ設定。
// // ・次にListクラスを宣言し、keySetメソッドを使用してMapのキーを変数listに格納
// // ・Listの中身を確認すると、Mapで追加したkeyが全て取得されているのがわかります。

// // 2_2 MapのvalueをListに変換
// // ・value(値)を取得する場合はvaluesメソッドを使用します。
// // （例：Mapの値をListに変換するためには、紹介したサンプルの「Listを宣言してMapのキーを取得する箇所」を変更して、以下のように記述）
// // import java.util.ArrayList;
// // import java.util.HashMap;
// // import java.util.List;
// // import java.util.Map;
 
// // public class Main {
 
// //     public static void main(String[] args) {
// //         //Mapの宣言
// //         Map<String, Integer> map = new HashMap<>();
// //         map.put("apple", 1);
// //         map.put("orange", 2);
// //         map.put("melon", 3);
        
// //         //Listを宣言し、valuesメソッドを使用して値を取得する
// //         List<Integer> list = new ArrayList<>(map.values());
// //         System.out.println(list);
// //     }
 
// // }
// // （実行結果）
// // [2, 1, 3]
// // ・keyの値取得と異なる点は、MapをListに変換時にkeyの取得はkeySetメソッドを使用しているのに対して、valueを取得する場合はvaluesメソッドを使用
// // ・Listの中身を確認すると、Mapで追加したvalueが全て取得されているのがわかります。

// // 3 ListからMapへ変換
// // 3_1 Listの値をMapのkeyに変換
// // （例：Listの値をMapのkeyへ設定するサンプルコードを記述）
// // import java.util.ArrayList;
// // import java.util.HashMap;
// // import java.util.List;
// // import java.util.Map;
 
// // public class Main {
 
// //     public static void main(String[] args) {
// //         //Listの宣言
// //         List<Integer> list = new ArrayList<>();
        
// //         list.add(1);
// //         list.add(2);
// //         list.add(3);
        
// //         //Mapの宣言
// //         Map<Integer, String> map = new HashMap<>();
        
// //         for(Integer num : list) {
// //             // MapにListのキーと値を追加
// //             map.put(num, "apple");
// //         }
        
// //         System.out.println(map);
// //     }
 
// // }
// // （実行結果）
// // {1=apple, 2=apple, 3=apple}
// // ・サンプルではListクラスを宣言し、変数listに値を追加
// // ・次にMapクラスを宣言し、拡張for文を使用してlistをループして、Listの値をputメソッドでMapのkeyとして格納

// // 3_2 Listの値をMapのvalueへ変換
// // （例：Listの値をMapのvalueへ設定するサンプルコードを記述）
// // import java.util.ArrayList;
// // import java.util.HashMap;
// // import java.util.List;
// // import java.util.Map;
 
// // public class Main {
 
// //     public static void main(String[] args) {
// //         //Listの宣言
// //         List<String> list = new ArrayList<>();
        
// //         list.add("apple");
// //         list.add("orange");
// //         list.add("melon");
        
// //         //Mapの宣言
// //         Map<Integer, String> map = new HashMap<>();
        
// //         int i = 1;
// //         for(String str : list) {
// //             // MapにListの値を追加
// //             map.put(i, str);
// //             i++;
// //         }
        
// //         System.out.println(map);
// //     }
 
// // }
// // （実行結果）
// // {1=apple, 2=orange, 3=melon}
// // ・サンプルではListクラスを宣言し、変数listに値を追加しています。次にMapクラスを宣言し、拡張for文を使用してlistをループして、putメソッドでMapの要素を格納
// // ・Mapのkeyに関しては、変数int型の変数iを宣言し、ループでインクリメントしてMapのkeyとして設定
// // ・実行結果を確認すると、変数mapのvalueが取得されていることがわかります。

// // 4 Java8のStreamを使う方法
// // ・Java8ではStream APIを使用できるようになりました。
// // ・MapからListへ変換する方法は変わりありませんが、ListからMapへ変換する方法が簡潔に記述できるようになりました。
// // （例：Listの文字列をMapのkeyにその文字列の長さをvalueに格納したMapに変換する場合、以下のように記述）
// // Map<String, Integer> map = list.stream()      // 1. listをstream()に渡す。
// //     .collect(Collectors.toMap(   // 2. streamをcollect()メソッドに渡し、CollectorsクラスのMapインスタンス生成メソッドを実行します
// //     s -> s, // 3. Mapキーを取得するラムダ式
// //     s -> s.length() // 4. Mapの値を取得するラムダ式
// // ));

// // 参照：Code Challenge
// // 【Java入門】List/Set/Mapの活用方法（初期化・追加addなど）

// // 1 クラス図 – List Set Map –
// // ・List / Setインターフェースはクラスを継承している。
// // ・Mapはキーと値が対になったオブジェクトであるため、List / Setとは異なる。

// // 2 List/Set/Mapの活用方法
// // ・List/Set/Mapは、たくさんのデータを1つのオブジェクトとして操作することができ、データを取り出したり、追加したりすることが可能。
// // ・配列とは異なり、最初からサイズを決める必要がない。
// // ・配列と同じように複数データを扱えるListやキーと値の対になってるMapなど、用途に合わせて使い分けていくこと

// // 2_1 Listの活用方法
// // ・要素の順番を保証する（要素順番OK：0,1,2,3,4,5）
// // ・重複要素を許可する（重複OK：AAABCDDEみたいな）

// // 2_2 List – 実装クラス –
// // ・Listインターフェースを実装したクラスに【ArrayList】【LinkedList】が存在する
// // ArrayList：検索は早い。要素の追加・削除は遅い。
// // LinkedList：検索は遅い。要素の追加・削除は早い。

// // 2_3 List – 初期化 –
// // ArrayList <データ型> 変数名 = new ArrayList <データ型> ();
// // LinkedList <データ型> 変数名 = new LinkedList <データ型> ();
// // ・点線枠で囲んだ部分（前と後ろのデータ型）は同じにする必要があるので注意
// // （例：サンプルコード）
// // package app.collection;

// // import java.util.ArrayList;
// // import java.util.LinkedList;

// // public class App {
// //     public static void main(String[] args) {
// //         // 初期化の方法
// //         ArrayList<String> arraylist = new ArrayList<String>();
// //         LinkedList<String> linkedlist = new LinkedList<String>();
// //     }
// // }

// // 2_4 List – 要素追加 –
// // ・要素の追加は addメソッドを使用
// // （例：サンプルコード）
// // // 初期化の方法
// // ArrayList<String> arraylist = new ArrayList<String>();
// // LinkedList<String> linkedlist = new LinkedList<String>();

// // // ArrayListでの追加
// // arraylist.add("A");
// // arraylist.add("B");
// // arraylist.add("C");
// // System.out.println( "ArrayListの結果" + arraylist );

// // // LinkedListでの追加
// // linkedlist.add("A");
// // linkedlist.add("B");
// // linkedlist.add("C");
// // System.out.println( "LinkedListの結果" + linkedlist );
// // （実行結果：ArrayList, LinkedList のどちらもaddメソッドで追加できる。）
// // ArrayListの結果[A, B, C]
// // LinkedListの結果[A, B, C]
// // （例：要素の順番を指定して、追加することも可能）
// // // 初期化の方法
// // ArrayList<String> arraylist = new ArrayList<String>();
// // LinkedList<String> linkedlist = new LinkedList<String>();

// // // ArrayListでの追加
// // arraylist.add("A");
// // arraylist.add("B");
// // // 追加場所を指定
// // arraylist.add(1, "C");
// // System.out.println( "ArrayList" + arraylist );

// // // LinkedListでの追加
// // linkedlist.add("A");
// // linkedlist.add("B");
// // // 追加場所を指定
// // linkedlist.add(1, "C");
// // System.out.println( "LinkedList" + linkedlist );
// // （実行結果：要素【C】が【A】と【B】の間になります）
// // ArrayListの結果[A, C, B]
// // LinkedListの結果[A, C, B]

// // 2_5 おまけ
// // （例：【ArrayList】【LinkedList】の取得処理について計測。10万個の要素を持つ【ArrayList】【LinkedList】を１つずつ取得（検索）した場合、実行時間はどのくらい差があるのか）
// // package test;

// // import java.util.ArrayList;
// // import java.util.LinkedList;
// // import java.util.List;

// // public class Sample {
// //   public static void main( String args[] ) {

// //     int count = 100000;
// //     long startTime = 0;
// //     long endTime = 0;

// //     List<Integer> arraylist = new ArrayList<Integer>();
// //     List<Integer> linkedlist = new LinkedList<Integer>();

// //     // 要素の追加
// //     for ( int i = 0; i < count; i++ ) {
// //       arraylist.add(i);
// //       linkedlist.add(i);
// //     }

// //     // ArrayListの測定
// //     startTime = System.currentTimeMillis();
// //     for ( int i = 0; i < count; i++ ) {
// //       arraylist.get(i);
// //     }
// //     endTime = System.currentTimeMillis();
// //     System.out.println( "ArrayList 取得：" + (endTime - startTime) + "ミリ秒");

// //     // LinkedListの測定
// //     startTime = System.currentTimeMillis();
// //     for ( int i = 0; i < count; i++ ) {
// //       linkedlist.get(i);
// //     }
// //     endTime = System.currentTimeMillis();
// //     System.out.println( "LinkedList 取得：" + (endTime - startTime) + "ミリ秒" );

// //   }
// // }
// // （実行結果）
// // ArrayList 取得：1ミリ秒
// // LinkedList 取得：4045ミリ秒
// // ・ArrayListは約1ミリ秒に対して、LinkedListは4秒の処理時間
// // ・検索処理速度がArrayListが速く、LinkedListが遅いことが分かる

// 3 Setの活用方法
// 要素 A B C D E F
// ・重複要素は許可しない。

// 3_1 Set – 実装クラス –
// ・Setインターフェースを実装したクラスに【HashSet】【TreeSet】が存在します。
// HashSet：要素の順番は保証しない。
// TreeSet：要素の順番はソートされる。

// 3_2 Set – 初期化 –
// import java.util.HashSet;
// import java.util.TreeSet;

// HashSet<String> hashset = new HashSet<String>();
// TreeSet<String> treeset = new TreeSet<String>();

// 3_3 Set – 要素追加 –
// 要素の追加は addメソッドを使用。
// treeset.add("C");
// treeset.add("A");
// treeset.add("B");
// （実行結果）
// A,B,C
// ・TreeSetの場合、ソートされて出力されていることが分かる

// 4 Mapの活用方法
// キー id name age from
// 値  100 sato 30  tokyo
// ・キーと値が対になった要素
// ・キーの重複は許可しない。

// 4_1 Map – 実装クラス –
// ・Mapインターフェースを実装したクラスに【HashMap】【TreeMap】が存在。
// HashMap：キーの順番は保証しない。
// TreeMap：キーの順番はソートされる。

// 4_2 Map – 初期化 –
// import java.util.HashMap;
// import java.util.TreeMap;

// HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
// TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

// 4_3 Map – 要素追加 –
// ・要素の追加は putメソッドを使用
// treemap.put(3, "C");
// treemap.put(1, "A");
// treemap.put(2, "B");
// （実行結果）
// 1=A, 2=B, 3=C
// ・TreeMapの場合、keyがソートされて出力されている

// 5 まとめ
// java開発においてList/Set/Mapを扱う頻度はかなり高い。
// 処理内容や用途に応じて使い分けることが出来れば無駄のないソースコードが書けるようになると思う