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
        
        //int sum=nums[0];
        int maxSum = IntStream.of(nums).sum();
        //System.out.println(maxSum);

        
       int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            System.out.println(sum+"//"+maxSum+"//"+nums[i]);
            
            if(sum>=maxSum && nums[i]<maxSum) maxSum=sum;
            else if( sum>=maxSum)maxSum=sum;
            else if(nums[i]>maxSum) maxSum=nums[i];  
            else if(sum<0) sum=0;
        }
        
        System.out.println(maxSum);

          
    }
    
}
