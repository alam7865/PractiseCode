public class maxNum {
    public static void main(String args[])
    {
        int num=9996;

        StringBuilder sb=new StringBuilder();

        while (num!=0) {
            int x=num%10;
            sb.append(x);
            num=num/10;
        }

        sb.reverse();
        String str=sb.toString();

        boolean isgreat=true;
        // System.out.println('1'-'0');


        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            int x=c-'0';

            if(x==6)
            {
                isgreat=false;
                ans=(ans*10)+9;
            }
            else{
                ans=(ans*10)+x;
            }
        }

        
    }
}
