public class Solution {
    public List<String> findStrobogrammatic(int n) {
        // 1 and 8 would be fine, 6 and 9 should be in parallel position
        // consider only a half; consider only 18690; if n is odd, the middle number is 0/1/8
        return stroBogrammaticMaker(n, n);
        
    }
    public List<String> stroBogrammaticMaker(int n, int target){
        if (n == 0) return new ArrayList<String>(Arrays.asList(""));
        if (n == 1) return new ArrayList<String>(Arrays.asList("0", "1", "8"));
        List<String> preList = stroBogrammaticMaker(n-2, target);
        List<String> curList = new ArrayList<String>();
        
        //add element to each string in preList
        for(String s: preList){
            curList.add("1"+s+"1");
            curList.add("8"+s+"8");
            curList.add("6"+s+"9");
            curList.add("9"+s+"6");
            if(n!=target) curList.add("0"+s+"0");
        }
        return curList;
    }
}
