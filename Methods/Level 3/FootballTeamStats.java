import java.util.*;

public class FootballTeamStats {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        int sum = getSum(heights);
        double mean = getMean(heights);
        int shortest = getShortest(heights);
        int tallest = getTallest(heights);

        System.out.println("Heights of players: " + Arrays.toString(heights));
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static double getMean(int[] arr) {
        return getSum(arr) / (double) arr.length;
    }

    public static int getShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        return min;
    }

    public static int getTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }
}
