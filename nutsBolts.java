import java.util.*;
public class nutsBolts {
    public static void main(String args[])
    {
        char nuts[]={'@','%','$','#','^'};
        char bolts[]={'%','@','#','$','^'};
        Arrays.sort(nuts);
        Arrays.sort(bolts);
        for(int i=0;i<nuts.length;i++)
        {
            System.out.print(nuts[i]+" ");
        }
        System.out.println();
        for(int i=0;i<bolts.length;i++)
        {
            System.out.print(bolts[i]+" ");
        }
    }
}
