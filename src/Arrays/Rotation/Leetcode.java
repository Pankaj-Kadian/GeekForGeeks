package Arrays.Rotation;

import java.util.Scanner;

public class Leetcode {
    public static  int countBinarySubstrings(String s) {
        int count0=0;
        int count1=0;
        int ans=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='0'){
                while(i<s.length() && s.charAt(i)=='0'){
                    count0++;
                    i++;
                }
                ans=ans+Math.min(count0,count1);
                count1=0;
            }else{
                while(i<s.length() && s.charAt(i)=='1'){
                    count1++;
                    i++;
                }
                ans=ans+Math.min(count0,count1);
                count0=0;
            }
        }
        return ans;
    }
    public static int minFlips(int a, int b, int c) {
        int d = a|b;
        int e = a^b;
        int count=0;
        while(c>0) {
            int a1 = d & 1;
            int a2 = e & 1;
            int a3 = c & 1;
            if (a1 == 1 && a2 == 1) {
                if (a3 == 0) {
                    count = count + 1;
                }
            }
            if (a1 == 1 && a2 == 0) {
                if (a3 == 0) {
                    count = count + 2;
                }
            }
            if (a1 == 0 && a2 == 0) {
                if (a3 == 1) {
                    count = count + 1;
                }
            }
            c=c>>1;
            d=d>>1;
            e=e>>1;
        }
        return count;
    }
    public static void main(String args[]) {
        System.out.println(minFlips(1,2,3));
    }
}
