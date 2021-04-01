package Arrays;

import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class MaxSubarray {
    
    public static void main (String[] args) {
        int[] nums = new int[]{-2,1,0,-3};
        int maxSum = nums[0];
    
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {
                sum=sum+nums[j];
                if(sum>maxSum) maxSum=sum;
            }
        }
        System.out.println(maxSum);      
    }
    
}
