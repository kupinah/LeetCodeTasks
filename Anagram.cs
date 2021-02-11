using System;

namespace anagram
{
    class Anagram
    {
        static void Main(string[] args)
        {
            string s = "pas";
            string t = "sap";

            System.Console.WriteLine(IsAnagram(s,t));
        }
        public static bool IsAnagram(string s, string t) {
            public bool IsAnagram(string s, string t) {
        int len = s.Length;
        if (s.Length != t.Length)
            return false;
        
        SortedDictionary<char, int> sD = new SortedDictionary<char, int>();
        SortedDictionary<char, int> tD = new SortedDictionary<char, int>();
      
        int OccS;
        int OccT;
        for(int i = 0; i < len; i++){
            char tmpS = s[i];
            char tmpT = t[i];
            sD.TryGetValue(tmpS, out OccS);
            sD[tmpS] = OccS + 1;
            tD.TryGetValue(tmpT, out OccT);
            tD[tmpT] = OccT + 1;
        }
        
        if(sD.Count == tD.Count){
            foreach(var pair in sD){
                if(tD.TryGetValue(pair.Key, out var val)){
                    if(val != pair.Value) {
                        return false;
                    }
                }
                else return false;
            }
            return true;
        }
        return false;  
    }
}
