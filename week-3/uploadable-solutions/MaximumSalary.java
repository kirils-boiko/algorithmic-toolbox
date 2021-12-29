

import java.util.*;
import java.util.stream.Collectors;

public class MaximumSalary {
    private static String largestNumber(String[] a) {

        if (a.length < 1 || a.length > 100)
            return null;


//        Arrays.sort(a, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//
//                int i = 0;
//                int j = 0;
//                int comparison = 0;
//                while (i < o1.length() || j < o2.length()) {
//                    comparison = Character
//                            .compare(o1.charAt(i), o2.charAt(j)) * -1;
//                    if (i == o1.length() - 1 && j == o2.length() - 1)
//                        break;
//                    if (comparison == 0) {
//                        i = (i + 1 < o1.length()) ? i + 1 : i;
//                        j = (j + 1 < o2.length()) ? j + 1 : j;
//                    } else {
//                        break;
//                    }
//                }
//
//                return comparison;
//            }
//        });

        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;
                return Integer.parseInt(b) - Integer.parseInt(a);
            }
        });

        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += new String(a[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}
