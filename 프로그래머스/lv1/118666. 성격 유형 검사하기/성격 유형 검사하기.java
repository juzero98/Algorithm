import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] type = {"R", "T", "C", "F", "J", "M", "A", "N"};
        // HashMap : 순서대로 저장 X
        // LinkedHanshMap : 순서대로 저장 O
        Map<String, Integer> score = new LinkedHashMap<>();
        for(int i = 0; i < 8; i++) {
            score.put(type[i], 0);
        }
        
        for(int i = 0; i < survey.length; i++) {
            String first = survey[i].split("")[0];    
            String second = survey[i].split("")[1];
            
            if (choices[i] < 4) { // 1~3
                score.put(first, score.get(first) + (4 - choices[i]));
            } else if (choices[i] > 4) { // 5~7
                score.put(second, score.get(second) + (choices[i] - 4));
            } // 4일 때는 점수변화 없음
        
        }
        // System.out.println(score.toString());
        for(int i = 0; i < 8; i += 2) {
            if(score.get(type[i]) == score.get(type[i+1])) { // 두 점수가 같으면
                answer += type[i].charAt(0) < type[i+1].charAt(0) ? type[i] : type[i+1]; // 사전 빠른 순
            } else {
                answer += score.get(type[i]) > score.get(type[i+1]) ? type[i] : type[i+1];    
            }
        }
        
        return answer;
    }
}