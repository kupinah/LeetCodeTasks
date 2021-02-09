public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int slow = 0;
        int fast = 0;
        while(fast < length){
            if(nums[slow] == val || nums[slow] == -1){
                while(fast < length && (nums[fast] == val || nums[fast] == -1))
                    fast++;
                if(fast == length) break;
                nums[slow] = nums[fast];
                nums[fast] = -1;
            }
            fast++;
            slow++;
        }
        return slow;
    }