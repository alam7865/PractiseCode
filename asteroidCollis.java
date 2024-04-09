import java.util.*;
public class asteroidCollis {
    public static void main(String[] args) {
        int arr[]={3,5,-3};
        int N=arr.length;


        Stack<Integer>s=new Stack<>();

        for(int i=0;i<N;i++)
        {
            if(arr[i]>0)
            {
                s.push(arr[i]);
            }
            else{

                while(!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(arr[i]))
                {
                    s.pop();
                }
            

            if(!s.isEmpty() && s.peek()>0 && s.peek()==Math.abs(arr[i]))
            {
                s.pop();
            }
            else{
                if(s.isEmpty() || s.peek()<0)
                {
                    s.push(arr[i]);
                }
            }

        }
        }






        // for(int i=0;i<N;i++)
        // {
        //     if(arr[i]>0)
        //     {
        //         s.push(arr[i]);
        //     }
            
        //    else{
        //         while(!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(arr[i]))
        //     {
        //         s.pop();
        //     }
            
        //     if(!s.isEmpty() && s.peek()>0 && s.peek()==Math.abs(arr[i]))
        //     {
        //         s.pop();
        //     }
            
        //     else{
        //         if(s.isEmpty() || s.peek()<0)
        //         {
        //             s.push(arr[i]);
        //         }
        //     }
        //    }
        // }

        // System.out.println(st.size());
        // System.out.println(st.peek());


        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
