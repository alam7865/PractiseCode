import java.util.*;
public class forloop {
    public static void main(String[] args) {
        String s="raaeaedere";
        // String s="tree";
        // Map<Character, Integer> charCount = new HashMap<>();
        // for (char c : s.toCharArray()) {
        //     charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        // }

        // // Step 2: Sort characters based on their frequency in descending order
        // List<Character> sortedChars = new ArrayList<>(charCount.keySet());
        // Collections.sort(sortedChars, (a, b) -> charCount.get(b) - charCount.get(a));

        // // Step 3: Build the result string by repeating characters according to their frequency
        // StringBuilder result = new StringBuilder();
        // for (char c : sortedChars) {
        //     result.append(String.valueOf(c).repeat(charCount.get(c)));
        // }

        // // Step 4: Return the final sorted string
        // System.out.println(result.toString());



        ////////////////////////////////////////////////////////////////////////////

        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char str=s.charAt(i);
            map.put(str,map.getOrDefault(str,0)+1);
        }
        ArrayList<Character>list=new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b)->map.get(b)-map.get(a));

        for(int i=0;i<list.size();i++)
        {
            char c=list.get(i);
            String str=String.valueOf(c);
            int num=map.get(c);
            sb.append(str.repeat(num));
        }

        System.out.println(sb.toString());
    }
}





