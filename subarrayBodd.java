import java.util.*;

public class subarrayBodd {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 1, 1 };
        int k = 3;
        // HashMap<Integer,Integer>map=new HashMap<>();
        // int n=arr.length;
        // int count=0;
        // int k=2;
        // int result=0;

        // int x=0;
        // while (x<n) {
        // if(arr[i]%2!=0)
        // {
        // count++;
        // }
        // if(count==k)
        // {
        // result=k;
        // break;
        // }
        // x++;
        // }

        // for(int i=0;i<)

        // int ans=0;
        // for(int i=0;i<arr.length;i++)
        // {
        // int count=0;
        // for(int j=i;j<arr.length;j++)
        // {
        // if(arr[j]%2!=0)
        // {
        // count++;
        // }

        // if(count==3)
        // {
        // ans++;
        // for(int x=i;x<=j;x++)
        // {
        // System.out.print(arr[x]+" ");
        // }
        // System.out.println();
        // }
        // }
        // }

        int s = 0, e = nums.length;

        for (int i = 0; i < e; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }

        Map<Integer, Integer> p = new HashMap();

        p.put(0, 1);
        int ans = 0, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (p.containsKey(sum - k)) {
                ans += p.get(sum - k);
            }
            p.put(sum, p.getOrDefault(sum, 0) + 1);
        }
        // System.out.println(ans);

        for (Map.Entry<Integer, Integer> set : p.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }
    }
}
