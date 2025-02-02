import java.util.*;
public class firstLast{

    public static List<List<Integer>> findSubarrays(int[] arr) {
        List<List<Integer>> subarrays = new ArrayList<>();

        List<Integer> subarray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i; j < arr.length; j++) {
                subarray.add(arr[j]);
                subarrays.add(new ArrayList<>(subarray));
            }
        }

        return subarrays;
    }
    public static void main(String Args[])
    {
        int[] arr = {1, 1, 2, 1, 1};
        List<List<Integer>> subarrays = findSubarrays(arr);
        System.out.println("All subarrays:");
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
    }
