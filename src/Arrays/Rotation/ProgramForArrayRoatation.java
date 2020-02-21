package Arrays.Rotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProgramForArrayRoatation {
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
    public static void rotate(int[] arr, int d){
        for(int i=0;i<d;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
            arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
        }
    }
    public static void rotate2(int[] arr,int d){
        //gcd is taken because by gcd we can know how many times does again the pointer points to the starting index this point
        // we have to do the same logic for next index value;
        // this is the optimised rotation which requires O(1) space
        int k=0;
        int g=gcd(arr.length,d);
        for(int i=0;i<g;i++){
            int temp=arr[i];
            int j=i;
            while(true){
                k=j+d;
                if(k>=arr.length){
                    k=k-arr.length;
                }
                if(k==i){
                    break;
                }
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
    }
    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while(t>0) {
            int n = s.nextInt();
            int d = s.nextInt();
            d=d%n;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            rotate2(arr, d);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            t--;
        }
    }
}
