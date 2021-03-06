// Time Complexity :O(N) , N is length of array
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Approach is to maintain a rsum variable and observe the occurance of the integer in the array

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
           return 0; 
        }
        int rsum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i<nums.length; i++){
            rsum += nums[i];
            int compliment = rsum - k;
            if(map.containsKey(compliment)){
                count += map.get(compliment);
            }
            if(!map.containsKey(rsum)){
                map.put(rsum, 1);
            }
            else{
                map.put(rsum, map.get(rsum)+1);
            }
        }
        return count;
    }
}