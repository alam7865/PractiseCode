import java.util.*;
public class equal3stack {
    public static void main(String[] args) {
        // int S1[]={4,2,3};
        // int S2[]={1,1,2,3};
        // int S3[]={1,4};

        int S1[]={4,7};
        int S2[]={10};
        int S3[]={1,2,3};

        int N1=S1.length;
        int N2=S2.length;
        int N3=S3.length;

        // sum of each array
        int sum1=0;
        int sum2=0;
        int sum3=0;


        for(int i=0;i<N1;i++)
        {
            sum1+=S1[i];
        }

        for(int i=0;i<N2;i++)
        {
            sum2+=S2[i];
        }

        for(int i=0;i<N3;i++)
        {
            sum3+=S3[i];
        }


        int i=0;
        int j=0;
        int k=0;

        while (i<N1 && j<N2 && k<N3) {
            
            if(sum1==sum2 && sum2==sum3)
            {
                System.out.println("Both Same : "+sum1);
                break;
            }
            else if(sum1>sum2 && sum1>sum3)
            {
                sum1-=S1[i++];
            }
            else if(sum2>sum3 && sum2>sum1)
            {
                sum2-=S2[j++];
            }
            else if(sum3>sum1 && sum3>sum2)
            {
                sum3-=S3[k++];
            }
        }

        System.out.println("Not Equal");
    }
}
