public class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        // string is immutatble, have to copy string anyway
        char[] slist = s.toCharArray(); //O(n)
        for(int i = 0, j = slist.length-1; i < j;){
            if(!set.contains(slist[i])){
                i++;
                continue;
            }
            if(!set.contains(slist[j])){
                j--;
                continue;
            }
            char tmp = slist[i];
            slist[i++] = slist[j];
            slist[j--] = tmp;
        }
        return String.valueOf(slist);
    }
}
