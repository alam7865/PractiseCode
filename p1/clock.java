import java.util.*;
public class clock {
    public static void main(String[] args) {
        String s="1?:?4";
        // char a=str.charAt(0);
        // char b=str.charAt(1);

        // char c=str.charAt(3);
        // char d=str.charAt(4);


     
        //     if(a=='?')
        //     {
        //       a='1';
        //     }
        //     if(b=='?')
        //     {
        //          if(a=='0')
        //          {
        //              b='9';
        //          }
        //          else{
        //              b='1';
        //          }
        //     }
     
        //     if(c=='?')
        //     {
        //          c='5';
        //     }
        //     if(d=='?')
        //     {
        //      d='9';
        //     }
       
        //     // System.out.println(a);
        //     String a1=Character.toString(a);
        //     String b1=Character.toString(b);
        //     String c1=Character.toString(c);
        //     String d1=Character.toString(d);

        //     String ans=a1+b1+":"+c1+d1;
        //     System.out.println(ans);
     

        char c[] = s.toCharArray();
		
		if(c[0]=='?') {
			if(c[1]=='?') {
				c[0]='1';
				c[1]='1';
			}else {
				if(c[1]=='0' || c[1]=='1') {
					c[0]='1';
				}else {
					c[0]='0';
				}
			}
		}else {
			if(c[1]=='?') {
				if(c[0]=='1') {
					c[1]='1';
				}else {
					c[1] = '9';
				}
			}
		}
		
		if(c[3]=='?') {
			if(c[4]=='?') {
				c[3]='5';
				c[4]='9';
			}else {
				c[3] = '5';
			}
		}else {
			if(c[4]=='?') {
				c[4] = '9';
			}
			
		}

		StringBuilder sb = new StringBuilder();
		for(char i : c) {
			sb.append(i);
		}
		
        System.out.println(sb.toString());

    }
}
