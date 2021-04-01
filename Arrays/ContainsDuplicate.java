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
public class ContainsDuplicate {
    
     public static boolean main (String[] args) {
          int[] nums = {-2,1,0,-3};
          
          Arrays.sort(nums);
          
          for (int i = 0; i < nums.length-1; i++) if(nums[i]==nums[i+1]) return true;
         
          return false;
     }
     
    
}
