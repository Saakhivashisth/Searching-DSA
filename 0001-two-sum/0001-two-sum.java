import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int j=target-nums[i];
            if(map.containsKey(j)){
                return new int[]{map.get(j),i};
            }
            map.put(nums[i],i);
        }
         return new int[]{-1, -1};
    }

    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] nums=new int[n];
      for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
      }
      int target=sc.nextInt();
      int[] ans=twoSum(nums,target);
      System.out.println(ans[0]+" "+ans[1]);

      sc.close();
    }
}