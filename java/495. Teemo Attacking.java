public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        if(timeSeries == null || timeSeries.length == 0) return result;
        for(int i = 0; i<timeSeries.length-1; i++){
            if(timeSeries[i+1]-timeSeries[i] < duration) result+=timeSeries[i+1]-timeSeries[i];
            else result+= duration;
        }
        result += duration;
        return result;
    }
}