package Arrays.Rearrangment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Rearrange3 {
    // Rearrange positives and negatives
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
    public static void method2(int[] arr ,int n){
        int countPos=0;
        int countNeg=0;
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr2.add(arr[i]);
            }else{
                arr3.add(arr[i]);
            }
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<arr2.size() && j<arr3.size()){
            if(k%2==0){
                arr[k]=arr3.get(j);
                j++;
            }else{
                arr[k]=arr2.get(i);
                i++;
            }
            k++;
        }
        while(i<arr2.size()){
            arr[k]=arr2.get(i);
            k++;
            i++;
        }
        while(j<arr3.size()){
            arr[k]=arr3.get(j);
            k++;
            j++;
        }

    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            method2(arr,n);
//            int i = 0;
//            int j = 1;
//            while (i < arr.length && j < arr.length) {
//                if (i % 2 == 0) {
//                    if (arr[i] >= 0) {
//
//                    } else {
//                        j = i + 1;
//                        int ele = arr[i];
//                        while (j < arr.length && arr[j] < 0) {
//                            int temp = arr[j];
//                            arr[j] = ele;
//                            ele = temp;
//                            j++;
//                        }
//                        if(j>=arr.length){
//                            arr[j-1]=ele;
//                            break;
//                        }
//                        arr[i] = arr[j];
//                        arr[j] = ele;
//                    }
//                } else {
//                    if (arr[i] < 0) {
//                    } else {
//                        j = i + 1;
//                        int ele = arr[i];
//                        while (j < arr.length && arr[j] >= 0) {
//                            int temp = arr[j];
//                            arr[j] = ele;
//                            ele = temp;
//                            j++;
//                        }
//                        if(j>=arr.length){
//                            arr[j-1]=ele;
//                            break;
//                        }
//                        arr[i] = arr[j];
//                        arr[j] = ele;
//                    }
//                }
//                i++;
//            }
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            t--;
        }
    }
}