package Arrays.Rotation;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RotationQueries {
    //This problem is solved using the prefix sums
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
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int[] preSum = new int[n+1];
        preSum[0]=0;
        for(int i=1;i<=n;i++){
            preSum[i]=preSum[i-1]+arr[i-1];
        }
        // net rotation is calculated just take pen and copy and observe
        int netRotation = 0;
        int rot=0;
        int q = s.nextInt();
        while(q>0){
            int qType = s.nextInt();
            if(qType!=3){
                rot = s.nextInt();
                if(qType==1){
                    netRotation = (netRotation-rot)%n;
                }else{
                    netRotation = (netRotation+rot)%n;
                }
            }else{
                int l = s.nextInt();
                int r = s.nextInt();
                l=(l+netRotation+n)%n;
                r=(r+netRotation+n)%n;
                if(l<=r){
                    System.out.println(preSum[r+1]-preSum[l]);
                }else{
                    System.out.println(preSum[n]+preSum[r+1]-preSum[l]);
                    // idea is vo rotation leke wahan aayega so rotation karke niklana padega answer
                }
            }
        }
    }
}
