import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> Li = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            
            Li.add(sc.nextInt());
        }
        int Q = sc.nextInt();
        
        for (int i = 0; i < Q; i++) {
            String op = sc.next();
            if (op.equalsIgnoreCase("INSERT")) {
                int index = sc.nextInt();
                int item = sc.nextInt();
                Li.add(index, item);
            } else {
                Li.remove(sc.nextInt());
            }

        }
        for (Integer integer : Li) {
            System.out.print(integer + " ");
        }
        sc.close();
    }
}
