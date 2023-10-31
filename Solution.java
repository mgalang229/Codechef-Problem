import java.io.*;
import java.util.*;

//change class to 'Main'
public class Solution {
    
    public static void main(String args[]) {
        Scanner fs = new Scanner(System.in);
        int T = 1;
        T = fs.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = fs.nextInt(), m = fs.nextInt();
            System.out.println((n % 2 == m % 2 ? "YES" : "NO"));
        }
        fs.close();
    }
}
