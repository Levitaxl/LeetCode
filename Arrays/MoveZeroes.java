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
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++){ 
            if(nums[i]==0){
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j]!=nums[i]){
                        int aux=nums[j];
                        nums[j]=nums[i];
                        nums[i]=aux;
                        
                        
                        
                        break;
                    }
                    
                }
            } 
        }
  
        
        
    }
    
}
