package Arrays.Rotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxValueOfSum {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //Maximum value of sum of arr[i]*i when only rotation are allowed
    // Brute force method this method is of O(n^2)
    // Efficent way is to find out pattern in the problem
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            int currValue = 0;
            int maxValue = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int arrSum = 0;
            for (int i = 0; i < n; i++) {
                arrSum += arr[i];
                currValue += i * arr[i];
            }
            maxValue = currValue;
            for (int i = 1; i < n; i++) {
                currValue = currValue + arrSum - (n * arr[n - i]);
                if (currValue > maxValue) {
                    maxValue = currValue;
                }
            }
            System.out.println(maxValue);
        }
    }
}
