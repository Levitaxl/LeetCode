/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class RotateArray {
     public static void main (String[] args) {
         int[] a={-1,-100,3,99};
         new RotateArray().rotate(a,2);
     }
     
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int aux = nums[nums.length-1];
            for(int j= nums.length-1; j>0; j--) nums[j] = nums[j-1];
            nums[0]= aux;   
        }
        //System.out.println(Arrays.toString(nums));
    }
    

}