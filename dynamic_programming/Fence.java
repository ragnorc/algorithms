//Fenc problem: http://codeforces.com/problemset/problem/363/B 

import java.math.*;

public class Fence {

    public static void main(String[] args) {

        // Parse numbers from command line 
        int numPlanks = Integer.parseInt(args[0]);
        int widthPiano = Integer.parseInt(args[1]);
        int heights[] = new int[numPlanks];
        for (int i = 0; i < numPlanks; i++) {
            heights[i] = Integer.parseInt(args[2 + i]);
        }

        int currentSum = getInitialSum(widthPiano, heights);
        int minheight = currentSum;
        int minIndex = 0;
        for (int i = 1; i <= heights.length - (widthPiano); i++) {
            currentSum = currentSum - heights[i - 1] + heights[i + (widthPiano - 1)];
            if (currentSum < minheight) {
                minheight = currentSum;
                minIndex = i;

            }

        }
        System.out.println("Pass piano at index: " + minIndex);
    }

    private static int getInitialSum(int n, int[] arr) {

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;

    }

}