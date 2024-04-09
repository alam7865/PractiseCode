import java.util.*;
public class kmpAlgo {
    public static void main(String[] args) {
        String txt="geeksforgeeks";
        String pat="geeks";
        int txtLen=txt.length();
        int patLen=pat.length();
        // int count=0;

        // for(int i=0;i<txtLen-patLen+1;i++)
        // {
        //     if(pat.charAt(0)==txt.charAt(i))
        //     {
        //         if(txt.substring(i,i+patLen).equals(pat))
        //         {
        //             System.out.println(txt.substring(i, i+patLen));
        //             count++;
        //         }
        //     }
        // }

        // System.out.println(count);




        // ======================================================

        ArrayList<Integer>list=new ArrayList<>();

        int index=txt.indexOf(pat);

        while(index!=-1)
        {
            list.add(index+1);
            index=txt.indexOf(pat,index+1);
        }

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
