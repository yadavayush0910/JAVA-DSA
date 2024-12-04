public class RainWaterTrap {
    public static int trappedRainWater(int[] heights) {
        int n = heights.length;
        
        // Array to store the maximum height from the left up to each index
        int LeftSubArray[] = new int[n];
        LeftSubArray[0] = heights[0];
        for(int i = 1; i < n; i++) {
            LeftSubArray[i] = Math.max(heights[i], LeftSubArray[i - 1]);
        }

        // Array to store the maximum height from the right up to each index
        int RightSubArray[] = new int[n];
        RightSubArray[n - 1] = heights[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            RightSubArray[i] = Math.max(heights[i], RightSubArray[i + 1]);
        }

        int totalTrappedRainWater = 0;
        
        // Calculate the trapped water at each index
        for(int i = 0; i < n; i++) {
            totalTrappedRainWater += Math.min(LeftSubArray[i], RightSubArray[i]) - heights[i];
        }

        return totalTrappedRainWater;
    }

    public static void main(String[] args) {
        int heights[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(heights));  // Output will be the total trapped water
    }
}
