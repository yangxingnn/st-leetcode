
/**
*
* 使用HashMap
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> temp = new HashMap<>();
        int result[] = new int[2];
        for (int i = 0;i<nums.length; i++){
            if (temp.containsKey(target- nums[i])){
                result[0] = temp.get(target- nums[i]);
                result[1] = i;
            }
            temp.put(nums[i],i);
        }
        return result;
    }
}

/**
*
* 原始方法
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            for (int j=i+1 ;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
				    result[0] = i;
				    result[1] = j;
			    }
            }
        }
        return result;
    }
}