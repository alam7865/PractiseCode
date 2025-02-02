import java.util.*;
public class anagram {

    public static void main(String[] args) {
        String str[]={"eat","tea","tan","ate","nat","bat"};
        // ArrayList<ArrayList<String>>list=new ArrayList<>();


        String ststr[]=new String[str.length];
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            String st=str[i];
            char arr1[]=st.toCharArray();
            Arrays.sort(arr1);

            String pstr=String.valueOf(arr1);
            ststr[i]=pstr;
            // System.out.print(pstr+" ");
        }


        // for(int i=0;i<str.length;i++)
        // {
        //     System.out.print(str[i]+" "+ststr[i]);
        //     System.out.println();
        // }
        ////////////////////////////////////////////////

        // String str[]={"aet","aet","bat","bat","aet","cde"};
        int n=str.length;
        // HashMap<String,ArrayList<String>>map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(ststr[i]))
            {
                ArrayList<String>list=map.get(ststr[i]);
                list.add(str[i]);
            }
            else{
                ArrayList<String>list=new ArrayList<>();
                list.add(str[i]);
                map.put(ststr[i],list);
            }
        }

        for(Map.Entry<String,ArrayList<String>> set:
        map.entrySet())
        {
            System.out.println(set.getKey()+" "+set.getValue());
        }
    }
}
