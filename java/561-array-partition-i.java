public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum =0 ;
        for(int i=0;i<nums.length/2;i++){
            sum +=nums[2*i];
        }
        return sum;
    }
}


/**
* ��������������д
*/
public class Solution {
    public int arrayPairSum(int[] nums) {
        int[] temp = new int[20001];
        for(int num: nums){
            temp[num+10000]++;          // ʹ��++ ��������������к���ͬԪ�ص����
        }
        int sum = 0;
        boolean flag =true;
        for(int i = 0;i<temp.length;i++){
            while(temp[i]>0){           
                if(flag){
                    sum += (i-10000);
                }
                    flag = !flag;
                    temp[i]--;
            }
                
        }
        return sum;
    }
}