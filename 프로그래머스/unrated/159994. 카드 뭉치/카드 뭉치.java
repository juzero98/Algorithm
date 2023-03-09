import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        // 배열 -> 리스트로 변환
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(cards1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(cards2));
        
        for(String go : goal) {
            if(list1.size() > 0 && list1.get(0).equals(go)) {
                list1.remove(0);
                continue;
            }
            else if(list2.size() > 0 &&  list2.get(0).equals(go)) {
                list2.remove(0);
                continue;
            }
            return "No";
        }
        
        return "Yes";
    }
}