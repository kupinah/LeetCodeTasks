import java.util.*;

class mediana{
    public static void main(String[] args){
        int[] num1 = {2,3};
        int[] num2 = {2};
        System.out.println(med(num1,num2));
    }

    public static double med(int[] num1, int[] num2){
        int len1 = num1.length;
        int len2 = num2.length;
        int counter1 = 0;
        int counter2 = 0;
        int counter = 0;
        int[] res = new int[(len1+len2)/2+1];
        if(len1 == 0 && len2 == 0) return 0.0;
        if(len1 == 1 && len2 == 1) return((double)(num1[0]+num2[0])/2);
        if(len1 == 0) {
            counter = len2/2+1;
            if(len2%2 == 0){
                if(len2 == 2) counter = 2; 
                return ((double)(num2[counter-2] + num2[counter-1]) /2);
            }else{
                if(len2 == 1) counter = 1;
                return num2[counter-1];
            }
        }
        if(len2 == 0) {
            counter = len1/2+1;
            if(len1%2 == 0){
                if(len1 == 2) counter = 2;
                return ((double)(num1[counter-2] + num1[counter-1]) /2);
            }else{
                if(len1 == 1) counter = 1;
                return num1[counter-1];
            }
        }
        while(counter < (len1+len2)/2+1){
            if(counter1 < len1 && counter2 < len2 && num1[counter1] < num2[counter2]){
                res[counter] = num1[counter1];
                counter1++;
            } else if(counter2 < len2){
                res[counter] = num2[counter2];
                counter2++;
            }else{
                if(counter1 < len1){
                    res[counter] = num1[counter1];
                } 
                if(counter2 < len2) {
                    res[counter] = num2[counter2];
                }
                counter1++;
                counter2++;
            }
            counter++;
        }
        System.out.println(Arrays.toString(res));
        System.out.println(counter);
        if((len1+len2)%2 == 0)
            return ((double)(res[counter-2] + res[counter-1]) /2);
        else
            return (res[counter-1]);
    }
}