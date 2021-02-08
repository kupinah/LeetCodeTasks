import java.util.*;
public class mergeSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {1,0};
        int[] a2 = {2};
        int m = 1;
        int n = 1;
        merge(a1, m, a2, n);
    }
    public static void merge(int[] a1, int m, int[] a2, int n) {
        int[] res = new int[m+n];
        int counter = 0;
        boolean first = true;
        boolean flag = true;
        if(n == 0){ System.arraycopy(res, 0, a1, 0, m+n); return;}
        if(m == 0){ System.arraycopy(res, 0, a2, 0, m+n); return;}
        int c1 = 0;
        int c2 = 0;
        while(counter < m+n){
            if((first && a1[c1] != 0) && flag){
                if(c1 < m && a1[c1] > 0) first = false;
                if(a1[c1] < a2[c2]){
                    res[counter] = a1[c1];
                    counter++;
                    c1++;
                }
                else if(a1[c1] > a2[c2]){
                    res[counter] = a2[c2];
                    counter++;
                    c2++;
                }
                else{
                    res[counter] = a1[c1];
                    counter++;
                    res[counter] = a2[c2];
                    counter++;
                    c1++; c2++;
                }
                if (c2 == n){
                    flag = false;
                    break;
                }
                
            }else{
                if (c2 == n){
                    flag = false;
                    break;
                }
                res[counter] = a2[c2];
                counter++;c2++;c1++;
            }
        }
        if(!flag){
            while(counter < m+n){
                res[counter] = a1[c1];
                counter++; c1++;
            }
        }
        System.arraycopy(res, 0, a1, 0, m+n);
        System.out.println(Arrays.toString(a1));
    }
}
