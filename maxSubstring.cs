using System;

namespace LeetCodeC_
{
    class maxSubarray
    {
        static void Main(string[] args)
        {
            int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
            System.Console.WriteLine(max(nums));
        }
        static int max(int[] nums){
            int length = nums.Length;
            int sum = 0, maxSum = 0;
            int val, maxVal = Int32.MinValue/2;
            int counter = 0;
            Boolean flag = true;  
            while(counter < length){
                val = nums[counter];
                if(val < maxVal) maxVal = val;
                if(val >= 0) flag = false;
                sum+=val;
                if(sum < 0) sum = 0;
                if(sum > maxSum) maxSum = sum;
                counter++;
            }
            return flag ? maxVal : maxSum;
        }
    }
}
