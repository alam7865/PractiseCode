import java.util.*;
public class contest1 {
    public static void main(String[] args) {
        String s="abc";
        String t="bac";

        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map1.put(ch,i);
        }

        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            map2.put(ch,i);
        }


        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x=map1.get(ch);
            int y=map2.get(ch);

            sum+=Math.abs(x-y);
        }

        System.out.println(sum);

    }
}
