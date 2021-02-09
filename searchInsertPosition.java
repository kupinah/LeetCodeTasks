public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int counter = 0;
        while(counter < length){
            if(nums[counter] >= target) return counter;
            counter++;
        }
        return counter;
    }