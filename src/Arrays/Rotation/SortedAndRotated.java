package Arrays.Rotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortedAndRotated {
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
    public static int findPivotElement(int[] arr,int s,int e){
        int mid = (s+e)/2;
        if(s==e){
            return s;
        }
        if((mid-1)>=0 && arr[mid]>arr[mid-1] && (mid+1)<arr.length && arr[mid]>arr[mid+1]){
            return mid;
        }
        if(arr[s]>arr[mid]){
            return findPivotElement(arr,s,mid-1);
        }
        return findPivotElement(arr,mid+1,e);
    }
    public static int binarySearch(int[] arr,int s , int e,int search){
        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if(arr[mid]==search){
            return mid;
        }
        if(arr[mid]>search){
            return binarySearch(arr,s,mid-1,search);
        }
        return binarySearch(arr,mid+1,e,search);
    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while(t>0){
            int n=s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            int search = s.nextInt();
            int val = findPivotElement(arr,0,n-1);
            int ans=binarySearch(arr,0,val,search);
            if(ans==-1){
                ans=binarySearch(arr,val+1,n-1,search);
            }
            System.out.println(ans);
            t--;
        }
    }
}
