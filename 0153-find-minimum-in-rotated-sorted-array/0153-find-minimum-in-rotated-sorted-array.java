class Solution {
    public int findMin(int[] nums) {
          int left=0;
          int right=nums.length-1;
          while(left<=right){
            int mid=left+(right-left)/2;
            if(mid<nums.length-1&&nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>0&&nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]>=nums[left]){//left sorted half hence mid is in right
               left=mid+1;
            }else{
                right=mid-1;
            }
            
          }
          return nums[0];
    }
}