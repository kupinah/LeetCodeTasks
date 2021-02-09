public int removeDuplicates(int[] nums) {
    int length = nums.length;
    int slow = 0;
    int fast = 0;
    while(fast < length){
        nums[slow] = nums[fast];
        while(fast < nums.length && nums[slow] == nums[fast])
            fast++;
        slow++;
    }
    return slow;
}