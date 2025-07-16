class Solution {
    public int maximumLength(int[] nums) {
        int evenCount=0, oddCount = 0, bothCounts = 0;
        int parity = (nums[0] % 2);
        for(int num : nums){
            if(num % 2 ==0){
                evenCount++;
            }else{
                oddCount++;
            }
            if(parity == num % 2){
                bothCounts++;
                parity ^= 1;
            }
        }
        return Math.max(evenCount, Math.max(oddCount,bothCounts));
    }
}
