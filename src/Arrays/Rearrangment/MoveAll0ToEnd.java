package Arrays.Rearrangment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MoveAll0ToEnd {
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
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            int i=0;
            int j=0;
            while(i<arr.length && j<arr.length){
                if(arr[i]==0){
                    j=i+1;
                    while(j<arr.length && arr[j]==0){
                        j++;
                    }
                    if(j<arr.length && arr[j]!=0){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
                i++;
            }
            for(i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            t--;
        }
    }
}
