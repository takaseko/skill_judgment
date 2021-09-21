// import java.util.Scanner;

// public class C084 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String line = sc.nextLine();

//         // 与えられた文字列の長さ
//         int charLength = line.split("").length;

//         StringBuilder sb = new StringBuilder();
//         // 上段、下段に出力する枠の生成←文字列+2
//         for(int i = 0; i < charLength + 2; i++) {
//             sb.append("+");
//         }

//         // 上段
//         System.out.println(sb.toString());
//         // 中断 与えられた文字列の先頭と末尾に+を足す
//         System.out.println("+" + line + "+");
//         // 下段
//         System.out.println(sb.toString());
//     }
// }


// import java.util.Scanner;

// public class C084 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String S = sc.nextLine(); // 1行読みとり
//         // 与えられた文字列の長さ 
//         // splitメソッド（文字列を分割する）
//         int charLength = S.split("").length;

//         // StringBuilderクラスは、文字列の操作をするためのクラス(結合、くっつけたりする)
//         StringBuilder sb = new StringBuilder();
//         // 上段、下段に出力する枠の生成←文字列+2
//         // appendメソッド（文字列を連結する際に使用する）
//         for(int i = 0; i < charLength + 2; i++) {
//             sb.append("+");
//         }

//         // 上段
//         // toStringメソッド（数値型などをString型の文字列に変換する）
//         System.out.println(sb.toString());
//         // 中断 与えられた文字列の先頭と末尾に+を足す
//         System.out.println("+" + S + "+");
//         // 下段
//         // appendメソッド（文字列を連結する際に使用する）
//         System.out.println(sb.toString());
//     }
// }