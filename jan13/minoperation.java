import java.util.*;

public class minoperation {
    // public static int solve(int n, int step) {
    // if (n == 0) {
    // return step;
    // }

    // if (n % 2 != 0) {
    // n = n - 1;
    // } else {
    // n = n / 2;
    // }
    // step++;
    // int left = solve(n, step);
    // int right = solve(n, step);
    // return Math.min(left, right);
    // }

    // public static int solve(int n) {
    // // Create a DP array to store the minimum operations to reduce each number to
    // 0
    // int[] dp = new int[n + 1];

    // // Base case: It takes 0 operations to reduce 0 to 0
    // dp[0] = 0;

    // for (int i = 1; i <= n; i++) {
    // // Option 1: Subtract 1
    // dp[i] = dp[i - 1] + 1;

    // // Option 2: If the number is divisible by 2, divide by 2
    // if (i % 2 == 0) {
    // dp[i] = Math.min(dp[i], dp[i / 2] + 1);
    // }
    // }

    // // The answer will be in dp[n]
    // System.out.println(Arrays.toString(dp));
    // return dp[n];
    // }

    public static void main(String[] args) {
        // int n = 6;

        // int ans = solve(n);
        // System.out.println("Result: " + ans);

        // String message[] = { "l", "i", "l", "i", "l" };
        // String bannedWords[] = { "d", "a", "i", "v", "a" };
        // HashMap<String, Integer> map = new HashMap<>();
        // HashMap<String, Integer> map1 = new HashMap<>();

        // for (int i = 0; i < message.length; i++) {
        // map.put(message[i], map.getOrDefault(message[i], 0) + 1);
        // }

        // for (int i = 0; i < bannedWords.length; i++) {
        // map1.put(bannedWords[i], map.getOrDefault(bannedWords[i], 0) + 1);
        // }

        // int count = 0;

        // for (Map.Entry<String, Integer> set : map.entrySet()) {
        // String key1 = set.getKey();
        // int value = set.getValue();
        // if (map1.containsKey(key1)) {
        // count += value;
        // }
        // }

        // if (count >= 2) {
        // // return true;
        // System.out.println("true");
        // }

        // // return false;
        // System.out.println("False");

        /////////////////////////////////////////////////
        // int n = workerTimess.length;
        // int[] workerHeights = new int[n]; // Track the heights each worker will
        // /////////////////////////////////////////////// reduce

        // // Distribute the work (mountainHeight) among the workers
        // for (int i = 0; i < mountainHeights; i++) {
        // workerHeights[i % n]++; // Distribute one unit of height to each worker in a
        // // round-robin fashion
        // }

        // int maxTimes = 0;

        // // Calculate the time taken by each worker and track the maximum time
        // for (int i = 0; i < n; i++) {
        // int workerTime = calculateTime(workerTimess[i], workerHeights[i]);
        // maxTimes = Math.max(maxTimes, workerTime); // Find the maximum time
        // }

        // return maxTimes;

        System.out.println(3 % 4);
    }
}
