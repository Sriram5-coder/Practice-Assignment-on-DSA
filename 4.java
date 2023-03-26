import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt());
            }
            listOfList.add(list);
        }

        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            try {
                int v = listOfList.get(r - 1).get(c - 1);
                System.out.println(v);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }
        sc.close();
    }
}
