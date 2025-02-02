import java.util.*;

public class commonElem {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

//         1 1 5 5
// 0 1 2 3
// 4
// 0
// 1
// 2
// 3
        int a[]={4,10,2,9,3,4,1,9,8};
        int b[]={7,3,9,2,10,10,3,4,4};

        int q[]={5,7,2};
        Arrays.sort(b);

        // for(int i=0;i<b.length;i++)
        // {
        //     System.out.print(b[i]+" ");
        // }


        for(int i=0;i<q.length;i++)
        {
            int x=a[q[i]];
            int ans=0;
            int low=0;
            int high=b.length-1;

            while (low<=high) {
                int mid=(low+high)/2;

                if(b[mid]==x)
                {
                    // System.out.println(mid+1);
                    ans=mid;
                    System.out.println(ans+" "+"Sab1");
                    break;
                }
                else if(b[mid]>x)
                {
                    high=mid-1;
                }
                else{
                    ans=mid;
                    low=mid+1;
                }
            }
            list.add(ans+1);
            System.out.println(ans+" "+"Sab");
        }

        
    }
}
