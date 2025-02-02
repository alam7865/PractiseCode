import java.util.*;
public class min {

    public static String longestCommonPrefix(String arr[],int n)
    {
        String str="";
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(min>arr[i].length())
            {
                str=arr[i];
                min=arr[i].length();
            }
        }

        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<min;i++)
        {
            char ch=str.charAt(i);
            
            for(int j=0;j<n;j++)
            {
                if(arr[j].charAt(i)!=ch)
                {
                    if(sb.length()==0)
                    {
                        sb.append("-1");
                        return sb.toString();
                    }
                    else{
                        return sb.toString();
                    }
                }
            }

            sb.append(ch);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        // String arr[]={"geeksforgeeks","geeks","geek","geezer"};
        String arr[]={"abba","man"};

        String result=longestCommonPrefix(arr,arr.length);
        System.out.println("Result: "+result);

    }
}
















/*
 

//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        
        //  int n=arr.length;
        int min=Integer.MAX_VALUE;
        String minStr="";
        
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i].length())
            {
                min=arr[i].length();
                minStr=arr[i];
            }
        }

        // System.out.println(min);
        // System.out.println(minStr);
    
       String res = "";
        for(int i=0; i<minStr.length(); i++){
            char c = minStr.charAt(i);
            for(int j=0; j<n; j++){
                if(arr[j].charAt(i)!=c){
                    if(res == "") return "-1";
                    else return res;
                }
            }
            res += c;
        }
        return res;
    }
}
 */