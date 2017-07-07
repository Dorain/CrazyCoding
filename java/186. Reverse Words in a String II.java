public class Solution {
    public void reverseWords(char[] s) {
        // reverse whole string first, then reverse each word
        swapWord(s, 0, s.length-1);
        int preSpaceIdx = 0, postSpaceIdx = -1;
        while(postSpaceIdx++ < s.length-1){
            if(s[postSpaceIdx] == ' '){
                swapWord(s, preSpaceIdx, postSpaceIdx-1);
                preSpaceIdx = postSpaceIdx+1;
            }
        }
        swapWord(s, preSpaceIdx, s.length-1);
    }
    public void swapWord(char[] s, int pre, int post){
        while(pre < post){
            char tmp = s[pre];
            s[pre++] = s[post];
            s[post--] = tmp;
        }
    }
}
