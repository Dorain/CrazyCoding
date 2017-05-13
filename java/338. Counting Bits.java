public class Solution {
    public int[] countBits(int num) {
        // O(n) time O(n) space without builtin function
        // clearly dynamic programming
        // for any number 1**** = 1 + ****, every 2^n as a circle
        int[] ans = new int[num+1];
        ans[0] = 0;
        int idx = 0, flag = 1;
        
        // while(flag+idx){
        //     idx = 0;
        //     while(idx < flag){
        //         if(flag + idx >= num) break;
        //         ans[flag + idx ] = ans[idx] + 1;
        //         idx++;
        //     }
        //     flag *= 2;
        // }
        for(idx = 1; idx <= num; idx++){
            flag = flag*2 == idx ? flag*2 : flag;
            ans[idx] = ans[idx-flag] + 1;
        }
        return ans;
    }
}