import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // 가능한 단어
        String[] possible = {"aya", "ye", "woo", "ma"};
        
        for(String bab : babbling) {
            for(int i = 0; i < possible.length; i++)
                bab = bab.replaceAll(possible[i], Integer.toString(i)); // 가능한 단어->각 인덱스로 변환
            answer += isAnswer(bab);
        }
        
        return answer;
    }
    
    public int isAnswer(String str) { // 발음할 수 있으면 1, 없으면 0 반환
        if(str.matches("^[0-9]*$")) { // 숫자만 있음
            for(int i = 0; i+1 < str.length(); i++) {
                if(str.charAt(i) == str.charAt(i+1)) // 연속된 숫자가 있음 (불가능)
                    return 0;
            }
        } else { // 숫자말고 문자도 있음 (불가능)
            return 0;
        }
        
        return 1; // 숫자만 있고 연속된 숫자가 없음 (가능)
    }
}