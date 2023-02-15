import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 유저, 신고유저(중복제거를 위해 Set) Map
        Map<String, Set<String>> list = new HashMap<>();
        // 유저, 결과 메일 수 Map
        Map<String, Integer> count = new HashMap<>();
        
        // 리스트 초기화
        for(int i = 0; i < id_list.length; i++) {
            list.put(id_list[i], new HashSet<String>());
            count.put(id_list[i], 0);
        }
        
        // 신고결과 저장
        for(String rep : report) {
            String id = rep.split(" ")[1];
            String rep_id = rep.split(" ")[0];
            
            list.get(id).add(rep_id);
        }
        
        // 신고받은 횟수가 k 이상일 경우, 신고유저 결과값 +1 
        for(String id : id_list) {
            if(list.get(id).size() >= k) {
                for(String rep_id : list.get(id)) {
                    count.put(rep_id, count.get(rep_id) + 1);
                }
            }
        }
        
        // id_list 순서대로 결과 저장
        for(int i = 0; i < id_list.length; i++) {
            answer[i] = count.get(id_list[i]);
        }
        
        return answer;
    }
}