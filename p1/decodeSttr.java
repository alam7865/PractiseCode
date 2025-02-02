import java.util.*;
public class decodeSttr {
    public static void main(String[] args) {
        // String s="1";
        String s="3[b2[ca]]";


        Stack<String> stack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int currentNum = 0;




        /// main code

        // for (char c : s.toCharArray()) {
        //     if (Character.isDigit(c)) {
        //         currentNum = currentNum * 10 + Character.getNumericValue(c);
        //     } else if (c == '[') {
        //         stack.push(currentStr.toString());
        //         stack.push(String.valueOf(currentNum));
        //         currentStr = new StringBuilder();
        //         currentNum = 0;
        //     } else if (c == ']') {
        //         int num = Integer.parseInt(stack.pop());
        //         String lastStr = stack.pop();
        //         currentStr = new StringBuilder(lastStr + currentStr.toString().repeat(num));
        //     } else {
        //         currentStr.append(c);
        //     }
        // }

        // // return currentStr.toString();
        // System.out.println(currentStr.toString());








        ////////////////////////////////////////////////////////////////
        
        
        char arr[]=s.toCharArray();
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(arr[i]))
            {
                currentNum=currentNum*10+Character.getNumericValue(arr[i]);
            }
            else if(arr[i]=='[')
            {
                stack.push(currentStr.toString());

                // System.out.println(currentStr.toString());

                stack.push(Integer.toString(currentNum));

                // System.out.println(Integer.toString(currentNum));

                currentStr = new StringBuilder();
                currentNum=0;
            }
            else if(arr[i]==']')
            {
                int num=Integer.parseInt(stack.pop());
                String st=stack.pop();

                currentStr = new StringBuilder(st + currentStr.toString().repeat(num));
                System.out.println(currentStr);
                System.out.println();
            }
            else{
                currentStr.append(arr[i]);
            }
        }

        System.out.println(currentStr.toString());
    }
}











/*
 import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + Character.getNumericValue(c);
            } else if (c == '[') {
                stack.push(currentStr.toString());
                stack.push(String.valueOf(currentNum));
                currentStr = new StringBuilder();
                currentNum = 0;
            } else if (c == ']') {
                int num = Integer.parseInt(stack.pop());
                String lastStr = stack.pop();
                currentStr = new StringBuilder(lastStr + currentStr.toString().repeat(num));
            } else {
                currentStr.append(c);
            }
        }

        return currentStr.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String encodedString = "3[a2[c]]";
        String decodedString = decodeString(encodedString);
        System.out.println(decodedString); // Output: "accaccacc"
    }
}

 */