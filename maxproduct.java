import java.util.*;
public class maxproduct {
    public static void main(String[] args) {
        int arr[]={-1,1,0,-3,3};
        int arr1[]=new int[arr.length];
        boolean iszeroPres=false;

        int product=1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                iszeroPres=true;
            }
            if(arr[i]!=0)
            {
                product*=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr1[i]=product;
            }
            else{
                if(iszeroPres==true)
                {
                    arr1[i]=0;
                }
                else{
                    arr1[i]=product/arr[i];
                }
                
            }

            System.out.print(arr1[i]+" ");
        }

        // Arrays.fills(0)
    }
}


// class Solution {
//     public int[] productExceptSelf(int[] arr) {

//         int arr1[] = new int[arr.length];
//         boolean iszeroPres = false;
//         int count=0;

//         int product = 1;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 0) {
//                 iszeroPres = true;
//                 count++;
//             }
//             if (arr[i] != 0) {
//                 product *= arr[i];
//             }
//         }

//         if(count==arr.length)
//         {
//             return arr1;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 0) {
//                 arr1[i] = product;
//             } else {
//                 if (iszeroPres == true) {
//                     arr1[i] = 0;
//                 } else {
//                     arr1[i] = product / arr[i];
//                 }

//             }

//         }

//         return arr1;
//     }
// }
