using System;

namespace plusOne
{
    class plusOne
    {
        static void Main(string[] args)
        {
            int[] digits = {1};
            System.Console.WriteLine(PlusOne(digits));
        }
        public int[] PlusOne(int[] digits) {
        int len = digits.Length;
        if(digits[len-1] != 9){
            digits[len-1]++;
            return digits;
        }
        else{
            int count = len-1;
            while(count != 0 && digits[count] == 9){
                digits[count] = 0;
                count--;
            }
            System.Console.WriteLine(count);
            if(digits[count] != 9) {
                digits[count]++;
                return digits;
            }
            int[] dig = new int[len+1];
            dig[0] = 1;
            return dig;
            
        }
    }
    }
}
