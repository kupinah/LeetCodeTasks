class addbinary{
    public string AddBinary(string a, string b) {
        int carry = 0;
        string res = "";
        int aLen = a.Length-1;
        int bLen = b.Length-1;
        while(aLen >= 0 || bLen >= 0){
            int tmpA; 
            int tmpB;
            if(aLen >= 0) tmpA = a[aLen] - '0';
            else tmpA = 0;
            if(bLen >= 0) tmpB = b[bLen] - '0';
            else tmpB = 0;
            if(tmpA + tmpB + carry == 2){
                res = "0" + res;
                carry = 1;
            }
            else if(tmpA + tmpB + carry == 3){
                res = "1" + res;
                carry = 1;
            }
            else if(tmpA + tmpB + carry == 0){
                res = "0" + res; 
                carry = 0;
            }
            else{
                res = "1"+res;
                carry = 0;
            }
            if(aLen >= 0) a = a.Remove(aLen);
            aLen--;
            if(bLen >= 0) b = b.Remove(bLen);
            bLen--;
        }
        return carry==0 ? res : carry+res;
    }
}