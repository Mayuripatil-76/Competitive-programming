// https://leetcode.com/problems/max-consecutive-ones-iii/?envType=study-plan-v2&envId=leetcode-75
class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {

        int left = 0 ; 
        int right = 0 ; 

        int count = 0 ; 
        int maxcount = Integer.MIN_VALUE ; 

        int m = k ; 

        while(left<nums.length && right<nums.length ){
            if(nums[right] == 1){
                count ++ ; 
                
            }
            else {
                if(k!= 0 ){
                    count++ ; 
                    k-- ; 
                    
                }
                else{
                    while(nums[left] == 1){
                        left++ ; 
                        count-- ; 
                    }
                    left++ ; // skip first zero and decrement count , to add another zero 
                }
            }
            maxcount = Math.max(maxcount , count ) ; 
            right++ ;
        }

        return maxcount ; 
        
    }
}
