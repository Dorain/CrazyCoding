public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> rs = new ArrayList<>();
        // better when evaluating statement doesnt meet the first round
        for(int i = -1; (i = s.indexOf("++", i+1)) > -1;){
            rs.add(s.substring(0,i) +"--"+s.substring(i+2));
        }
        // int i = -1;
        // do{
        //     i = s.indexOf("++", i+1);
        //     if(i < 0) break;
        //     rs.add(s.substring(0,i) +"--"+s.substring(i+2));
        // }while(i>-1);
        return rs;
    }
}
