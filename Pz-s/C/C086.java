// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// ​
// public class C086 {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       String s = sc.nextLine(); //変換する前の値
      
//       List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"); // 母音のリスト
//       List<String> strList = new ArrayList<>(Arrays.asList(s.split(""))); // 与えられた文字列をArrayListに変換
//       Iterator<String> ite = strList.iterator(); // iteratorに変換
      
//       while (ite.hasNext()) {
//           if (vowels.contains(ite.next())) {
//               ite.remove();
//           }
//       }
//       // ↑strList.removeIf(vowels::contains); に書き換え可能
      
//       // 母音を覗いた文字列の出力
//       for (String str : strList) {
//           System.out.print(str);
//       }
//     }
// }