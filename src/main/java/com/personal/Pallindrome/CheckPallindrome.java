package com.personal.Pallindrome;

public class CheckPallindrome {
    public static boolean isPallindrome(String word){
        char wordArr[]=word.toCharArray();
        int wordLength=wordArr.length;
        int count;
        int uniqueCount=0;
        for(int i=0;i<wordLength-1;i++)
        {
            count=1;
            if(wordArr[i]!='0') {
                for (int j = i+1; j < wordLength; j++) {
                    if (wordArr[i] == wordArr[j]) {
                        wordArr[j] = '0';
                        count++;
                    }
                }
                wordArr[i]='0';
                if(count%2!=0){
                    uniqueCount++;
                }
                else if(uniqueCount>1){
                    return false;
                }
            }
        }
        return true;
    }
}
