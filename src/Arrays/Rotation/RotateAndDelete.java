package Arrays.Rotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RotateAndDelete {
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
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while(t>0){
            int n=s.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            if(n%2==0){
                System.out.println(arr[(n-2)/4+1]);
            }else
                System.out.println(arr[(n-3)/4+2]);
        t--;
        }
    }
}
