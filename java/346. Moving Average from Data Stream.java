public class MovingAverage {
    
    private long sum;
    private int[] window;
    private int count;
        
    public MovingAverage(int size) {
        window = new int[size];
        sum = 0;
        count = 0;
    }
    
    public double next(int val) {
        sum += val;
        if(count >= window.length){
            sum -= window[count%window.length];
        }
        window[count%window.length] = val;
        count ++;
        return  count > window.length ? (double)sum/window.length : (double)sum/count;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
