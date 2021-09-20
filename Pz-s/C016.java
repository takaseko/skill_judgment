import java.util.*;
​
public class C016 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] line = sc.nextLine().split("");​
        // Map
       Map<String, String> map = new HashMap<>();
       map.put("A", "4");
       map.put("E", "3");
       map.put("G", "6");
       map.put("I", "1");
       map.put("O", "0");
       map.put("S", "5");
       map.put("Z", "2");

       List<String> result = new ArrayList<>();
       for (String s : line) {
           if (map.containsKey(s)) {
               result.add(map.get(s));
           } else {
               result.add(s);
           }
       }
       System.out.println(String.join("", result));
      }
    }

            // replace
//         Scanner sc = new Scanner(System.in);
//         String line = sc.nextLine();
// ​
//         line = line.replace("A", "4");
//         line = line.replace("E", "3");
//         line = line.replace("G", "6");
//         line = line.replace("I", "1");
//         line = line.replace("O", "0");
//         line = line.replace("S", "5");
//         line = line.replace("Z", "2");
// ​
//         System.out.println(line);
//     }
// }
  