public class Solution {
    public String originalDigits(String s) {
        // from english perdpective, consider the frequency of each character
        int[] count = new int[10];
        for(int i = 0; i< s.length(); i++){
            switch (s.charAt(i)){
                case 'z': 
                    count[0]++;
                    break;
                case 'w':
                    count[2]++;
                    break;
                case 'x':
                    count[6]++;
                    break;
                case 's':
                    count[7]++;
                    break;
                case 'g':
                    count[8]++;
                    break;
                case 'u':
                    count[4]++;
                    break;
                case 'f':
                    count[5]++;
                    break;
                case 'h':
                    count[3]++;
                    break;
                case 'i':
                    count[9]++;
                    break;
                case 'o':
                    count[1]++;
                    break;
                default:
                    break;
            }
        }
        count[7] -= count[6];
        count[5] -= count[4];
        count[3] -= count[8];
        count[9] = count[9] - count[8] - count[5] - count[6];
        count[1] = count[1] - count[0] - count[2] - count[4];
        String ans = new String();
        for (int i = 0; i <= 9; i++){
            while(count[i]>0){
                ans += i;
                count[i]--;
            }
        }
        return ans;
    }
}