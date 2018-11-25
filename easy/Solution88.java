package easy;

import java.util.Arrays;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Solution88 solve = new Solution88();
        int[] num1 = new int[] {1,2,3,0,0,0};
        int[] num2 = new int[] {2, 5, 6};
        solve.merge(num1, 3, num2, 3);
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}

//class Solution {
//    public void merge(int A[], int m, int B[], int n) {
//        int i=m-1, j=n-1, k=m+n-1;
//        while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
//        while (j>-1)         A[k--]=B[j--];
//    }
//}