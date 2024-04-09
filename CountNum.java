import java.util.*;
public class CountNum {
    public static void main(String[] args) {
        int arr[]={5,7,1,2,6,0};

        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            st.push(arr[i]);
        }

        for(int i=arr.length-1;i>=0;i--)
        {
            int num=arr[i];
            while (!st.isEmpty() && st.peek()<=arr[i]) {
                st.pop();
            }

            if(!st.isEmpty() && st.peek()>arr[i])
            {
                arr[i]=st.peek();
            }
            else{
                arr[i]=-1;
            }

            st.push(num);
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
