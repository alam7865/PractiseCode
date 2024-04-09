import java.util.*;
public class iss {
    public static void main(String[] args) {
        String s="ajj";
        String t="baa";

        int map1[]=new int[130];
        int map2[]=new int[130];
        
        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
            {
                System.out.println("S False");
            }

            map1[s.charAt(i)]=i+1;
            System.out.println(map1[s.charAt(i)]);
        }
    }
}
