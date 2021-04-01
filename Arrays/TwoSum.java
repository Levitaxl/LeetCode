/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author usuario
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
         
        for (int i = 0; i < nums.length; i++){ 
            for (int j = i+1; j < nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] a= {i,j};
                    return a;
                }   
            }         
        }
        
        return null;
    }
    
}
