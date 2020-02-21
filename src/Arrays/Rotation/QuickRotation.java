package Arrays.Rotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickRotation {
    //In this we will double the size of the arrray and store the elements at the back
    //This is simple last mai elements aa jayenge so rotation ke liye k%n to k%n+n tak print kar denge
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


    public static void main(String[] args) {
        ProgramForArrayRoatation.FastReader s = new ProgramForArrayRoatation.FastReader();
        int t = s.nextInt();
        while(t>0) {
            int n = s.nextInt();
            int d = s.nextInt();
          //  d=d%n;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
          //  rotate2(arr, d);
            int[] temp = new int[2*n];
            for(int i=0;i<n;i++){
                temp[i]=arr[i];
            }
            for(int i=n;i<2*n;i++){
                temp[i]=arr[i-n];
            }
            for (int i = d%n; i < d%n+n; i++) {
                System.out.print(temp[i] + " ");
            }
            t--;
        }
    }
}
