import java.util.*;
public class longestsubarray {
    public static int longsubarray(int[] a ,long k) {
        int n = a.length;
        int left=0;int right=0;
        long sum=a[0];
        int maxlen=0;
        while(right<n){
            while(left<=right && sum>k){
                sum-=a[left];
                left++;
            }
if(sum==k){
    maxlen=Math.max(maxlen,right-left+1);
}
right++;
if(right<n)sum+=a[right];

            }
        return maxlen;
        }

    public static void main(String[] args) {
        int[] a={2,3,5,1,9};
        long k=10;
        int len=longsubarray(a,k);
        System.out.println("the length of subarray is: "+len);
    }
    }

