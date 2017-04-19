public class Solution {
    public int countPrimes(int n) {
        boolean[] noPrime = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(noPrime[i]==false){
                count ++;
                for(int j = i; j < n; j+= i){
                    noPrime[j] = true;
                }
            }
        }
        return count;
    }
}