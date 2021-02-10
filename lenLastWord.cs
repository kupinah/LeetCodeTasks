using System;

namespace lenLastWord
{
    class Program{
        public static void Main(string[] args){
            string s = " aa  ";
            System.Console.WriteLine(lenLastWord(s));
        }
        public static int lenLastWord(string s){
            if(s.LastIndexOf(' ') == -1) return s.Length;
            string tmp = s.Substring(s.LastIndexOf(' ')+1);
            if(s.LastIndexOf(' ')+1 >= s.Length) {
                string[] temp = s.Split(' ');
                System.Console.WriteLine(temp);
                int m = 0;
                foreach(var word in temp){
                    if(word.Length > m){
                        m = word.Length;
                    }
                }
                return m;
            }
            return tmp.Length;
        }
    }
}    
