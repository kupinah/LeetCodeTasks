public int romanToInt(String s) {
    char lastChar='0';
    int result = 0;
    for(char ch:s.toCharArray()){
        switch(ch){
            case 'I'-> result+=1;
            case 'V'-> result+=lastChar=='I'?3:5;
            case 'X'-> result+=lastChar=='I'?8:10;
            case 'L'-> result+=lastChar=='X'?30:50;
            case 'C'-> result+=lastChar=='X'?80:100;
            case 'D'-> result+=lastChar=='C'?300:500;
            case 'M'-> result+=lastChar=='C'?800:1000;
        }
        lastChar=ch;
    }
    return result;
}