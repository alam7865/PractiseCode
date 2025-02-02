public class shortPath {
    public static void main(String args[])
    {
        int n=100;
        int count=0;

        while (n!=1) {
            if(n%3==0)
            {
                count++;
                n=n/3;
            }
            else{
                count++;
                n=n-1;
            }
        }

        System.out.println(count);
    }
}
