class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = areaFinder(height, i, j);
        int curr = 0;

        while(i < j){
            if(height[j] < height[i]){
                j--;
                curr = areaFinder(height, i, j);
            }
            else if(height[j] >= height[i]){
                i++;
                curr = areaFinder(height, i, j);
                System.out.println(i);
            }
            if(max < curr){
                max = curr;
            }
        }
        return max;
    }

    public int areaFinder(int[] height, int i, int j){
        return Math.min(height[i], height[j]) * (j - i);
    }
}