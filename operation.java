import java.util.*;
public class operation {
    public static void main(String[] args) {
        
        String s="aabcbbca";
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        
        //System.out.println(Arrays.toString(freq));
        
        int max = 0;
        for(int i : freq){
            max = Math.max(i , max);
        }
        
        String ans = "";
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == max){
                freq[ch - 'a'] = -1;
                ans = ch + ans;
                System.out.println(ans);
            }
        }
        // return ans;
        // System.out.println(ans);
    }
}
