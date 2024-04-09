import java.util.*;
public class firstOccur {
    public static void main(String[] args) {
        String txt="sadbutsad";
        String str="sad";
       int txtLen=txt.length();
       int strLen=str.length();

       if(strLen>txtLen)
       {
        System.out.println("Not Found");
       }
        else{
                for(int i=0;i<txtLen-strLen+1;i++)
                {
                    if(txt.substring(i, i+strLen).equals(str))
                    {
                        System.out.println("Found At Index"+i);
                        break;
                    }
                }

                System.out.println("Not Found");
        }
    }
}






/*
 class Solution {
    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needleLen = needle.length();

        if (hayLen < needleLen) {
            return -1;
        }

        for (int i = 0; i <= hayLen - needleLen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean found = true;
                for (int j = 1; j < needleLen; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i;
                }
            }
        }

        return -1;
    }
}
 */