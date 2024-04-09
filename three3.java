import java.util.*;
public class three3 {
    public static void main(String[] args) {
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        Stack<Integer>s3=new Stack<>();

        // stack 1
        s1.push(1);
        s1.push(1);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        // stack 2
        s2.push(2);
        s2.push(3);
        s2.push(4);
        // stack 3
        s3.push(1);
        s3.push(4);
        s3.push(5);
        s3.push(2);


        //////////////////////////////////////////////////////
        int arr1[]={1,1,1,2,3};
        int arr2[]={2,3,4};
        int arr3[]={1,4,5,2};

        int sum1=0;
        int sum2=0;
        int sum3=0;

        
        for(int i=0;i<arr1.length;i++)
        {
            sum1+=arr1[i];
        }

        for(int i=0;i<arr2.length;i++)
        {
            sum2+=arr2[i];
        }

        for(int i=0;i<arr3.length;i++)
        {
            sum3+=arr3[i];
        }

        // System.out.println(sum1);
        // System.out.println(sum2);
        // System.out.println(sum3);



        while (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {
            if(sum1==sum2 && sum2==sum3)
            {
                System.out.println("Result: "+sum1);
                break;
            }

            if(sum1>sum2 && sum1>sum3)
            {
                int num=s1.pop();
                sum1-=num;
            }
            else if(sum2>sum1 && sum2>sum3)
            {
                int num=s2.pop();
                sum2-=num;
            }
            else if(sum3>sum1 && sum3>sum2)
            {
                int num=s3.pop();
                sum3-=num;
            }
        }
    }
}
