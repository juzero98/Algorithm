import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        Map<String, String> map = new HashMap<>();
        map.put("0","5");
        map.put("2","0");
        map.put("5","2");
        
        for(String a : rsp.split("")) {
            answer += map.get(a);
        }
        
        return answer;
    }
}