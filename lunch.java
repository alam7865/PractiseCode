import java.util.*;

public class lunch {
    public static void main(String[] args) {
       int student[]={1,1,1,1,0,0,1,1,1,0,0,0,0,0,0,0,1};
       int sandwitch[]={0,1,0,0,1,0,1,0,0,0,1,0,1,0,0,0,0};
       int n=student.length;

       Queue<Integer>q1=new LinkedList<>();
       Queue<Integer>q2=new LinkedList<>();

        int arr1[]=new int[2];
        int studen1_0=0;
        int studen1_1=0;
       for(int i=0;i<student.length;i++)
       {
            if(student[i]==0)
            {
                studen1_0++;
            }

            if(student[i]==1)
            {
                studen1_1++;
            }
            q1.add(student[i]);
       }

       arr1[0]=studen1_0;
       arr1[1]=studen1_1;



       int arr2[]=new int[2];
       int sandwitch_0=0;
       int sandwitch_1=0;
       for(int i=0;i<sandwitch.length;i++)
       {
        if(sandwitch[i]==0)
        {
            sandwitch_0++;
        }

        if(sandwitch[i]==1)
        {
            sandwitch_1++;
        }
            q2.add(sandwitch[i]); 
       }

       arr2[0]=sandwitch_0;
       arr2[1]=sandwitch_1;


       int count=0;

       while (!q1.isEmpty()) {
            int x=q1.peek();
            int y=q2.peek();

            if(x==y)
            {
                q1.remove();
                q2.remove();

                arr1[y]--;
                arr2[x]--;
                count++;
            }
            else{
                if((arr1[y]>0 && arr1[x]>0) && (arr2[y]>0 && arr2[x]>0))
                {
                    int a=q1.remove();
                    q1.add(a);
                }
                else{
                    System.out.println(n-count);
                    break;
                }
            }
       }
      
        System.out.println("Last "+0);
    }
}
