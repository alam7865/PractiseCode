import java.util.*;

public class wateringPlant {
    public static void main(String[] args) {
        int plants[] = { 2, 2, 3, 3 };
        int capacity = 5;
        int count = 0;

        for (int i = 0; i < plants.length; i++) {
            int x = i + 1;
            if (capacity >= plants[i]) {
                capacity -= plants[i];
            } else {
                count += (x * 2) - 2;
                capacity = 5;
                capacity -= plants[i];
            }
            count++;

        }

        System.out.println("Result:" + count);
    }
}
