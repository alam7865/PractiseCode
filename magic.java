import java.util.*;
public class magic {
    public static void main(String[] args) {
        int n = sc.nextInt();
		int arr[] = sc.readArray(n);
		int k = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i]>0) {
				if(i+k<n) {
					arr[i+k] = arr[i]+arr[i+k];
					arr[i] = 0;
				}
			}
		}
		int i = n-1;
		while(k-->0) {
			max = Math.max(max, arr[i]);
			i--;
		}
		
		out.println(max);
    }
}
