// 参照：侍エンジニア塾
// 【Java入門】MapとListの相互変換まとめ(key、valueのList化)

1 MapとListの違い
1_1 特長の違い
Map：インデックスとなるkeyとそのデータとなるvalueの両方を定義することができる。abstract
・keyには整数値のほかにString型などの変数なども指定することができる。keyに指定した変数から、valueを呼び出すことができる
・Mapのキーは重複させることはできない。
・keyと関連付けて値を保持する必要がある場合はMapが適しています。
List：Listは要素を格納した順に自動的に整数値のインデックスが生成され、値と紐づけされる
・Listの要素はインデックス番号を指定して、値を呼び出します。
・classまた、Listは要素の値で並び順を替えるソートができますが、Mapはそのままではできません。
・要素の順番が必要となる場合はListが適しています。
・MapのkeyやvalueをListや配列に変換する必要がある

1_2 定義の違い(HashMapとArrayList)
・MapやListはインターフェースですので、インスタンスを生成するには別のクラスを使用する必要がある
・Mapの場合はHashMapクラスを、Listの場合はArrayListクラスなど、インターフェースを実装したクラスを使用する
（例：定義の方法）
Map<String, Integer> map = new HashMap<>();
List<String> list = new ArrayList<>();
MapもListもインターフェースで、インスタンスを生成することはできませんが、オブジェクトは宣言できます。それぞれのインターフェースを実装したクラスのインスタンスをオブジェクトに格納しています。
なお、この例ではMapのkeyはString型、valueはInteger型で指定されています。型の指定はクラス型で行います。
int型などのプリミティブ型は使用できないので注意

2_1 MapからListへ変換
・Mapのkey(キー)をListに変換するにはkeySetメソッドを使用
（例：MapのキーをListに変換する方法を記述）
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Main {
 
    public static void main(String[] args) {
        //Mapの宣言
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("orange", 2);
        map.put("melon", 3);
        
        //Listを宣言し、keySetメソッドを使用してキーの値を取得する
        List<String> list = new ArrayList<>(map.keySet());
        System.out.println(list);
    }
 
}
（実行結果）
[apple, melon, orange]
・サンプルではMapクラスを宣言し、変数mapにputメソッドを使用して、キーと値をそれぞれ設定。
・次にListクラスを宣言し、keySetメソッドを使用してMapのキーを変数listに格納
・Listの中身を確認すると、Mapで追加したkeyが全て取得されているのがわかります。

2_2 MapのvalueをListに変換
・value(値)を取得する場合はvaluesメソッドを使用します。
（例：Mapの値をListに変換するためには、紹介したサンプルの「Listを宣言してMapのキーを取得する箇所」を変更して、以下のように記述）
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Main {
 
    public static void main(String[] args) {
        //Mapの宣言
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("orange", 2);
        map.put("melon", 3);
        
        //Listを宣言し、valuesメソッドを使用して値を取得する
        List<Integer> list = new ArrayList<>(map.values());
        System.out.println(list);
    }
 
}
（実行結果）
[2, 1, 3]
・keyの値取得と異なる点は、MapをListに変換時にkeyの取得はkeySetメソッドを使用しているのに対して、valueを取得する場合はvaluesメソッドを使用
・Listの中身を確認すると、Mapで追加したvalueが全て取得されているのがわかります。

3 ListからMapへ変換
3_1 Listの値をMapのkeyに変換
（例：Listの値をMapのkeyへ設定するサンプルコードを記述）
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Main {
 
    public static void main(String[] args) {
        //Listの宣言
        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        
        //Mapの宣言
        Map<Integer, String> map = new HashMap<>();
        
        for(Integer num : list) {
            // MapにListのキーと値を追加
            map.put(num, "apple");
        }
        
        System.out.println(map);
    }
 
}
（実行結果）
{1=apple, 2=apple, 3=apple}
・サンプルではListクラスを宣言し、変数listに値を追加
・次にMapクラスを宣言し、拡張for文を使用してlistをループして、Listの値をputメソッドでMapのkeyとして格納

3_2 Listの値をMapのvalueへ変換
（例：Listの値をMapのvalueへ設定するサンプルコードを記述）
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Main {
 
    public static void main(String[] args) {
        //Listの宣言
        List<String> list = new ArrayList<>();
        
        list.add("apple");
        list.add("orange");
        list.add("melon");
        
        //Mapの宣言
        Map<Integer, String> map = new HashMap<>();
        
        int i = 1;
        for(String str : list) {
            // MapにListの値を追加
            map.put(i, str);
            i++;
        }
        
        System.out.println(map);
    }
 
}
（実行結果）
{1=apple, 2=orange, 3=melon}
・サンプルではListクラスを宣言し、変数listに値を追加しています。次にMapクラスを宣言し、拡張for文を使用してlistをループして、putメソッドでMapの要素を格納
・Mapのkeyに関しては、変数int型の変数iを宣言し、ループでインクリメントしてMapのkeyとして設定
・実行結果を確認すると、変数mapのvalueが取得されていることがわかります。

4 Java8のStreamを使う方法
・Java8ではStream APIを使用できるようになりました。
・MapからListへ変換する方法は変わりありませんが、ListからMapへ変換する方法が簡潔に記述できるようになりました。
（例：Listの文字列をMapのkeyにその文字列の長さをvalueに格納したMapに変換する場合、以下のように記述）
Map<String, Integer> map = list.stream()      // 1. listをstream()に渡す。
    .collect(Collectors.toMap(   // 2. streamをcollect()メソッドに渡し、CollectorsクラスのMapインスタンス生成メソッドを実行します
    s -> s, // 3. Mapキーを取得するラムダ式
    s -> s.length() // 4. Mapの値を取得するラムダ式
));