268. Missing Number
https://leetcode.com/problems/missing-number/description/


class Solution {
    public int missingNumber(int[] nums) {
   
        int arr= cyclicsort(nums);
   return arr;
    }
    int cyclicsort(int [] nums){

        int i=0;
        while(i< nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
                for(int index=0; index<nums.length; index++){
            if(index!=nums[index]){
                
                return index;
            }
        }
        return nums.length;

    }
    void swap(int [] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    

}