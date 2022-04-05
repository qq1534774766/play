package com.aguo;

public class Solution {
    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode();
        System.out.println(new Solution().maxProfit(new int[]{1, 2, 4, 5}));

    }

    public int maxProfit(int[] prices) {
        int lm = findmin(prices,0,prices.length/2);
        int rm = findmax(prices,prices.length/2,prices.length);
        return rm>lm?rm-lm:0;
    }
    public int findmax(int[] prices,int start,int end){
        int max=-1;
        for(int i=start;i<end;i++){
            if (prices[i]>max)max=prices[i];
        }
        return max;
    }
    public int findmin(int[] prices,int start,int end){
        int min =Integer.MAX_VALUE;
        for(int i=start;i<end;i++){
            if (prices[i]<min) min =prices[i];
        }
        return min;
    }
}