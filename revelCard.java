import java.util.*;
public class revelCard {
    public static void main(String args[])
    {
        // int deck[]={17,13,11,2,3,5,7};
        int deck[]={1,1000};
        
        int n=deck.length;
        int arr[]=new int[n];

        Arrays.sort(deck);
        // Queue<Integer>q=new LinkedList<>();

        // for(int i=0;i<deck.length;i++)
        // {
        //     q.add(deck[i]);
        // }


        int x=0;
        int i=0;
        boolean isfilled=false;

        while (i<n) {
            x%=n;

            if(arr[x]==0 && isfilled==false)
            {
                arr[x]=deck[i];
                i++;
                isfilled=true;
            }
            else{
                if(arr[x]==0 && isfilled==true)
                {
                    isfilled=false;
                }
            }

            x++;
        }
        

        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
